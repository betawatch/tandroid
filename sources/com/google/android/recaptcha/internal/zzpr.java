package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzpr {
    public static int zza(int i10, int i11, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (zzpq.zza[roundingMode.ordinal()]) {
            case 1:
                zzpt.zzb(false);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i13);
                int abs2 = abs - (Math.abs(i11) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i12 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i12;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static int zzb(int i10, RoundingMode roundingMode) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzpq.zza[roundingMode.ordinal()]) {
            case 1:
                zzpt.zzb(((i10 + (-1)) & i10) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i10) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }
}
