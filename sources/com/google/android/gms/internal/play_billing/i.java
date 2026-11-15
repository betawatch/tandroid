package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
