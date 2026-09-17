package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class i {
    public static final h a;

    static {
        h hVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            hVar = new h(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            hVar = new h(1);
        }
        a = hVar;
    }
}
