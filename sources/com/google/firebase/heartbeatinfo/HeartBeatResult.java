package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: classes.dex */
public abstract class HeartBeatResult {
    public static HeartBeatResult create(String str, List list) {
        return new AutoValue_HeartBeatResult(str, list);
    }

    public abstract List getUsedDates();

    public abstract String getUserAgent();
}
