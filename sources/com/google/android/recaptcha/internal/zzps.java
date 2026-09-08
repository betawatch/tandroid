package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzps {
    public static long zza(long j3, long j10) {
        long j11 = j3 + j10;
        zzpt.zza(((j3 ^ j10) < 0) | ((j3 ^ j11) >= 0), "checkedAdd", j3, j10);
        return j11;
    }

    public static long zzb(long j3, long j10) {
        long j11 = (-1) + j3;
        zzpt.zza(((1 ^ j3) >= 0) | ((j3 ^ j11) >= 0), "checkedSubtract", j3, 1L);
        return j11;
    }
}
