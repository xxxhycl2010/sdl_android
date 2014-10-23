package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.constants.Names;

import java.util.Hashtable;

public class TouchCoord extends RPCStruct {
    public TouchCoord() {}
    
    public TouchCoord(Hashtable<String, Object> hash) {
        super(hash);
    }
    
    public void setX(Integer x) {
        if (x != null) {
            store.put(Names.x, x);
        } else {
        	store.remove(Names.x);
        }
    }
    
    public Integer getX() {
        return (Integer) store.get(Names.x);
    }
    
    public void setY(Integer y) {
        if (y != null) {
            store.put(Names.y, y);
        } else {
        	store.remove(Names.y);
        }
    }
    
    public Integer getY() {
        return (Integer) store.get(Names.y);
    }
    
}