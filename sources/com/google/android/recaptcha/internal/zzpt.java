package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzpt {
    public static void zza(boolean z9, String str, long j3, long j10) {
        if (z9) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j3 + ", " + j10 + ")");
    }

    public static void zzb(boolean z9) {
        if (!z9) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
