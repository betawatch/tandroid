package lc;

import e2.j0;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i14 = 0;
        while (true) {
            int i15 = i14 / 8;
            if (bArr.length <= i15) {
                i11 = -1;
            } else {
                int i16 = bArr.length - 1 == i15 ? 0 : bArr[i15 + 1];
                int i17 = (i14 % 24) / 6;
                if (i17 != 0) {
                    if (i17 == 1) {
                        i12 = (bArr[i15] << 4) & 48;
                        i13 = (i16 >> 4) & 15;
                    } else if (i17 == 2) {
                        i12 = (bArr[i15] << 2) & 60;
                        i13 = (i16 >> 6) & 3;
                    } else if (i17 != 3) {
                        i11 = 0;
                    } else {
                        i10 = bArr[i15];
                    }
                    i11 = i12 | i13;
                } else {
                    i10 = bArr[i15] >> 2;
                }
                i11 = i10 & 63;
            }
            if (i11 < 0) {
                break;
            }
            sb2.append((char) b[i11]);
            i14 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case zs.v0 /* 58 */:
                    case zs.w0 /* 59 */:
                    case zs.x0 /* 60 */:
                    case zs.y0 /* 61 */:
                    case zs.z0 /* 62 */:
                    case zs.A0 /* 63 */:
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case zs.c1 /* 91 */:
                            case zs.d1 /* 92 */:
                            case zs.e1 /* 93 */:
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[LOOP:1: B:16:0x0050->B:17:0x0052, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(c5.x xVar, int[] iArr, int[] iArr2, j0 j0Var) {
        int i10;
        int p5;
        int p9;
        int i11;
        int i12 = 0;
        while (i12 < iArr2.length) {
            int m10 = j0Var.m(xVar, iArr);
            if (m10 < 0 || m10 > 15) {
                switch (m10) {
                    case 16:
                        i10 = iArr2[i12 - 1];
                        p5 = xVar.p(iArr, 2) + 3;
                        for (i11 = 0; i11 < p5; i11++) {
                            iArr2[i12 + i11] = i10;
                        }
                        i12 += p5 - 1;
                        break;
                    case 17:
                        p9 = xVar.p(iArr, 3) + 3;
                        p5 = p9;
                        i10 = 0;
                        while (i11 < p5) {
                        }
                        i12 += p5 - 1;
                        break;
                    case 18:
                        p9 = xVar.p(iArr, 7) + 11;
                        p5 = p9;
                        i10 = 0;
                        while (i11 < p5) {
                        }
                        i12 += p5 - 1;
                        break;
                    default:
                        throw new j6.l(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), iArr));
                }
            } else {
                iArr2[i12] = m10;
            }
            i12++;
        }
    }

    public static int d(c5.x xVar, int[] iArr, j0 j0Var) {
        int i10;
        int m10 = j0Var.m(xVar, iArr);
        int i11 = 2;
        int i12 = 5;
        switch (m10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m10 + 1;
            case 4:
                i11 = 1;
                return xVar.p(iArr, i11) + i12;
            case 5:
                i11 = 1;
                i12 = 7;
                return xVar.p(iArr, i11) + i12;
            case 6:
                i12 = 9;
                return xVar.p(iArr, i11) + i12;
            case 7:
                i12 = 13;
                return xVar.p(iArr, i11) + i12;
            case 8:
                i12 = 17;
                i11 = 3;
                return xVar.p(iArr, i11) + i12;
            case 9:
                i12 = 25;
                i11 = 3;
                return xVar.p(iArr, i11) + i12;
            case 10:
                i12 = 33;
                i11 = 4;
                return xVar.p(iArr, i11) + i12;
            case 11:
                i12 = 49;
                i11 = 4;
                return xVar.p(iArr, i11) + i12;
            case 12:
                i10 = 65;
                i11 = 5;
                i12 = i10;
                return xVar.p(iArr, i11) + i12;
            case 13:
                i10 = 97;
                i11 = 5;
                i12 = i10;
                return xVar.p(iArr, i11) + i12;
            case 14:
                i12 = zs.N1;
                i11 = 6;
                return xVar.p(iArr, i11) + i12;
            case 15:
                i12 = zs.X2;
                i11 = 6;
                return xVar.p(iArr, i11) + i12;
            case 16:
                i12 = zs.g4;
                i11 = 7;
                return xVar.p(iArr, i11) + i12;
            case 17:
                i12 = 385;
                i11 = 7;
                return xVar.p(iArr, i11) + i12;
            case 18:
                i12 = 513;
                i11 = 8;
                return xVar.p(iArr, i11) + i12;
            case 19:
                i12 = 769;
                i11 = 8;
                return xVar.p(iArr, i11) + i12;
            case 20:
                i12 = 1025;
                i11 = 9;
                return xVar.p(iArr, i11) + i12;
            case 21:
                i12 = 1537;
                i11 = 9;
                return xVar.p(iArr, i11) + i12;
            case 22:
                i12 = 2049;
                i11 = 10;
                return xVar.p(iArr, i11) + i12;
            case 23:
                i12 = 3073;
                i11 = 10;
                return xVar.p(iArr, i11) + i12;
            case 24:
                i12 = 4097;
                i11 = 11;
                return xVar.p(iArr, i11) + i12;
            case 25:
                i12 = 6145;
                i11 = 11;
                return xVar.p(iArr, i11) + i12;
            case 26:
                i12 = 8193;
                i11 = 12;
                return xVar.p(iArr, i11) + i12;
            case 27:
                i12 = 12289;
                i11 = 12;
                return xVar.p(iArr, i11) + i12;
            case 28:
                i12 = 16385;
                i11 = 13;
                return xVar.p(iArr, i11) + i12;
            case 29:
                i12 = 24577;
                i11 = 13;
                return xVar.p(iArr, i11) + i12;
            default:
                throw new j6.l(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), Integer.valueOf(iArr[0])));
        }
    }

    public static void e(c5.x xVar, int[] iArr, j0[] j0VarArr) {
        int p5 = xVar.p(iArr, 5) + zs.g4;
        int p9 = xVar.p(iArr, 5) + 1;
        int p10 = xVar.p(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i10 = 0; i10 < p10; i10++) {
            iArr2[a[i10]] = (byte) xVar.p(iArr, 3);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[p5];
        c(xVar, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[p9];
        c(xVar, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(c5.x xVar, int[] iArr, int i10) {
        int i11;
        int i12 = 1;
        switch (i10) {
            case zs.g4 /* 257 */:
            case zs.h4 /* 258 */:
            case zs.i4 /* 259 */:
            case zs.j4 /* 260 */:
            case zs.k4 /* 261 */:
            case zs.l4 /* 262 */:
            case zs.m4 /* 263 */:
            case zs.n4 /* 264 */:
                return i10 - 254;
            case zs.o4 /* 265 */:
                i11 = 11;
                return xVar.p(iArr, i12) + i11;
            case zs.p4 /* 266 */:
                i11 = 13;
                return xVar.p(iArr, i12) + i11;
            case zs.q4 /* 267 */:
                i11 = 15;
                return xVar.p(iArr, i12) + i11;
            case zs.r4 /* 268 */:
                i11 = 17;
                return xVar.p(iArr, i12) + i11;
            case zs.s4 /* 269 */:
                i11 = 19;
                i12 = 2;
                return xVar.p(iArr, i12) + i11;
            case zs.t4 /* 270 */:
                i11 = 23;
                i12 = 2;
                return xVar.p(iArr, i12) + i11;
            case zs.u4 /* 271 */:
                i11 = 27;
                i12 = 2;
                return xVar.p(iArr, i12) + i11;
            case zs.v4 /* 272 */:
                i11 = 31;
                i12 = 2;
                return xVar.p(iArr, i12) + i11;
            case zs.w4 /* 273 */:
                i11 = 35;
                i12 = 3;
                return xVar.p(iArr, i12) + i11;
            case zs.x4 /* 274 */:
                i11 = 43;
                i12 = 3;
                return xVar.p(iArr, i12) + i11;
            case zs.y4 /* 275 */:
                i11 = 51;
                i12 = 3;
                return xVar.p(iArr, i12) + i11;
            case zs.z4 /* 276 */:
                i11 = 59;
                i12 = 3;
                return xVar.p(iArr, i12) + i11;
            case zs.A4 /* 277 */:
                i11 = 67;
                i12 = 4;
                return xVar.p(iArr, i12) + i11;
            case zs.B4 /* 278 */:
                i11 = 83;
                i12 = 4;
                return xVar.p(iArr, i12) + i11;
            case zs.C4 /* 279 */:
                i11 = 99;
                i12 = 4;
                return xVar.p(iArr, i12) + i11;
            case zs.D4 /* 280 */:
                i11 = zs.A1;
                i12 = 4;
                return xVar.p(iArr, i12) + i11;
            case zs.E4 /* 281 */:
                i11 = zs.P1;
                i12 = 5;
                return xVar.p(iArr, i12) + i11;
            case zs.F4 /* 282 */:
                i11 = zs.t2;
                i12 = 5;
                return xVar.p(iArr, i12) + i11;
            case zs.G4 /* 283 */:
                i11 = zs.Z2;
                i12 = 5;
                return xVar.p(iArr, i12) + i11;
            case zs.H4 /* 284 */:
                i11 = 227;
                i12 = 5;
                return xVar.p(iArr, i12) + i11;
            case zs.I4 /* 285 */:
                return zs.h4;
            default:
                throw new j6.l(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i10), Integer.valueOf(iArr[0])));
        }
    }
}
