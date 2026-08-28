package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzvd {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i9) {
        if (!zze(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + 55232);
                cArr[i9 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw new zzsx("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i9) {
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
                cArr[i9] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw new zzsx("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i9) {
        if (b10 < -62 || zze(b11)) {
            throw new zzsx("Protocol message had invalid UTF-8.");
        }
        cArr[i9] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
