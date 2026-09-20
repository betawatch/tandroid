package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
