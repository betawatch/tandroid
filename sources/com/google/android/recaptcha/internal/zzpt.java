package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
