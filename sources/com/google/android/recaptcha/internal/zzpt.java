package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzpt {
    public static void zza(boolean z4, String str, long j10, long j11) {
        if (z4) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
