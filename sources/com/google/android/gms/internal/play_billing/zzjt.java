package com.google.android.gms.internal.play_billing;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
abstract class zzjt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        if (zzjq.zzx() && zzjq.zzy()) {
            int i = zzfy.$r8$clinit;
        }
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzb(String str, byte[] bArr, int i, int i2) {
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
                            throw new zzjs(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char charAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i9 = i7 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | NotificationCenter.appConfigUpdated);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new zzjs(i6 - 1, length);
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

    static int zzc(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new zzjs(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zzd(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
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
                if (i7 > -65 || (((i4 << 28) + (i7 + 112)) >> 30) != 0) {
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
}
