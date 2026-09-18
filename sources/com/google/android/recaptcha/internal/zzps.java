package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
