package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t1 extends s0 {
    public final /* synthetic */ int c;

    public static int m(long j10, byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            s0 s0Var = v1.a;
            if (i9 > -12) {
                return -1;
            }
            return i9;
        }
        if (i10 == 1) {
            return v1.c(i9, s1.f(j10, bArr));
        }
        if (i10 == 2) {
            return v1.d(i9, s1.f(j10, bArr), s1.f(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    @Override // androidx.datastore.preferences.protobuf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e(int i9, int i10, byte[] bArr) {
        switch (this.c) {
            case 0:
                if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
                }
                int i11 = i9 + i10;
                char[] cArr = new char[i10];
                int i12 = i9;
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
                                    throw c0.a();
                                }
                                i12 += 2;
                                s0.b(b11, bArr[i15], cArr, i14);
                                i14++;
                            } else if (b11 < -16) {
                                if (i15 >= i11 - 1) {
                                    throw c0.a();
                                }
                                int i17 = i12 + 2;
                                i12 += 3;
                                s0.c(b11, bArr[i15], bArr[i17], cArr, i14);
                                i14++;
                            } else {
                                if (i15 >= i11 - 2) {
                                    throw c0.a();
                                }
                                byte b13 = bArr[i15];
                                int i18 = i12 + 3;
                                byte b14 = bArr[i12 + 2];
                                i12 += 4;
                                s0.a(b11, b13, b14, bArr[i18], cArr, i14);
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
                if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
                }
                int i19 = i9 + i10;
                char[] cArr2 = new char[i10];
                int i20 = i9;
                int i21 = 0;
                while (i20 < i19) {
                    byte f10 = s1.f(i20, bArr);
                    if (f10 < 0) {
                        int i22 = i21;
                        while (i20 < i19) {
                            int i23 = i20 + 1;
                            byte f11 = s1.f(i20, bArr);
                            if (f11 >= 0) {
                                int i24 = i22 + 1;
                                cArr2[i22] = (char) f11;
                                while (i23 < i19) {
                                    byte f12 = s1.f(i23, bArr);
                                    if (f12 >= 0) {
                                        i23++;
                                        cArr2[i24] = (char) f12;
                                        i24++;
                                    } else {
                                        i22 = i24;
                                        i20 = i23;
                                    }
                                }
                                i22 = i24;
                                i20 = i23;
                            } else if (f11 < -32) {
                                if (i23 >= i19) {
                                    throw c0.a();
                                }
                                i20 += 2;
                                s0.b(f11, s1.f(i23, bArr), cArr2, i22);
                                i22++;
                            } else if (f11 < -16) {
                                if (i23 >= i19 - 1) {
                                    throw c0.a();
                                }
                                int i25 = i20 + 2;
                                i20 += 3;
                                s0.c(f11, s1.f(i23, bArr), s1.f(i25, bArr), cArr2, i22);
                                i22++;
                            } else {
                                if (i23 >= i19 - 2) {
                                    throw c0.a();
                                }
                                byte f13 = s1.f(i23, bArr);
                                int i26 = i20 + 3;
                                byte f14 = s1.f(i20 + 2, bArr);
                                i20 += 4;
                                s0.a(f11, f13, f14, s1.f(i26, bArr), cArr2, i22);
                                i22 += 2;
                            }
                        }
                        return new String(cArr2, 0, i22);
                    }
                    i20++;
                    cArr2[i21] = (char) f10;
                    i21++;
                }
                int i222 = i21;
                while (i20 < i19) {
                }
                return new String(cArr2, 0, i222);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // androidx.datastore.preferences.protobuf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(String str, byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        char charAt;
        long j10;
        long j11;
        long j12;
        int i13;
        char charAt2;
        switch (this.c) {
            case 0:
                int length = str.length();
                int i14 = i10 + i9;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i9) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i9 + i15;
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
                                    throw new u1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
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
                            throw new u1(i15 - 1, length);
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
                long j13 = i9;
                long j14 = i10 + j13;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i9) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i9 + i10));
                }
                int i21 = 0;
                while (true) {
                    j10 = 1;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        s1.j(bArr, j13, (byte) charAt2);
                        i21++;
                        j13 = 1 + j13;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = str.charAt(i21);
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
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                        throw new u1(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j13);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        s1.j(bArr, j13, (byte) ((codePoint2 >>> 18) | 240));
                                        s1.j(bArr, j13 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        s1.j(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j13 += 4;
                                        s1.j(bArr, j15, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new u1(i21 - 1, length2);
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
                        i21++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final int i(int i9, int i10, byte[] bArr) {
        long j10;
        int i11;
        int i12 = i9;
        byte b10 = -96;
        byte b11 = -62;
        switch (this.c) {
            case 0:
                while (i12 < i10 && bArr[i12] >= 0) {
                    i12++;
                }
                if (i12 < i10) {
                    while (i12 < i10) {
                        int i13 = i12 + 1;
                        byte b12 = bArr[i12];
                        if (b12 >= 0) {
                            i12 = i13;
                        } else if (b12 < -32) {
                            if (i13 >= i10) {
                                return b12;
                            }
                            if (b12 < -62) {
                                return -1;
                            }
                            i12 += 2;
                            if (bArr[i13] > -65) {
                                return -1;
                            }
                        } else if (b12 < -16) {
                            if (i13 >= i10 - 1) {
                                return v1.a(i13, i10, bArr);
                            }
                            int i14 = i12 + 2;
                            byte b13 = bArr[i13];
                            if (b13 > -65) {
                                return -1;
                            }
                            if (b12 == -32 && b13 < -96) {
                                return -1;
                            }
                            if (b12 == -19 && b13 >= -96) {
                                return -1;
                            }
                            i12 += 3;
                            if (bArr[i14] > -65) {
                                return -1;
                            }
                        } else {
                            if (i13 >= i10 - 2) {
                                return v1.a(i13, i10, bArr);
                            }
                            int i15 = i12 + 2;
                            byte b14 = bArr[i13];
                            if (b14 > -65 || (((b14 + 112) + (b12 << 28)) >> 30) != 0) {
                                return -1;
                            }
                            int i16 = i12 + 3;
                            if (bArr[i15] > -65) {
                                return -1;
                            }
                            i12 += 4;
                            if (bArr[i16] > -65) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            default:
                int i17 = 2;
                if ((i12 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i10)));
                }
                long j11 = i12;
                int i18 = (int) (i10 - j11);
                if (i18 < 16) {
                    j10 = j11;
                    i11 = 0;
                } else {
                    j10 = j11;
                    i11 = 0;
                    long j12 = j10;
                    while (true) {
                        if (i11 < i18) {
                            long j13 = j12 + 1;
                            if (s1.f(j12, bArr) >= 0) {
                                i11++;
                                j12 = j13;
                            }
                        } else {
                            i11 = i18;
                        }
                    }
                }
                int i19 = i18 - i11;
                long j14 = j10 + i11;
                while (true) {
                    byte b15 = 0;
                    while (true) {
                        if (i19 > 0) {
                            long j15 = j14 + 1;
                            b15 = s1.f(j14, bArr);
                            if (b15 >= 0) {
                                i19--;
                                j14 = j15;
                            } else {
                                j14 = j15;
                            }
                        }
                    }
                    if (i19 == 0) {
                        return 0;
                    }
                    int i20 = i19 - 1;
                    if (b15 < -32) {
                        if (i20 == 0) {
                            return b15;
                        }
                        i19 -= 2;
                        if (b15 < b11) {
                            return -1;
                        }
                        long j16 = j14 + 1;
                        if (s1.f(j14, bArr) > -65) {
                            return -1;
                        }
                        j14 = j16;
                    } else if (b15 < -16) {
                        if (i20 < i17) {
                            return m(j14, bArr, b15, i20);
                        }
                        i19 -= 3;
                        long j17 = j14 + 1;
                        byte f10 = s1.f(j14, bArr);
                        if (f10 > -65) {
                            return -1;
                        }
                        if (b15 == -32 && f10 < b10) {
                            return -1;
                        }
                        if (b15 == -19 && f10 >= b10) {
                            return -1;
                        }
                        j14 += 2;
                        if (s1.f(j17, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i20 < 3) {
                            return m(j14, bArr, b15, i20);
                        }
                        i19 -= 4;
                        long j18 = j14 + 1;
                        byte f11 = s1.f(j14, bArr);
                        if (f11 > -65 || (((f11 + 112) + (b15 << 28)) >> 30) != 0) {
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
                    i17 = 2;
                }
                break;
        }
    }
}
