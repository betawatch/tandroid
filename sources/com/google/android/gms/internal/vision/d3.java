package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d3 extends e1 {
    public final /* synthetic */ int b;

    public /* synthetic */ d3(int i10) {
        this.b = i10;
    }

    public static int B(long j3, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            e1 e1Var = b3.a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            byte a2 = y2.a(j3, bArr);
            e1 e1Var2 = b3.a;
            if (i10 > -12 || a2 > -65) {
                return -1;
            }
            return (a2 << 8) ^ i10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte a10 = y2.a(j3, bArr);
        byte a11 = y2.a(j3 + 1, bArr);
        e1 e1Var3 = b3.a;
        if (i10 > -12 || a10 > -65 || a11 > -65) {
            return -1;
        }
        return (a11 << 16) ^ ((a10 << 8) ^ i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // com.google.android.gms.internal.vision.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char charAt;
        long j3;
        long j10;
        long j11;
        int i14;
        char charAt2;
        switch (this.b) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (charAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) charAt;
                    i16++;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char charAt3 = str.charAt(i16);
                    if (charAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) charAt3;
                        i17++;
                    } else if (charAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((charAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i12)))) {
                                    throw new c3(i16, length);
                                }
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt3);
                                sb2.append(" at index ");
                                sb2.append(i17);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char charAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new c3(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((charAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((charAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i10;
                long j13 = i11 + j12;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    char charAt5 = str.charAt(length2 - 1);
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Failed writing ");
                    sb3.append(charAt5);
                    sb3.append(" at index ");
                    sb3.append(i10 + i11);
                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                }
                int i22 = 0;
                while (true) {
                    j3 = 1;
                    if (i22 < length2 && (charAt2 = str.charAt(i22)) < 128) {
                        y2.e(bArr, j12, (byte) charAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char charAt6 = str.charAt(i22);
                        if (charAt6 < 128 && j12 < j13) {
                            y2.e(bArr, j12, (byte) charAt6);
                            j11 = j13;
                            j10 = j3;
                            j12 += j3;
                        } else if (charAt6 >= 2048 || j12 > j13 - 2) {
                            j10 = j3;
                            if ((charAt6 >= 55296 && 57343 >= charAt6) || j12 > j13 - 3) {
                                j11 = j13;
                                if (j12 > j11 - 4) {
                                    if (55296 <= charAt6 && charAt6 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(charAt6, str.charAt(i14)))) {
                                        throw new c3(i22, length2);
                                    }
                                    StringBuilder sb4 = new StringBuilder(46);
                                    sb4.append("Failed writing ");
                                    sb4.append(charAt6);
                                    sb4.append(" at index ");
                                    sb4.append(j12);
                                    throw new ArrayIndexOutOfBoundsException(sb4.toString());
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char charAt7 = str.charAt(i23);
                                    if (Character.isSurrogatePair(charAt6, charAt7)) {
                                        int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                        y2.e(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                        y2.e(bArr, j12 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j14 = j12 + 3;
                                        y2.e(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j12 += 4;
                                        y2.e(bArr, j14, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new c3(i22 - 1, length2);
                            }
                            y2.e(bArr, j12, (byte) ((charAt6 >>> '\f') | 480));
                            j11 = j13;
                            long j15 = j12 + 2;
                            y2.e(bArr, j12 + j10, (byte) (((charAt6 >>> 6) & 63) | 128));
                            j12 += 3;
                            y2.e(bArr, j15, (byte) ((charAt6 & '?') | 128));
                        } else {
                            j10 = j3;
                            long j16 = j12 + j10;
                            y2.e(bArr, j12, (byte) ((charAt6 >>> 6) | 960));
                            j12 += 2;
                            y2.e(bArr, j16, (byte) ((charAt6 & '?') | 128));
                            j11 = j13;
                        }
                        i22++;
                        j3 = j10;
                        j13 = j11;
                    }
                }
                return (int) j12;
        }
    }

    @Override // com.google.android.gms.internal.vision.e1
    public final int i(byte[] bArr, int i10, int i11) {
        long j3;
        int i12;
        int i13 = i10;
        byte b10 = -16;
        byte b11 = -62;
        switch (this.b) {
            case 0:
                while (i13 < i11 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i11) {
                    while (i13 < i11) {
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 < 0) {
                            if (b12 < -32) {
                                if (i14 >= i11) {
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
                                if (i14 >= i11 - 2) {
                                    return b3.b(i14, i11, bArr);
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
                            if (i14 >= i11 - 1) {
                                return b3.b(i14, i11, bArr);
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
                if ((i13 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i11)));
                }
                long j10 = i13;
                int i19 = (int) (i11 - j10);
                if (i19 < 16) {
                    j3 = 1;
                    i12 = 0;
                } else {
                    long j11 = j10;
                    j3 = 1;
                    i12 = 0;
                    while (true) {
                        if (i12 < i19) {
                            long j12 = j11 + 1;
                            if (y2.a(j11, bArr) >= 0) {
                                i12++;
                                j11 = j12;
                            }
                        } else {
                            i12 = i19;
                        }
                    }
                }
                int i20 = i19 - i12;
                long j13 = j10 + i12;
                while (true) {
                    byte b15 = 0;
                    while (true) {
                        if (i20 > 0) {
                            long j14 = j13 + j3;
                            byte a2 = y2.a(j13, bArr);
                            if (a2 >= 0) {
                                i20--;
                                j13 = j14;
                                b15 = a2;
                            } else {
                                j13 = j14;
                                b15 = a2;
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
                            long j15 = j13 + j3;
                            if (y2.a(j13, bArr) <= -65) {
                                j13 = j15;
                                b10 = -16;
                                b11 = -62;
                            }
                        }
                    } else if (b15 < b10) {
                        if (i21 < i18) {
                            return B(j13, bArr, b15, i21);
                        }
                        i20 -= 3;
                        long j16 = j13 + j3;
                        byte a10 = y2.a(j13, bArr);
                        if (a10 <= -65 && ((b15 != -32 || a10 >= -96) && (b15 != -19 || a10 < -96))) {
                            j13 += 2;
                            if (y2.a(j16, bArr) > -65) {
                            }
                        }
                    } else {
                        if (i21 < 3) {
                            return B(j13, bArr, b15, i21);
                        }
                        i20 -= 4;
                        long j17 = j13 + j3;
                        byte a11 = y2.a(j13, bArr);
                        if (a11 <= -65 && (((a11 + 112) + (b15 << 28)) >> 30) == 0) {
                            long j18 = j13 + 2;
                            if (y2.a(j17, bArr) <= -65) {
                                j13 += 3;
                                if (y2.a(j18, bArr) > -65) {
                                }
                                b10 = -16;
                                b11 = -62;
                            }
                        }
                    }
                    i18 = 2;
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
    public final String v(int i10, int i11, byte[] bArr) {
        switch (this.b) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = i10;
                int i14 = 0;
                while (i13 < i12) {
                    byte b10 = bArr[i13];
                    if (b10 < 0) {
                        int i15 = i14;
                        while (i13 < i12) {
                            int i16 = i13 + 1;
                            byte b11 = bArr[i13];
                            if (b11 >= 0) {
                                int i17 = i15 + 1;
                                cArr[i15] = (char) b11;
                                while (i16 < i12) {
                                    byte b12 = bArr[i16];
                                    if (b12 >= 0) {
                                        i16++;
                                        cArr[i17] = (char) b12;
                                        i17++;
                                    } else {
                                        i15 = i17;
                                        i13 = i16;
                                    }
                                }
                                i15 = i17;
                                i13 = i16;
                            } else if (b11 < -32) {
                                if (i16 >= i12) {
                                    throw n1.c();
                                }
                                i13 += 2;
                                e1.o(b11, bArr[i16], cArr, i15);
                                i15++;
                            } else if (b11 < -16) {
                                if (i16 >= i12 - 1) {
                                    throw n1.c();
                                }
                                int i18 = i13 + 2;
                                i13 += 3;
                                e1.n(b11, bArr[i16], bArr[i18], cArr, i15);
                                i15++;
                            } else {
                                if (i16 >= i12 - 2) {
                                    throw n1.c();
                                }
                                byte b13 = bArr[i16];
                                int i19 = i13 + 3;
                                byte b14 = bArr[i13 + 2];
                                i13 += 4;
                                e1.m(b11, b13, b14, bArr[i19], cArr, i15);
                                i15 += 2;
                            }
                        }
                        return new String(cArr, 0, i15);
                    }
                    i13++;
                    cArr[i14] = (char) b10;
                    i14++;
                }
                int i152 = i14;
                while (i13 < i12) {
                }
                return new String(cArr, 0, i152);
            default:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i20 = i10 + i11;
                char[] cArr2 = new char[i11];
                int i21 = i10;
                int i22 = 0;
                while (i21 < i20) {
                    byte a2 = y2.a(i21, bArr);
                    if (a2 < 0) {
                        int i23 = i22;
                        while (i21 < i20) {
                            int i24 = i21 + 1;
                            byte a10 = y2.a(i21, bArr);
                            if (a10 >= 0) {
                                int i25 = i23 + 1;
                                cArr2[i23] = (char) a10;
                                while (i24 < i20) {
                                    byte a11 = y2.a(i24, bArr);
                                    if (a11 >= 0) {
                                        i24++;
                                        cArr2[i25] = (char) a11;
                                        i25++;
                                    } else {
                                        i23 = i25;
                                        i21 = i24;
                                    }
                                }
                                i23 = i25;
                                i21 = i24;
                            } else if (a10 < -32) {
                                if (i24 >= i20) {
                                    throw n1.c();
                                }
                                i21 += 2;
                                e1.o(a10, y2.a(i24, bArr), cArr2, i23);
                                i23++;
                            } else if (a10 < -16) {
                                if (i24 >= i20 - 1) {
                                    throw n1.c();
                                }
                                int i26 = i21 + 2;
                                i21 += 3;
                                e1.n(a10, y2.a(i24, bArr), y2.a(i26, bArr), cArr2, i23);
                                i23++;
                            } else {
                                if (i24 >= i20 - 2) {
                                    throw n1.c();
                                }
                                byte a12 = y2.a(i24, bArr);
                                int i27 = i21 + 3;
                                byte a13 = y2.a(i21 + 2, bArr);
                                i21 += 4;
                                e1.m(a10, a12, a13, y2.a(i27, bArr), cArr2, i23);
                                i23 += 2;
                            }
                        }
                        return new String(cArr2, 0, i23);
                    }
                    i21++;
                    cArr2[i22] = (char) a2;
                    i22++;
                }
                int i232 = i22;
                while (i21 < i20) {
                }
                return new String(cArr2, 0, i232);
        }
    }
}
