package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
