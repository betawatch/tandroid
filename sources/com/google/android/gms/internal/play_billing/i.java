package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
