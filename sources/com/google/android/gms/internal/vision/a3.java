package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a3 {
    public static final e1 a;

    static {
        a = (x2.e && x2.d && !m0.a()) ? new c3(1) : new c3(0);
    }

    public static int a(String str) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new b3(i10, length2);
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int b(int i9, int i10, byte[] bArr) {
        byte b10 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
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
}
