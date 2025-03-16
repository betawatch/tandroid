package com.google.android.datatransport;

/* loaded from: classes.dex */
public interface Transport {
    void schedule(Event event, TransportScheduleCallback transportScheduleCallback);

    void send(Event event);
}
