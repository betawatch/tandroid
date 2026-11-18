package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
