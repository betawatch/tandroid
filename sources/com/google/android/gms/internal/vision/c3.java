package com.google.android.gms.internal.vision;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c3 extends e1 {
    public final /* synthetic */ int b;

    public /* synthetic */ c3(int i3) {
        this.b = i3;
    }

    public static int B(long j10, byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            e1 e1Var = a3.a;
            if (i3 > -12) {
                return -1;
            }
            return i3;
        }
        if (i10 == 1) {
            byte a10 = x2.a(j10, bArr);
            e1 e1Var2 = a3.a;
            if (i3 > -12 || a10 > -65) {
                return -1;
            }
            return (a10 << 8) ^ i3;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte a11 = x2.a(j10, bArr);
        byte a12 = x2.a(j10 + 1, bArr);
        e1 e1Var3 = a3.a;
        if (i3 > -12 || a11 > -65 || a12 > -65) {
            return -1;
        }
        return (a12 << 16) ^ ((a11 << 8) ^ i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // com.google.android.gms.internal.vision.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(String str, byte[] bArr, int i3, int i10) {
        int i11;
        int i12;
        char charAt;
        long j10;
        long j11;
        long j12;
        int i13;
        char charAt2;
        switch (this.b) {
            case 0:
                int length = str.length();
                int i14 = i10 + i3;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i3) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i3 + i15;
                while (i15 < length) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) charAt3;
                        i16++;
                    } else if (charAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i11)))) {
                                    throw new b3(i15, length);
                                }
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt3);
                                sb2.append(" at index ");
                                sb2.append(i16);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | hs.P3);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new b3(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((charAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((charAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j13 = i3;
                long j14 = i10 + j13;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i3) {
                    char charAt5 = str.charAt(length2 - 1);
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Failed writing ");
                    sb3.append(charAt5);
                    sb3.append(" at index ");
                    sb3.append(i3 + i10);
                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                }
                int i21 = 0;
                while (true) {
                    j10 = 1;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        x2.e(bArr, j13, (byte) charAt2);
                        i21++;
                        j13 = 1 + j13;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt6 = str.charAt(i21);
                        if (charAt6 < 128 && j13 < j14) {
                            x2.e(bArr, j13, (byte) charAt6);
                            j12 = j14;
                            j11 = j10;
                            j13 += j10;
                        } else if (charAt6 >= 2048 || j13 > j14 - 2) {
                            j11 = j10;
                            if ((charAt6 >= 55296 && 57343 >= charAt6) || j13 > j14 - 3) {
                                j12 = j14;
                                if (j13 > j12 - 4) {
                                    if (55296 <= charAt6 && charAt6 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt6, str.charAt(i13)))) {
                                        throw new b3(i21, length2);
                                    }
                                    StringBuilder sb4 = new StringBuilder(46);
                                    sb4.append("Failed writing ");
                                    sb4.append(charAt6);
                                    sb4.append(" at index ");
                                    sb4.append(j13);
                                    throw new ArrayIndexOutOfBoundsException(sb4.toString());
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt7 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt6, charAt7)) {
                                        int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                        x2.e(bArr, j13, (byte) ((codePoint2 >>> 18) | hs.P3));
                                        x2.e(bArr, j13 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        x2.e(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j13 += 4;
                                        x2.e(bArr, j15, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new b3(i21 - 1, length2);
                            }
                            x2.e(bArr, j13, (byte) ((charAt6 >>> '\f') | 480));
                            j12 = j14;
                            long j16 = j13 + 2;
                            x2.e(bArr, j13 + j11, (byte) (((charAt6 >>> 6) & 63) | 128));
                            j13 += 3;
                            x2.e(bArr, j16, (byte) ((charAt6 & '?') | 128));
                        } else {
                            j11 = j10;
                            long j17 = j13 + j11;
                            x2.e(bArr, j13, (byte) ((charAt6 >>> 6) | 960));
                            j13 += 2;
                            x2.e(bArr, j17, (byte) ((charAt6 & '?') | 128));
                            j12 = j14;
                        }
                        i21++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
        }
    }

    @Override // com.google.android.gms.internal.vision.e1
    public final int i(byte[] bArr, int i3, int i10) {
        int i11;
        long j10;
        int i12;
        int i13 = i3;
        byte b10 = -16;
        byte b11 = -62;
        switch (this.b) {
            case 0:
                while (i13 < i10 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i10) {
                    while (i13 < i10) {
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 < 0) {
                            if (b12 < -32) {
                                if (i14 >= i10) {
                                    return b12;
                                }
                                if (b12 >= -62) {
                                    i13 += 2;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b12 >= -16) {
                                if (i14 >= i10 - 2) {
                                    return a3.b(i14, i10, bArr);
                                }
                                int i15 = i13 + 2;
                                byte b13 = bArr[i14];
                                if (b13 <= -65 && (((b13 + 112) + (b12 << 28)) >> 30) == 0) {
                                    int i16 = i13 + 3;
                                    if (bArr[i15] <= -65) {
                                        i13 += 4;
                                        if (bArr[i16] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i14 >= i10 - 1) {
                                return a3.b(i14, i10, bArr);
                            }
                            int i17 = i13 + 2;
                            byte b14 = bArr[i14];
                            if (b14 <= -65 && ((b12 != -32 || b14 >= -96) && (b12 != -19 || b14 < -96))) {
                                i13 += 3;
                                if (bArr[i17] > -65) {
                                }
                            }
                            return -1;
                        }
                        i13 = i14;
                    }
                }
                return 0;
            default:
                int i18 = 2;
                if ((i13 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i10)));
                }
                long j11 = i13;
                int i19 = (int) (i10 - j11);
                if (i19 < 16) {
                    i11 = 0;
                    j10 = 1;
                } else {
                    long j12 = j11;
                    i11 = 0;
                    j10 = 1;
                    while (true) {
                        if (i11 < i19) {
                            long j13 = j12 + 1;
                            if (x2.a(j12, bArr) >= 0) {
                                i11++;
                                j12 = j13;
                            }
                        } else {
                            i11 = i19;
                        }
                    }
                }
                int i20 = i19 - i11;
                long j14 = j11 + i11;
                while (true) {
                    byte b15 = 0;
                    while (true) {
                        if (i20 > 0) {
                            long j15 = j14 + j10;
                            byte a10 = x2.a(j14, bArr);
                            if (a10 >= 0) {
                                i20--;
                                j14 = j15;
                                b15 = a10;
                            } else {
                                j14 = j15;
                                b15 = a10;
                            }
                        }
                    }
                    if (i20 == 0) {
                        return 0;
                    }
                    int i21 = i20 - 1;
                    if (b15 < -32) {
                        if (i21 == 0) {
                            return b15;
                        }
                        i20 -= 2;
                        if (b15 >= b11) {
                            long j16 = j14 + j10;
                            if (x2.a(j14, bArr) <= -65) {
                                j14 = j16;
                                i12 = i18;
                                i18 = i12;
                                b10 = -16;
                                b11 = -62;
                            }
                        }
                    } else if (b15 >= b10) {
                        i12 = i18;
                        if (i21 < 3) {
                            return B(j14, bArr, b15, i21);
                        }
                        i20 -= 4;
                        long j17 = j14 + j10;
                        byte a11 = x2.a(j14, bArr);
                        if (a11 <= -65 && (((a11 + 112) + (b15 << 28)) >> 30) == 0) {
                            long j18 = j14 + 2;
                            if (x2.a(j17, bArr) <= -65) {
                                j14 += 3;
                                if (x2.a(j18, bArr) > -65) {
                                }
                                i18 = i12;
                                b10 = -16;
                                b11 = -62;
                            }
                        }
                    } else {
                        if (i21 < i18) {
                            return B(j14, bArr, b15, i21);
                        }
                        i20 -= 3;
                        long j19 = j14 + j10;
                        byte a12 = x2.a(j14, bArr);
                        if (a12 <= -65 && (b15 != -32 || a12 >= -96)) {
                            int i22 = i18;
                            if (b15 != -19 || a12 < -96) {
                                j14 += 2;
                                if (x2.a(j19, bArr) <= -65) {
                                    i18 = i22;
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    @Override // com.google.android.gms.internal.vision.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String v(int i3, int i10, byte[] bArr) {
        switch (this.b) {
            case 0:
                if ((i3 | i10 | ((bArr.length - i3) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i10)));
                }
                int i11 = i3 + i10;
                char[] cArr = new char[i10];
                int i12 = i3;
                int i13 = 0;
                while (i12 < i11) {
                    byte b10 = bArr[i12];
                    if (b10 < 0) {
                        int i14 = i13;
                        while (i12 < i11) {
                            int i15 = i12 + 1;
                            byte b11 = bArr[i12];
                            if (b11 >= 0) {
                                int i16 = i14 + 1;
                                cArr[i14] = (char) b11;
                                while (i15 < i11) {
                                    byte b12 = bArr[i15];
                                    if (b12 >= 0) {
                                        i15++;
                                        cArr[i16] = (char) b12;
                                        i16++;
                                    } else {
                                        i14 = i16;
                                        i12 = i15;
                                    }
                                }
                                i14 = i16;
                                i12 = i15;
                            } else if (b11 < -32) {
                                if (i15 >= i11) {
                                    throw n1.c();
                                }
                                i12 += 2;
                                e1.o(b11, bArr[i15], cArr, i14);
                                i14++;
                            } else if (b11 < -16) {
                                if (i15 >= i11 - 1) {
                                    throw n1.c();
                                }
                                int i17 = i12 + 2;
                                i12 += 3;
                                e1.n(b11, bArr[i15], bArr[i17], cArr, i14);
                                i14++;
                            } else {
                                if (i15 >= i11 - 2) {
                                    throw n1.c();
                                }
                                byte b13 = bArr[i15];
                                int i18 = i12 + 3;
                                byte b14 = bArr[i12 + 2];
                                i12 += 4;
                                e1.m(b11, b13, b14, bArr[i18], cArr, i14);
                                i14 += 2;
                            }
                        }
                        return new String(cArr, 0, i14);
                    }
                    i12++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                int i142 = i13;
                while (i12 < i11) {
                }
                return new String(cArr, 0, i142);
            default:
                if ((i3 | i10 | ((bArr.length - i3) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i10)));
                }
                int i19 = i3 + i10;
                char[] cArr2 = new char[i10];
                int i20 = i3;
                int i21 = 0;
                while (i20 < i19) {
                    byte a10 = x2.a(i20, bArr);
                    if (a10 < 0) {
                        int i22 = i21;
                        while (i20 < i19) {
                            int i23 = i20 + 1;
                            byte a11 = x2.a(i20, bArr);
                            if (a11 >= 0) {
                                int i24 = i22 + 1;
                                cArr2[i22] = (char) a11;
                                while (i23 < i19) {
                                    byte a12 = x2.a(i23, bArr);
                                    if (a12 >= 0) {
                                        i23++;
                                        cArr2[i24] = (char) a12;
                                        i24++;
                                    } else {
                                        i22 = i24;
                                        i20 = i23;
                                    }
                                }
                                i22 = i24;
                                i20 = i23;
                            } else if (a11 < -32) {
                                if (i23 >= i19) {
                                    throw n1.c();
                                }
                                i20 += 2;
                                e1.o(a11, x2.a(i23, bArr), cArr2, i22);
                                i22++;
                            } else if (a11 < -16) {
                                if (i23 >= i19 - 1) {
                                    throw n1.c();
                                }
                                int i25 = i20 + 2;
                                i20 += 3;
                                e1.n(a11, x2.a(i23, bArr), x2.a(i25, bArr), cArr2, i22);
                                i22++;
                            } else {
                                if (i23 >= i19 - 2) {
                                    throw n1.c();
                                }
                                byte a13 = x2.a(i23, bArr);
                                int i26 = i20 + 3;
                                byte a14 = x2.a(i20 + 2, bArr);
                                i20 += 4;
                                e1.m(a11, a13, a14, x2.a(i26, bArr), cArr2, i22);
                                i22 += 2;
                            }
                        }
                        return new String(cArr2, 0, i22);
                    }
                    i20++;
                    cArr2[i21] = (char) a10;
                    i21++;
                }
                int i222 = i21;
                while (i20 < i19) {
                }
                return new String(cArr2, 0, i222);
        }
    }
}
