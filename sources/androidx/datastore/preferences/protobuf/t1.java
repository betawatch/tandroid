package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t1 extends s0 {
    public final /* synthetic */ int c;

    public static int m(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            s0 s0Var = v1.a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return v1.c(i10, s1.f(j10, bArr));
        }
        if (i11 == 2) {
            return v1.d(i10, s1.f(j10, bArr), s1.f(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    @Override // androidx.datastore.preferences.protobuf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e(int i10, int i11, byte[] bArr) {
        switch (this.c) {
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
                                    throw c0.a();
                                }
                                i13 += 2;
                                s0.b(b11, bArr[i16], cArr, i15);
                                i15++;
                            } else if (b11 < -16) {
                                if (i16 >= i12 - 1) {
                                    throw c0.a();
                                }
                                int i18 = i13 + 2;
                                i13 += 3;
                                s0.c(b11, bArr[i16], bArr[i18], cArr, i15);
                                i15++;
                            } else {
                                if (i16 >= i12 - 2) {
                                    throw c0.a();
                                }
                                byte b13 = bArr[i16];
                                int i19 = i13 + 3;
                                byte b14 = bArr[i13 + 2];
                                i13 += 4;
                                s0.a(b11, b13, b14, bArr[i19], cArr, i15);
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
                    byte f9 = s1.f(i21, bArr);
                    if (f9 < 0) {
                        int i23 = i22;
                        while (i21 < i20) {
                            int i24 = i21 + 1;
                            byte f10 = s1.f(i21, bArr);
                            if (f10 >= 0) {
                                int i25 = i23 + 1;
                                cArr2[i23] = (char) f10;
                                while (i24 < i20) {
                                    byte f11 = s1.f(i24, bArr);
                                    if (f11 >= 0) {
                                        i24++;
                                        cArr2[i25] = (char) f11;
                                        i25++;
                                    } else {
                                        i23 = i25;
                                        i21 = i24;
                                    }
                                }
                                i23 = i25;
                                i21 = i24;
                            } else if (f10 < -32) {
                                if (i24 >= i20) {
                                    throw c0.a();
                                }
                                i21 += 2;
                                s0.b(f10, s1.f(i24, bArr), cArr2, i23);
                                i23++;
                            } else if (f10 < -16) {
                                if (i24 >= i20 - 1) {
                                    throw c0.a();
                                }
                                int i26 = i21 + 2;
                                i21 += 3;
                                s0.c(f10, s1.f(i24, bArr), s1.f(i26, bArr), cArr2, i23);
                                i23++;
                            } else {
                                if (i24 >= i20 - 2) {
                                    throw c0.a();
                                }
                                byte f12 = s1.f(i24, bArr);
                                int i27 = i21 + 3;
                                byte f13 = s1.f(i21 + 2, bArr);
                                i21 += 4;
                                s0.a(f10, f12, f13, s1.f(i27, bArr), cArr2, i23);
                                i23 += 2;
                            }
                        }
                        return new String(cArr2, 0, i23);
                    }
                    i21++;
                    cArr2[i22] = (char) f9;
                    i22++;
                }
                int i232 = i22;
                while (i21 < i20) {
                }
                return new String(cArr2, 0, i232);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // androidx.datastore.preferences.protobuf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char charAt;
        long j10;
        long j11;
        long j12;
        int i14;
        char charAt2;
        switch (this.c) {
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
                                    throw new u1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i17);
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
                            throw new u1(i16 - 1, length);
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
                long j13 = i10;
                long j14 = i11 + j13;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    if (i22 < length2 && (charAt2 = str.charAt(i22)) < 128) {
                        s1.j(bArr, j13, (byte) charAt2);
                        i22++;
                        j13 = 1 + j13;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char charAt5 = str.charAt(i22);
                        if (charAt5 < 128 && j13 < j14) {
                            s1.j(bArr, j13, (byte) charAt5);
                            j12 = j14;
                            j11 = j10;
                            j13 += j10;
                        } else if (charAt5 >= 2048 || j13 > j14 - 2) {
                            j11 = j10;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j13 > j14 - 3) {
                                j12 = j14;
                                if (j13 > j12 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i14)))) {
                                        throw new u1(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j13);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char charAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        s1.j(bArr, j13, (byte) ((codePoint2 >>> 18) | 240));
                                        s1.j(bArr, j13 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        s1.j(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j13 += 4;
                                        s1.j(bArr, j15, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new u1(i22 - 1, length2);
                            }
                            s1.j(bArr, j13, (byte) ((charAt5 >>> '\f') | 480));
                            j12 = j14;
                            long j16 = j13 + 2;
                            s1.j(bArr, j13 + j11, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j13 += 3;
                            s1.j(bArr, j16, (byte) ((charAt5 & '?') | 128));
                        } else {
                            j11 = j10;
                            long j17 = j13 + j11;
                            s1.j(bArr, j13, (byte) ((charAt5 >>> 6) | 960));
                            j13 += 2;
                            s1.j(bArr, j17, (byte) ((charAt5 & '?') | 128));
                            j12 = j14;
                        }
                        i22++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final int i(int i10, int i11, byte[] bArr) {
        long j10;
        int i12;
        int i13 = i10;
        byte b10 = -96;
        byte b11 = -62;
        switch (this.c) {
            case 0:
                while (i13 < i11 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i11) {
                    while (i13 < i11) {
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 >= 0) {
                            i13 = i14;
                        } else if (b12 < -32) {
                            if (i14 >= i11) {
                                return b12;
                            }
                            if (b12 < -62) {
                                return -1;
                            }
                            i13 += 2;
                            if (bArr[i14] > -65) {
                                return -1;
                            }
                        } else if (b12 < -16) {
                            if (i14 >= i11 - 1) {
                                return v1.a(i14, i11, bArr);
                            }
                            int i15 = i13 + 2;
                            byte b13 = bArr[i14];
                            if (b13 > -65) {
                                return -1;
                            }
                            if (b12 == -32 && b13 < -96) {
                                return -1;
                            }
                            if (b12 == -19 && b13 >= -96) {
                                return -1;
                            }
                            i13 += 3;
                            if (bArr[i15] > -65) {
                                return -1;
                            }
                        } else {
                            if (i14 >= i11 - 2) {
                                return v1.a(i14, i11, bArr);
                            }
                            int i16 = i13 + 2;
                            byte b14 = bArr[i14];
                            if (b14 > -65 || (((b14 + 112) + (b12 << 28)) >> 30) != 0) {
                                return -1;
                            }
                            int i17 = i13 + 3;
                            if (bArr[i16] > -65) {
                                return -1;
                            }
                            i13 += 4;
                            if (bArr[i17] > -65) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            default:
                int i18 = 2;
                if ((i13 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i11)));
                }
                long j11 = i13;
                int i19 = (int) (i11 - j11);
                if (i19 < 16) {
                    j10 = j11;
                    i12 = 0;
                } else {
                    j10 = j11;
                    i12 = 0;
                    long j12 = j10;
                    while (true) {
                        if (i12 < i19) {
                            long j13 = j12 + 1;
                            if (s1.f(j12, bArr) >= 0) {
                                i12++;
                                j12 = j13;
                            }
                        } else {
                            i12 = i19;
                        }
                    }
                }
                int i20 = i19 - i12;
                long j14 = j10 + i12;
                while (true) {
                    byte b15 = 0;
                    while (true) {
                        if (i20 > 0) {
                            long j15 = j14 + 1;
                            b15 = s1.f(j14, bArr);
                            if (b15 >= 0) {
                                i20--;
                                j14 = j15;
                            } else {
                                j14 = j15;
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
                        if (b15 < b11) {
                            return -1;
                        }
                        long j16 = j14 + 1;
                        if (s1.f(j14, bArr) > -65) {
                            return -1;
                        }
                        j14 = j16;
                    } else if (b15 < -16) {
                        if (i21 < i18) {
                            return m(j14, bArr, b15, i21);
                        }
                        i20 -= 3;
                        long j17 = j14 + 1;
                        byte f9 = s1.f(j14, bArr);
                        if (f9 > -65) {
                            return -1;
                        }
                        if (b15 == -32 && f9 < b10) {
                            return -1;
                        }
                        if (b15 == -19 && f9 >= b10) {
                            return -1;
                        }
                        j14 += 2;
                        if (s1.f(j17, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i21 < 3) {
                            return m(j14, bArr, b15, i21);
                        }
                        i20 -= 4;
                        long j18 = j14 + 1;
                        byte f10 = s1.f(j14, bArr);
                        if (f10 > -65 || (((f10 + 112) + (b15 << 28)) >> 30) != 0) {
                            return -1;
                        }
                        long j19 = j14 + 2;
                        if (s1.f(j18, bArr) > -65) {
                            return -1;
                        }
                        j14 += 3;
                        if (s1.f(j19, bArr) > -65) {
                            return -1;
                        }
                    }
                    b10 = -96;
                    b11 = -62;
                    i18 = 2;
                }
                break;
        }
    }
}
