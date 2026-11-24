// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class g2f {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, kpe kpeVar, sad sadVar) {
        wne wneVar = (wne) kpeVar;
        int h = h(bArr, i2, sadVar);
        wneVar.i(sadVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, sadVar);
            if (i != sadVar.a) {
                break;
            }
            h = h(bArr, h2, sadVar);
            wneVar.i(sadVar.a);
        }
        return h;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, qze qzeVar, sad sadVar) {
        if ((i >>> 3) == 0) {
            throw new fpe("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int i5 = i(bArr, i2, sadVar);
            qzeVar.a(i, Long.valueOf(sadVar.b));
            return i5;
        }
        if (i4 == 1) {
            qzeVar.a(i, Long.valueOf(j(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int h = h(bArr, i2, sadVar);
            int i6 = sadVar.a;
            if (i6 < 0) {
                throw fpe.b();
            }
            if (i6 > bArr.length - h) {
                throw fpe.a();
            }
            if (i6 == 0) {
                qzeVar.a(i, sie.c);
            } else {
                qzeVar.a(i, sie.j(h, i6, bArr));
            }
            return h + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new fpe("Protocol message contained an invalid tag (zero).");
            }
            qzeVar.a(i, Integer.valueOf(a(i2, bArr)));
            return i2 + 4;
        }
        qze b = qze.b();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int h2 = h(bArr, i2, sadVar);
            int i9 = sadVar.a;
            if (i9 == i7) {
                i8 = i9;
                i2 = h2;
                break;
            }
            i2 = c(i9, bArr, h2, i3, b, sadVar);
            i8 = i9;
        }
        if (i2 > i3 || i8 != i7) {
            throw new fpe("Failed to parse the message.");
        }
        qzeVar.a(i, b);
        return i2;
    }

    public static int d(int i, byte[] bArr, int i2, sad sadVar) {
        int i3 = i & kk7.K1;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            sadVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            sadVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            sadVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            sadVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                sadVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(xwe xweVar, int i, byte[] bArr, int i2, int i3, kpe kpeVar, sad sadVar) {
        int g = g(xweVar, bArr, i2, i3, sadVar);
        kpeVar.add(sadVar.c);
        while (g < i3) {
            int h = h(bArr, g, sadVar);
            if (i != sadVar.a) {
                break;
            }
            g = g(xweVar, bArr, h, i3, sadVar);
            kpeVar.add(sadVar.c);
        }
        return g;
    }

    public static int f(xwe xweVar, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        que queVar = (que) xweVar;
        Object zza = queVar.zza();
        int j = queVar.j(zza, bArr, i, i2, i3, sadVar);
        queVar.b(zza);
        sadVar.c = zza;
        return j;
    }

    public static int g(xwe xweVar, byte[] bArr, int i, int i2, sad sadVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = d(i4, bArr, i3, sadVar);
            i4 = sadVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw fpe.a();
        }
        Object zza = xweVar.zza();
        int i6 = i5 + i4;
        xweVar.c(zza, bArr, i5, i6, sadVar);
        xweVar.b(zza);
        sadVar.c = zza;
        return i6;
    }

    public static int h(byte[] bArr, int i, sad sadVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, sadVar);
        }
        sadVar.a = b;
        return i2;
    }

    public static int i(byte[] bArr, int i, sad sadVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            sadVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        sadVar.b = j2;
        return i3;
    }

    public static long j(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int k(byte[] bArr, int i, sad sadVar) {
        int h = h(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 < 0) {
            throw fpe.b();
        }
        if (i2 == 0) {
            sadVar.c = "";
            return h;
        }
        sadVar.c = new String(bArr, h, i2, foe.a);
        return h + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int l(byte[] bArr, int i, sad sadVar) {
        String str;
        int h = h(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 < 0) {
            throw fpe.b();
        }
        if (i2 == 0) {
            sadVar.c = "";
            return h;
        }
        byte b = -16;
        byte b2 = -32;
        switch (q0f.a.a) {
            case 0:
                if ((h | i2 | ((bArr.length - h) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(h), Integer.valueOf(i2)));
                }
                int i3 = h + i2;
                char[] cArr = new char[i2];
                int i4 = h;
                int i5 = 0;
                while (i4 < i3) {
                    byte b3 = bArr[i4];
                    if (b3 < 0) {
                        while (i4 < i3) {
                            int i6 = i4 + 1;
                            byte b4 = bArr[i4];
                            if (b4 >= 0) {
                                int i7 = i5 + 1;
                                cArr[i5] = (char) b4;
                                while (i6 < i3) {
                                    byte b5 = bArr[i6];
                                    if (b5 >= 0) {
                                        i6++;
                                        cArr[i7] = (char) b5;
                                        i7++;
                                    } else {
                                        i5 = i7;
                                        i4 = i6;
                                    }
                                }
                                i5 = i7;
                                i4 = i6;
                            } else if (b4 < -32) {
                                if (i6 >= i3) {
                                    throw fpe.c();
                                }
                                i4 += 2;
                                h3f.c(b4, bArr[i6], cArr, i5);
                                i5++;
                            } else if (b4 < -16) {
                                if (i6 >= i3 - 1) {
                                    throw fpe.c();
                                }
                                int i8 = i4 + 2;
                                i4 += 3;
                                h3f.b(b4, bArr[i6], bArr[i8], cArr, i5);
                                i5++;
                            } else {
                                if (i6 >= i3 - 2) {
                                    throw fpe.c();
                                }
                                byte b6 = bArr[i6];
                                int i9 = i4 + 3;
                                byte b7 = bArr[i4 + 2];
                                i4 += 4;
                                int i10 = i5;
                                h3f.a(b4, b6, b7, bArr[i9], cArr, i10);
                                i5 = i10 + 2;
                            }
                        }
                        str = new String(cArr, 0, i5);
                        break;
                    } else {
                        i4++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
                while (i4 < i3) {
                }
                str = new String(cArr, 0, i5);
            default:
                if ((h | i2 | ((bArr.length - h) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(h), Integer.valueOf(i2)));
                }
                int i11 = h + i2;
                char[] cArr2 = new char[i2];
                int i12 = h;
                int i13 = 0;
                while (i12 < i11) {
                    byte a = i0f.a(i12, bArr);
                    if (a < 0) {
                        while (i12 < i11) {
                            int i14 = i12 + 1;
                            byte a2 = i0f.a(i12, bArr);
                            if (a2 >= 0) {
                                int i15 = i13 + 1;
                                cArr2[i13] = (char) a2;
                                while (i14 < i11) {
                                    byte a3 = i0f.a(i14, bArr);
                                    if (a3 >= 0) {
                                        i14++;
                                        cArr2[i15] = (char) a3;
                                        i15++;
                                    } else {
                                        i13 = i15;
                                        i12 = i14;
                                    }
                                }
                                i13 = i15;
                                i12 = i14;
                            } else if (a2 < b2) {
                                if (i14 >= i11) {
                                    throw fpe.c();
                                }
                                i12 += 2;
                                h3f.c(a2, i0f.a(i14, bArr), cArr2, i13);
                                i13++;
                            } else if (a2 < b) {
                                if (i14 >= i11 - 1) {
                                    throw fpe.c();
                                }
                                int i16 = i12 + 2;
                                i12 += 3;
                                h3f.b(a2, i0f.a(i14, bArr), i0f.a(i16, bArr), cArr2, i13);
                                i13++;
                            } else {
                                if (i14 >= i11 - 2) {
                                    throw fpe.c();
                                }
                                byte a4 = i0f.a(i14, bArr);
                                int i17 = i12 + 3;
                                byte a5 = i0f.a(i12 + 2, bArr);
                                i12 += 4;
                                int i18 = i13;
                                h3f.a(a2, a4, a5, i0f.a(i17, bArr), cArr2, i18);
                                i13 = i18 + 2;
                            }
                            b = -16;
                            b2 = -32;
                        }
                        str = new String(cArr2, 0, i13);
                        break;
                    } else {
                        i12++;
                        cArr2[i13] = (char) a;
                        i13++;
                    }
                }
                while (i12 < i11) {
                }
                str = new String(cArr2, 0, i13);
        }
        sadVar.c = str;
        return h + i2;
    }

    public static int m(byte[] bArr, int i, sad sadVar) {
        int h = h(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 < 0) {
            throw fpe.b();
        }
        if (i2 > bArr.length - h) {
            throw fpe.a();
        }
        if (i2 == 0) {
            sadVar.c = sie.c;
            return h;
        }
        sadVar.c = sie.j(h, i2, bArr);
        return h + i2;
    }
}
