package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzpt {
    public static void zza(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
    }

    public static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
