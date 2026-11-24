package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzps {
    public static long zza(long j, long j2) {
        long j3 = j + j2;
        zzpt.zza(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long zzb(long j, long j2) {
        long j3 = (-1) + j;
        zzpt.zza(((1 ^ j) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, 1L);
        return j3;
    }
}
