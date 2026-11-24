package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzvf {
    static {
        if (zzvc.zzx() && zzvc.zzy()) {
            int i = zzqa.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        int i5 = bArr[i - 1];
        if (i4 == 0) {
            if (i5 <= -12) {
                return i5;
            }
            return -1;
        }
        if (i4 == 1) {
            int i6 = bArr[i];
            if (i5 > -12 || i6 > -65) {
                return -1;
            }
            i3 = i6 << 8;
        } else {
            if (i4 != 2) {
                wn4.f();
                return 0;
            }
            int i7 = bArr[i];
            int i8 = bArr[i + 1];
            if (i5 > -12 || i7 > -65 || i8 > -65) {
                return -1;
            }
            i3 = i8 << 16;
            i5 ^= i7 << 8;
        }
        return i5 ^ i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r11 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                            throw new zzve(i6, length);
                        }
                        haf.e(charAt2, i7);
                        return 0;
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char charAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i9 = i7 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | kk7.O3);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new zzve(i6 - 1, length);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static int zzc(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new zzve(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        haf.d(i2 + 4294967296L);
        return 0;
    }

    public static String zzd(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!zzvd.zzd(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (zzvd.zzd(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (zzvd.zzd(b3)) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i7 >= i4) {
                        fvc.i("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i3 = i6 + 1;
                    i += 2;
                    zzvd.zzc(b2, bArr[i7], cArr, i6);
                } else if (b2 < -16) {
                    if (i7 >= i4 - 1) {
                        fvc.i("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    zzvd.zzb(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        fvc.i("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    zzvd.zza(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zze(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (bArr[i] < 0) {
                while (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i];
                    if (i4 >= 0) {
                        i = i3;
                    } else if (i4 < -32) {
                        if (i3 >= i2) {
                            return i4 == 0;
                        }
                        if (i4 < -62) {
                            return false;
                        }
                        i += 2;
                        if (bArr[i3] > 65471) {
                            return false;
                        }
                    } else if (i4 < -16) {
                        if (i3 >= i2 - 1) {
                            i4 = zza(bArr, i3, i2);
                            if (i4 == 0) {
                            }
                        } else {
                            int i5 = i + 2;
                            char c = bArr[i3];
                            if (c > 65471) {
                                return false;
                            }
                            if (i4 == -32 && c < 65440) {
                                return false;
                            }
                            if (i4 == -19 && c >= 65440) {
                                return false;
                            }
                            i += 3;
                            if (bArr[i5] > 65471) {
                                return false;
                            }
                        }
                    } else if (i3 >= i2 - 2) {
                        i4 = zza(bArr, i3, i2);
                        if (i4 == 0) {
                        }
                    } else {
                        int i6 = i + 2;
                        int i7 = bArr[i3];
                        if (i7 > -65) {
                            return false;
                        }
                        if ((((i7 + kk7.w1) + (i4 << 28)) >> 30) != 0) {
                            return false;
                        }
                        int i8 = i + 3;
                        if (bArr[i6] > 65471) {
                            return false;
                        }
                        i += 4;
                        if (bArr[i8] > 65471) {
                            return false;
                        }
                    }
                }
                return true;
            }
            i++;
        }
        return true;
    }
}
