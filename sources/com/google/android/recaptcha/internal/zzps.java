package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzps {
    public static long zza(long j10, long j11) {
        long j12 = j10 + j11;
        zzpt.zza(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long zzb(long j10, long j11) {
        long j12 = (-1) + j10;
        zzpt.zza(((1 ^ j10) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, 1L);
        return j12;
    }
}
