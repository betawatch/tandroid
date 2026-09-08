package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzvd {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!zze(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw new zzsx("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zze(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zze(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw new zzsx("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zze(b11)) {
            throw new zzsx("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
