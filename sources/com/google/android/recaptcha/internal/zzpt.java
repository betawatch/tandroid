package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
