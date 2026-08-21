package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class zzaz {
    private static final zzbl zza;

    static {
        zzbl zzayVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzayVar = new zzax();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzayVar = new zzay();
        }
        zza = zzayVar;
    }

    public static zzbl zza() {
        return zza;
    }
}
