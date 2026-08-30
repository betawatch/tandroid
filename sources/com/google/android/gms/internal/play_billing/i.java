package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
