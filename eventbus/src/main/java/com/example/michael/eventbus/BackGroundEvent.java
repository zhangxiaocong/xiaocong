package com.example.michael.eventbus;

/**
 * Created by Michael on 2016/5/17.
 */
public class BackGroundEvent {
    String msg;

    public BackGroundEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
