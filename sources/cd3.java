// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class cd3 {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, 44100, 32000};
    public static final int[] d = {24000, 22050, gc1.AUDIO_CONTENT_SAMPLING_RATE};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, kk7.w1, 128, kk7.p2, kk7.V2, kk7.A3, 256, kk7.q5, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, kk7.o1, kk7.E1, kk7.U1, kk7.D2, kk7.l3, kk7.R3, kk7.A4, kk7.S5, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = c[i];
        if (i4 == 44100) {
            return ((i2 % 2) + g[i3]) << 1;
        }
        int i5 = f[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[LOOP:1: B:16:0x0050->B:17:0x0052, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(dd ddVar, int[] iArr, int[] iArr2, iq iqVar) {
        int i;
        int m0;
        int m02;
        int i2;
        int i3 = 0;
        while (i3 < iArr2.length) {
            int m = iqVar.m(ddVar, iArr);
            if (m < 0 || m > 15) {
                switch (m) {
                    case 16:
                        i = iArr2[i3 - 1];
                        m0 = ddVar.m0(iArr, 2) + 3;
                        for (i2 = 0; i2 < m0; i2++) {
                            iArr2[i3 + i2] = i;
                        }
                        i3 += m0 - 1;
                        break;
                    case 17:
                        m02 = ddVar.m0(iArr, 3) + 3;
                        m0 = m02;
                        i = 0;
                        while (i2 < m0) {
                        }
                        i3 += m0 - 1;
                        break;
                    case 18:
                        m02 = ddVar.m0(iArr, 7) + 11;
                        m0 = m02;
                        i = 0;
                        while (i2 < m0) {
                        }
                        i3 += m0 - 1;
                        break;
                    default:
                        throw new v30(String.format("[%s] Bad code length '%d' at the bit index '%d'.", cd3.class.getSimpleName(), Integer.valueOf(m), iArr));
                }
            } else {
                iArr2[i3] = m;
            }
            i3++;
        }
    }

    public static int c(dd ddVar, int[] iArr, iq iqVar) {
        int i;
        int m = iqVar.m(ddVar, iArr);
        int i2 = 2;
        int i3 = 5;
        switch (m) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m + 1;
            case 4:
                i2 = 1;
                return ddVar.m0(iArr, i2) + i3;
            case 5:
                i2 = 1;
                i3 = 7;
                return ddVar.m0(iArr, i2) + i3;
            case 6:
                i3 = 9;
                return ddVar.m0(iArr, i2) + i3;
            case 7:
                i3 = 13;
                return ddVar.m0(iArr, i2) + i3;
            case 8:
                i3 = 17;
                i2 = 3;
                return ddVar.m0(iArr, i2) + i3;
            case 9:
                i3 = 25;
                i2 = 3;
                return ddVar.m0(iArr, i2) + i3;
            case 10:
                i3 = 33;
                i2 = 4;
                return ddVar.m0(iArr, i2) + i3;
            case 11:
                i3 = 49;
                i2 = 4;
                return ddVar.m0(iArr, i2) + i3;
            case 12:
                i = 65;
                i2 = 5;
                i3 = i;
                return ddVar.m0(iArr, i2) + i3;
            case 13:
                i = 97;
                i2 = 5;
                i3 = i;
                return ddVar.m0(iArr, i2) + i3;
            case 14:
                i3 = kk7.M1;
                i2 = 6;
                return ddVar.m0(iArr, i2) + i3;
            case 15:
                i3 = kk7.W2;
                i2 = 6;
                return ddVar.m0(iArr, i2) + i3;
            case 16:
                i3 = kk7.f4;
                i2 = 7;
                return ddVar.m0(iArr, i2) + i3;
            case 17:
                i3 = 385;
                i2 = 7;
                return ddVar.m0(iArr, i2) + i3;
            case 18:
                i3 = 513;
                i2 = 8;
                return ddVar.m0(iArr, i2) + i3;
            case 19:
                i3 = 769;
                i2 = 8;
                return ddVar.m0(iArr, i2) + i3;
            case 20:
                i3 = 1025;
                i2 = 9;
                return ddVar.m0(iArr, i2) + i3;
            case 21:
                i3 = 1537;
                i2 = 9;
                return ddVar.m0(iArr, i2) + i3;
            case 22:
                i3 = 2049;
                i2 = 10;
                return ddVar.m0(iArr, i2) + i3;
            case 23:
                i3 = 3073;
                i2 = 10;
                return ddVar.m0(iArr, i2) + i3;
            case 24:
                i3 = 4097;
                i2 = 11;
                return ddVar.m0(iArr, i2) + i3;
            case 25:
                i3 = 6145;
                i2 = 11;
                return ddVar.m0(iArr, i2) + i3;
            case 26:
                i3 = 8193;
                i2 = 12;
                return ddVar.m0(iArr, i2) + i3;
            case 27:
                i3 = 12289;
                i2 = 12;
                return ddVar.m0(iArr, i2) + i3;
            case 28:
                i3 = 16385;
                i2 = 13;
                return ddVar.m0(iArr, i2) + i3;
            case 29:
                i3 = 24577;
                i2 = 13;
                return ddVar.m0(iArr, i2) + i3;
            default:
                throw new v30(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", cd3.class.getSimpleName(), Integer.valueOf(m), Integer.valueOf(iArr[0])));
        }
    }

    public static void d(dd ddVar, int[] iArr, iq[] iqVarArr) {
        int m0 = ddVar.m0(iArr, 5) + kk7.f4;
        int m02 = ddVar.m0(iArr, 5) + 1;
        int m03 = ddVar.m0(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i = 0; i < m03; i++) {
            iArr2[a[i]] = (byte) ddVar.m0(iArr, 3);
        }
        iq iqVar = new iq(iArr2);
        int[] iArr3 = new int[m0];
        b(ddVar, iArr, iArr3, iqVar);
        iq iqVar2 = new iq(iArr3);
        int[] iArr4 = new int[m02];
        b(ddVar, iArr, iArr4, iqVar);
        iq iqVar3 = new iq(iArr4);
        iqVarArr[0] = iqVar2;
        iqVarArr[1] = iqVar3;
    }

    public static int e(dd ddVar, int[] iArr, int i) {
        int i2;
        int i3 = 1;
        switch (i) {
            case kk7.f4 /* 257 */:
            case kk7.g4 /* 258 */:
            case kk7.h4 /* 259 */:
            case kk7.i4 /* 260 */:
            case kk7.j4 /* 261 */:
            case kk7.k4 /* 262 */:
            case kk7.l4 /* 263 */:
            case kk7.m4 /* 264 */:
                return i - 254;
            case kk7.n4 /* 265 */:
                i2 = 11;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.o4 /* 266 */:
                i2 = 13;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.p4 /* 267 */:
                i2 = 15;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.q4 /* 268 */:
                i2 = 17;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.r4 /* 269 */:
                i2 = 19;
                i3 = 2;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.s4 /* 270 */:
                i2 = 23;
                i3 = 2;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.t4 /* 271 */:
                i2 = 27;
                i3 = 2;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.u4 /* 272 */:
                i2 = 31;
                i3 = 2;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.v4 /* 273 */:
                i2 = 35;
                i3 = 3;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.w4 /* 274 */:
                i2 = 43;
                i3 = 3;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.x4 /* 275 */:
                i2 = 51;
                i3 = 3;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.y4 /* 276 */:
                i2 = 59;
                i3 = 3;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.z4 /* 277 */:
                i2 = 67;
                i3 = 4;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.A4 /* 278 */:
                i2 = 83;
                i3 = 4;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.B4 /* 279 */:
                i2 = 99;
                i3 = 4;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.C4 /* 280 */:
                i2 = kk7.z1;
                i3 = 4;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.D4 /* 281 */:
                i2 = kk7.O1;
                i3 = 5;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.E4 /* 282 */:
                i2 = kk7.s2;
                i3 = 5;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.F4 /* 283 */:
                i2 = kk7.Y2;
                i3 = 5;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.G4 /* 284 */:
                i2 = kk7.D3;
                i3 = 5;
                return ddVar.m0(iArr, i3) + i2;
            case kk7.H4 /* 285 */:
                return kk7.g4;
            default:
                throw new v30(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", cd3.class.getSimpleName(), Integer.valueOf(i), Integer.valueOf(iArr[0])));
        }
    }
}
