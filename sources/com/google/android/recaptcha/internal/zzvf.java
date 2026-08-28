package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzvf {
    static {
        if (zzvc.zzx() && zzvc.zzy()) {
            int i9 = zzqa.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i9, int i10) {
        int i11 = i10 - i9;
        byte b10 = bArr[i9 - 1];
        if (i11 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i11 == 1) {
            byte b11 = bArr[i9];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i9];
        byte b13 = bArr[i9 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(String str, byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        char charAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i9 + i10;
            if (i14 >= length || (i13 = i14 + i9) >= i11 || (charAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i14++;
        }
        int i15 = i9 + i14;
        while (i14 < length) {
            char charAt2 = str.charAt(i14);
            if (charAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i12 = i14 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                            throw new zzve(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i15);
                    }
                    int i16 = i14 + 1;
                    if (i16 != str.length()) {
                        char charAt3 = str.charAt(i16);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i17 = i15 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i14 = i16;
                        } else {
                            i14 = i16;
                        }
                    }
                    throw new zzve(i14 - 1, length);
                }
                bArr[i15] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static int zzc(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzve(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i9, int i10) {
        int i11;
        int length = bArr.length;
        if ((((length - i9) - i10) | i9 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i12 = i9 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i9 < i12) {
            byte b10 = bArr[i9];
            if (!zzvd.zzd(b10)) {
                break;
            }
            i9++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i9 < i12) {
            int i15 = i9 + 1;
            byte b11 = bArr[i9];
            if (zzvd.zzd(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i9 = i15;
                while (i9 < i12) {
                    byte b12 = bArr[i9];
                    if (zzvd.zzd(b12)) {
                        i9++;
                        cArr[i14] = (char) b12;
                        i14++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i15 >= i12) {
                        throw new zzsx("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i9 += 2;
                    zzvd.zzc(b11, bArr[i15], cArr, i14);
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new zzsx("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i9 + 2;
                    i9 += 3;
                    zzvd.zzb(b11, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new zzsx("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i15];
                    int i17 = i9 + 3;
                    byte b14 = bArr[i9 + 2];
                    i9 += 4;
                    zzvd.zza(b11, b13, b14, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new String(cArr, 0, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zze(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return true;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = bArr[i9];
            if (i12 >= 0) {
                i9 = i11;
            } else if (i12 < -32) {
                if (i11 >= i10) {
                    return i12 == 0;
                }
                if (i12 < -62) {
                    return false;
                }
                i9 += 2;
                if (bArr[i11] > 65471) {
                    return false;
                }
            } else if (i12 < -16) {
                if (i11 >= i10 - 1) {
                    i12 = zza(bArr, i11, i10);
                    if (i12 == 0) {
                    }
                } else {
                    int i13 = i9 + 2;
                    char c10 = bArr[i11];
                    if (c10 > 65471) {
                        return false;
                    }
                    if (i12 == -32 && c10 < 65440) {
                        return false;
                    }
                    if (i12 == -19 && c10 >= 65440) {
                        return false;
                    }
                    i9 += 3;
                    if (bArr[i13] > 65471) {
                        return false;
                    }
                }
            } else if (i11 >= i10 - 2) {
                i12 = zza(bArr, i11, i10);
                if (i12 == 0) {
                }
            } else {
                int i14 = i9 + 2;
                int i15 = bArr[i11];
                if (i15 > -65) {
                    return false;
                }
                if ((((i15 + 112) + (i12 << 28)) >> 30) != 0) {
                    return false;
                }
                int i16 = i9 + 3;
                if (bArr[i14] > 65471) {
                    return false;
                }
                i9 += 4;
                if (bArr[i16] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
