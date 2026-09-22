package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
final class zzpt {
    public static void zza(boolean z10, String str, long j3, long j10) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j3 + ", " + j10 + ")");
    }

    public static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
