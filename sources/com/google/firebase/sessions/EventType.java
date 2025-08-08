package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* loaded from: classes.dex */
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    EventType(int i) {
        this.number = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
