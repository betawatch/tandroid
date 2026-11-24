// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d3f {
    public final /* synthetic */ byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            d3f d3fVar = s2f.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            byte a = k2f.a(j, bArr);
            d3f d3fVar2 = s2f.a;
            if (i > -12 || a > -65) {
                return -1;
            }
            i3 = a << 8;
        } else {
            if (i2 != 2) {
                zo4.f();
                return 0;
            }
            byte a2 = k2f.a(j, bArr);
            byte a3 = k2f.a(j + 1, bArr);
            d3f d3fVar3 = s2f.a;
            if (i > -12 || a2 > -65 || a3 > -65) {
                return -1;
            }
            i ^= a2 << 8;
            i3 = a3 << 16;
        }
        return i ^ i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        long j;
        long j2;
        long j3;
        int i4;
        char charAt2;
        char c = 2048;
        char c2 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 < i5 && (charAt = str.charAt(i6)) < 128) {
                        bArr[i7] = (byte) charAt;
                        i6++;
                    }
                    if (i6 != length) {
                        return i + length;
                    }
                    int i8 = i + i6;
                    while (i6 < length) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 < 128 && i8 < i5) {
                            bArr[i8] = (byte) charAt3;
                            i8++;
                        } else if (charAt3 < 2048 && i8 <= i5 - 2) {
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                            i8 += 2;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i5 - 3) {
                                if (i8 > i5 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new b3f(i6, length);
                                    }
                                    StringBuilder sb = new StringBuilder(37);
                                    sb.append("Failed writing ");
                                    sb.append(charAt3);
                                    sb.append(" at index ");
                                    sb.append(i8);
                                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                                }
                                int i10 = i6 + 1;
                                if (i10 != str.length()) {
                                    char charAt4 = str.charAt(i10);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | nm7.O3);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i8 + 3;
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i8 += 4;
                                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                                        i6 = i10;
                                    } else {
                                        i6 = i10;
                                    }
                                }
                                throw new b3f(i6 - 1, length);
                            }
                            bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                            int i12 = i8 + 2;
                            bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i12] = (byte) ((charAt3 & '?') | 128);
                        }
                        i6++;
                    }
                    return i8;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j4 = i;
                long j5 = i2 + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    char charAt5 = str.charAt(length2 - 1);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt5);
                    sb2.append(" at index ");
                    sb2.append(i + i2);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                        k2f.e(bArr, j4, (byte) charAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char charAt6 = str.charAt(i13);
                        if (charAt6 < 128 && j4 < j5) {
                            k2f.e(bArr, j4, (byte) charAt6);
                            j2 = j;
                            j3 = j5;
                            j4 += j;
                        } else if (charAt6 >= c || j4 > j5 - 2) {
                            j2 = j;
                            if ((charAt6 >= c2 && 57343 >= charAt6) || j4 > j5 - 3) {
                                j3 = j5;
                                if (j4 > j3 - 4) {
                                    if (55296 <= charAt6 && charAt6 <= 57343 && ((i4 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt6, str.charAt(i4)))) {
                                        throw new b3f(i13, length2);
                                    }
                                    StringBuilder sb3 = new StringBuilder(46);
                                    sb3.append("Failed writing ");
                                    sb3.append(charAt6);
                                    sb3.append(" at index ");
                                    sb3.append(j4);
                                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                                }
                                int i14 = i13 + 1;
                                if (i14 != length2) {
                                    char charAt7 = str.charAt(i14);
                                    if (Character.isSurrogatePair(charAt6, charAt7)) {
                                        int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                        k2f.e(bArr, j4, (byte) ((codePoint2 >>> 18) | nm7.O3));
                                        k2f.e(bArr, j4 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = j4 + 3;
                                        k2f.e(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        k2f.e(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new b3f(i13 - 1, length2);
                            }
                            k2f.e(bArr, j4, (byte) ((charAt6 >>> '\f') | 480));
                            j3 = j5;
                            long j7 = j4 + 2;
                            k2f.e(bArr, j4 + j2, (byte) (((charAt6 >>> 6) & 63) | 128));
                            j4 += 3;
                            k2f.e(bArr, j7, (byte) ((charAt6 & '?') | 128));
                        } else {
                            j2 = j;
                            long j8 = j4 + j2;
                            k2f.e(bArr, j4, (byte) ((charAt6 >>> 6) | 960));
                            j4 += 2;
                            k2f.e(bArr, j8, (byte) ((charAt6 & '?') | 128));
                            j3 = j5;
                        }
                        i13++;
                        j = j2;
                        j5 = j3;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017a, code lost:
    
        return r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i, int i2, byte[] bArr) {
        boolean z;
        ?? r21;
        int i3;
        long j;
        int i4 = i;
        byte b = -16;
        byte b2 = -62;
        int i5 = -1;
        switch (this.a) {
            case 0:
                z = true;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                r21 = 0;
                while (true) {
                    if (i4 < i2) {
                        if (bArr[i4] >= 0) {
                            i4++;
                        } else {
                            while (i4 < i2) {
                                int i6 = i4 + 1;
                                byte b3 = bArr[i4];
                                if (b3 >= 0) {
                                    i4 = i6;
                                } else if (b3 >= -32) {
                                    if (b3 >= -16) {
                                        if (i6 < i2 - 2) {
                                            int i7 = i4 + 2;
                                            byte b4 = bArr[i6];
                                            if (b4 <= -65 && (((b4 + 112) + (b3 << 28)) >> 30) == 0) {
                                                int i8 = i4 + 3;
                                                if (bArr[i7] > -65) {
                                                    break;
                                                } else {
                                                    i4 += 4;
                                                    if (bArr[i8] > -65) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i5 = s2f.b(i6, i2, bArr);
                                            break;
                                        }
                                    } else if (i6 >= i2 - 1) {
                                        i5 = s2f.b(i6, i2, bArr);
                                        break;
                                    } else {
                                        int i9 = i4 + 2;
                                        byte b5 = bArr[i6];
                                        if (b5 <= -65 && ((b3 != -32 || b5 >= -96) && (b3 != -19 || b5 < -96))) {
                                            i4 += 3;
                                            if (bArr[i9] > -65) {
                                                break;
                                            }
                                        }
                                    }
                                } else if (i6 < i2) {
                                    if (b3 < -62) {
                                        break;
                                    } else {
                                        i4 += 2;
                                        if (bArr[i6] > -65) {
                                            break;
                                        }
                                    }
                                } else {
                                    i5 = b3;
                                    break;
                                }
                            }
                        }
                    }
                }
                i5 = 0;
                break;
            default:
                z = true;
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                byte b6 = 0;
                long j2 = i4;
                int i10 = (int) (i2 - j2);
                if (i10 < 16) {
                    i3 = 0;
                    j = j2;
                } else {
                    i3 = 0;
                    j = j2;
                    long j3 = j;
                    while (true) {
                        if (i3 < i10) {
                            long j4 = j3 + 1;
                            if (k2f.a(j3, bArr) >= 0) {
                                i3++;
                                j3 = j4;
                            }
                        } else {
                            i3 = i10;
                        }
                    }
                }
                int i11 = i10 - i3;
                long j5 = j + i3;
                while (true) {
                    byte b7 = b6;
                    while (true) {
                        if (i11 > 0) {
                            long j6 = j5 + 1;
                            b7 = k2f.a(j5, bArr);
                            if (b7 >= 0) {
                                i11--;
                                j5 = j6;
                            } else {
                                j5 = j6;
                            }
                        }
                    }
                    if (i11 != 0) {
                        int i12 = i11 - 1;
                        if (b7 >= -32) {
                            if (b7 >= b) {
                                r21 = b6;
                                if (i12 >= 3) {
                                    i11 -= 4;
                                    long j7 = j5 + 1;
                                    byte a = k2f.a(j5, bArr);
                                    if (a <= -65 && (((a + 112) + (b7 << 28)) >> 30) == 0) {
                                        long j8 = j5 + 2;
                                        if (k2f.a(j7, bArr) > -65) {
                                            break;
                                        } else {
                                            j5 += 3;
                                            if (k2f.a(j8, bArr) > -65) {
                                                break;
                                            } else {
                                                b6 = r21;
                                                b = -16;
                                                b2 = -62;
                                            }
                                        }
                                    }
                                } else {
                                    i5 = a(j5, bArr, b7, i12);
                                    break;
                                }
                            } else if (i12 >= 2) {
                                i11 -= 3;
                                long j9 = j5 + 1;
                                byte a2 = k2f.a(j5, bArr);
                                if (a2 > -65) {
                                    break;
                                } else {
                                    r21 = b6;
                                    if ((b7 != -32 || a2 >= -96) && (b7 != -19 || a2 < -96)) {
                                        j5 += 2;
                                        if (k2f.a(j9, bArr) > -65) {
                                            break;
                                        } else {
                                            b6 = r21;
                                            b = -16;
                                            b2 = -62;
                                        }
                                    }
                                }
                            } else {
                                i5 = a(j5, bArr, b7, i12);
                                break;
                            }
                        } else if (i12 != 0) {
                            i11 -= 2;
                            if (b7 < b2) {
                                break;
                            } else {
                                long j10 = j5 + 1;
                                if (k2f.a(j5, bArr) > -65) {
                                    break;
                                } else {
                                    r21 = b6;
                                    j5 = j10;
                                    b6 = r21;
                                    b = -16;
                                    b2 = -62;
                                }
                            }
                        } else {
                            i5 = b7;
                            break;
                        }
                    } else {
                        i5 = b6;
                        r21 = i5;
                        break;
                    }
                }
                break;
        }
        return r21;
    }
}
