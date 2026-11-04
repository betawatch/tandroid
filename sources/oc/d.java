package oc;

import g2.k0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i3;
        int i10;
        int i11;
        int i12;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i13 = 0;
        while (true) {
            int i14 = i13 / 8;
            if (bArr.length <= i14) {
                i10 = -1;
            } else {
                int i15 = bArr.length - 1 == i14 ? 0 : bArr[i14 + 1];
                int i16 = (i13 % 24) / 6;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i11 = (bArr[i14] << 4) & 48;
                        i12 = (i15 >> 4) & 15;
                    } else if (i16 == 2) {
                        i11 = (bArr[i14] << 2) & 60;
                        i12 = (i15 >> 6) & 3;
                    } else if (i16 != 3) {
                        i10 = 0;
                    } else {
                        i3 = bArr[i14];
                    }
                    i10 = i11 | i12;
                } else {
                    i3 = bArr[i14] >> 2;
                }
                i10 = i3 & 63;
            }
            if (i10 < 0) {
                break;
            }
            sb2.append((char) b[i10]);
            i13 += 6;
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
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case hs.v0 /* 58 */:
                    case hs.w0 /* 59 */:
                    case hs.x0 /* 60 */:
                    case hs.y0 /* 61 */:
                    case hs.z0 /* 62 */:
                    case hs.A0 /* 63 */:
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case hs.c1 /* 91 */:
                            case hs.d1 /* 92 */:
                            case hs.e1 /* 93 */:
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
    public static void c(e5.u uVar, int[] iArr, int[] iArr2, k0 k0Var) {
        int i3;
        int o10;
        int o11;
        int i10;
        int i11 = 0;
        while (i11 < iArr2.length) {
            int m10 = k0Var.m(uVar, iArr);
            if (m10 < 0 || m10 > 15) {
                switch (m10) {
                    case 16:
                        i3 = iArr2[i11 - 1];
                        o10 = uVar.o(iArr, 2) + 3;
                        for (i10 = 0; i10 < o10; i10++) {
                            iArr2[i11 + i10] = i3;
                        }
                        i11 += o10 - 1;
                        break;
                    case 17:
                        o11 = uVar.o(iArr, 3) + 3;
                        o10 = o11;
                        i3 = 0;
                        while (i10 < o10) {
                        }
                        i11 += o10 - 1;
                        break;
                    case 18:
                        o11 = uVar.o(iArr, 7) + 11;
                        o10 = o11;
                        i3 = 0;
                        while (i10 < o10) {
                        }
                        i11 += o10 - 1;
                        break;
                    default:
                        throw new l6.m(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), iArr));
                }
            } else {
                iArr2[i11] = m10;
            }
            i11++;
        }
    }

    public static int d(e5.u uVar, int[] iArr, k0 k0Var) {
        int i3;
        int m10 = k0Var.m(uVar, iArr);
        int i10 = 2;
        int i11 = 5;
        switch (m10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m10 + 1;
            case 4:
                i10 = 1;
                return uVar.o(iArr, i10) + i11;
            case 5:
                i10 = 1;
                i11 = 7;
                return uVar.o(iArr, i10) + i11;
            case 6:
                i11 = 9;
                return uVar.o(iArr, i10) + i11;
            case 7:
                i11 = 13;
                return uVar.o(iArr, i10) + i11;
            case 8:
                i11 = 17;
                i10 = 3;
                return uVar.o(iArr, i10) + i11;
            case 9:
                i11 = 25;
                i10 = 3;
                return uVar.o(iArr, i10) + i11;
            case 10:
                i11 = 33;
                i10 = 4;
                return uVar.o(iArr, i10) + i11;
            case 11:
                i11 = 49;
                i10 = 4;
                return uVar.o(iArr, i10) + i11;
            case 12:
                i3 = 65;
                i10 = 5;
                i11 = i3;
                return uVar.o(iArr, i10) + i11;
            case 13:
                i3 = 97;
                i10 = 5;
                i11 = i3;
                return uVar.o(iArr, i10) + i11;
            case 14:
                i11 = hs.N1;
                i10 = 6;
                return uVar.o(iArr, i10) + i11;
            case 15:
                i11 = hs.X2;
                i10 = 6;
                return uVar.o(iArr, i10) + i11;
            case 16:
                i11 = hs.g4;
                i10 = 7;
                return uVar.o(iArr, i10) + i11;
            case 17:
                i11 = 385;
                i10 = 7;
                return uVar.o(iArr, i10) + i11;
            case 18:
                i11 = 513;
                i10 = 8;
                return uVar.o(iArr, i10) + i11;
            case 19:
                i11 = 769;
                i10 = 8;
                return uVar.o(iArr, i10) + i11;
            case 20:
                i11 = 1025;
                i10 = 9;
                return uVar.o(iArr, i10) + i11;
            case 21:
                i11 = 1537;
                i10 = 9;
                return uVar.o(iArr, i10) + i11;
            case 22:
                i11 = 2049;
                i10 = 10;
                return uVar.o(iArr, i10) + i11;
            case 23:
                i11 = 3073;
                i10 = 10;
                return uVar.o(iArr, i10) + i11;
            case 24:
                i11 = 4097;
                i10 = 11;
                return uVar.o(iArr, i10) + i11;
            case 25:
                i11 = 6145;
                i10 = 11;
                return uVar.o(iArr, i10) + i11;
            case 26:
                i11 = 8193;
                i10 = 12;
                return uVar.o(iArr, i10) + i11;
            case 27:
                i11 = 12289;
                i10 = 12;
                return uVar.o(iArr, i10) + i11;
            case 28:
                i11 = 16385;
                i10 = 13;
                return uVar.o(iArr, i10) + i11;
            case 29:
                i11 = 24577;
                i10 = 13;
                return uVar.o(iArr, i10) + i11;
            default:
                throw new l6.m(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), Integer.valueOf(iArr[0])));
        }
    }

    public static void e(e5.u uVar, int[] iArr, k0[] k0VarArr) {
        int o10 = uVar.o(iArr, 5) + hs.g4;
        int o11 = uVar.o(iArr, 5) + 1;
        int o12 = uVar.o(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i3 = 0; i3 < o12; i3++) {
            iArr2[a[i3]] = (byte) uVar.o(iArr, 3);
        }
        k0 k0Var = new k0(iArr2);
        int[] iArr3 = new int[o10];
        c(uVar, iArr, iArr3, k0Var);
        k0 k0Var2 = new k0(iArr3);
        int[] iArr4 = new int[o11];
        c(uVar, iArr, iArr4, k0Var);
        k0 k0Var3 = new k0(iArr4);
        k0VarArr[0] = k0Var2;
        k0VarArr[1] = k0Var3;
    }

    public static int f(e5.u uVar, int[] iArr, int i3) {
        int i10;
        int i11 = 1;
        switch (i3) {
            case hs.g4 /* 257 */:
            case hs.h4 /* 258 */:
            case hs.i4 /* 259 */:
            case hs.j4 /* 260 */:
            case hs.k4 /* 261 */:
            case hs.l4 /* 262 */:
            case hs.m4 /* 263 */:
            case hs.n4 /* 264 */:
                return i3 - 254;
            case hs.o4 /* 265 */:
                i10 = 11;
                return uVar.o(iArr, i11) + i10;
            case hs.p4 /* 266 */:
                i10 = 13;
                return uVar.o(iArr, i11) + i10;
            case hs.q4 /* 267 */:
                i10 = 15;
                return uVar.o(iArr, i11) + i10;
            case hs.r4 /* 268 */:
                i10 = 17;
                return uVar.o(iArr, i11) + i10;
            case hs.s4 /* 269 */:
                i10 = 19;
                i11 = 2;
                return uVar.o(iArr, i11) + i10;
            case hs.t4 /* 270 */:
                i10 = 23;
                i11 = 2;
                return uVar.o(iArr, i11) + i10;
            case hs.u4 /* 271 */:
                i10 = 27;
                i11 = 2;
                return uVar.o(iArr, i11) + i10;
            case hs.v4 /* 272 */:
                i10 = 31;
                i11 = 2;
                return uVar.o(iArr, i11) + i10;
            case hs.w4 /* 273 */:
                i10 = 35;
                i11 = 3;
                return uVar.o(iArr, i11) + i10;
            case hs.x4 /* 274 */:
                i10 = 43;
                i11 = 3;
                return uVar.o(iArr, i11) + i10;
            case hs.y4 /* 275 */:
                i10 = 51;
                i11 = 3;
                return uVar.o(iArr, i11) + i10;
            case hs.z4 /* 276 */:
                i10 = 59;
                i11 = 3;
                return uVar.o(iArr, i11) + i10;
            case hs.A4 /* 277 */:
                i10 = 67;
                i11 = 4;
                return uVar.o(iArr, i11) + i10;
            case hs.B4 /* 278 */:
                i10 = 83;
                i11 = 4;
                return uVar.o(iArr, i11) + i10;
            case hs.C4 /* 279 */:
                i10 = 99;
                i11 = 4;
                return uVar.o(iArr, i11) + i10;
            case hs.D4 /* 280 */:
                i10 = hs.A1;
                i11 = 4;
                return uVar.o(iArr, i11) + i10;
            case hs.E4 /* 281 */:
                i10 = hs.P1;
                i11 = 5;
                return uVar.o(iArr, i11) + i10;
            case hs.F4 /* 282 */:
                i10 = hs.t2;
                i11 = 5;
                return uVar.o(iArr, i11) + i10;
            case hs.G4 /* 283 */:
                i10 = hs.Z2;
                i11 = 5;
                return uVar.o(iArr, i11) + i10;
            case hs.H4 /* 284 */:
                i10 = 227;
                i11 = 5;
                return uVar.o(iArr, i11) + i10;
            case hs.I4 /* 285 */:
                return hs.h4;
            default:
                throw new l6.m(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i3), Integer.valueOf(iArr[0])));
        }
    }
}
