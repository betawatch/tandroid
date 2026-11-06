package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
