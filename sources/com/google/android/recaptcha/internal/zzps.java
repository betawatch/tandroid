package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
