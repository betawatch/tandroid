package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzpr {
    public static int zza(int i9, int i10, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i9 / i10;
        int i12 = i9 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i9 ^ i10) >> 31) | 1;
        switch (zzpq.zza[roundingMode.ordinal()]) {
            case 1:
                zzpt.zzb(false);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i12);
                int abs2 = abs - (Math.abs(i10) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i11 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i11;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int zzb(int i9, RoundingMode roundingMode) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzpq.zza[roundingMode.ordinal()]) {
            case 1:
                zzpt.zzb(((i9 + (-1)) & i9) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i9 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i9);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i9) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i9);
    }
}
