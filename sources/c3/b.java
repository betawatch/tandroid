package c3;

import a8.yb;
import android.util.Base64;
import b2.u0;
import b2.x0;
import e2.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.OneUIUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, MediaDataController.MAX_STYLE_RUNS_COUNT, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] m = {8000, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] n = {5, 8, 10, 12};
    public static final int[] o = {6, 9, 12, 15};
    public static final int[] p = {2, 4, 6, 8};
    public static final int[] q = {9, 11, 13, 16};
    public static final int[] r = {5, 8, 10, 12};
    public static final String[] s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] t = {44100, 48000, 32000};
    public static final int[] u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] x = {32000, OneUIUtilities.ONE_UI_4_0, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] y = {8000, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 24000, 32000, OneUIUtilities.ONE_UI_4_0, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean a(e2.x xVar, u uVar, int i10, s sVar) {
        long C = xVar.C();
        long j10 = C >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((C >> 12) & 15);
        int i12 = (int) ((C >> 8) & 15);
        int i13 = (int) ((C >> 4) & 15);
        int i14 = (int) ((C >> 1) & 7);
        boolean z11 = (C & 1) == 1;
        if (i13 <= 7) {
            if (i13 != uVar.g - 1) {
                return false;
            }
        } else if (i13 > 10 || uVar.g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == uVar.i) || z11) {
            return false;
        }
        try {
            long I = xVar.I();
            if (!z10) {
                I *= uVar.b;
            }
            long j11 = uVar.j;
            if (j11 != 0 && I > j11) {
                return false;
            }
            sVar.a = I;
            int s10 = s(i11, xVar);
            long j12 = uVar.j;
            boolean z12 = j12 == 0 || I + ((long) s10) >= j12;
            if (s10 == -1) {
                return false;
            }
            if ((!z12 && s10 < uVar.a) || s10 > uVar.b) {
                return false;
            }
            int i15 = uVar.e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != uVar.f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int H = xVar.H();
                    if (i12 == 14) {
                        H *= 10;
                    }
                    if (H != i15) {
                        return false;
                    }
                } else if (xVar.A() * MediaDataController.MAX_STYLE_RUNS_COUNT != i15) {
                    return false;
                }
            }
            int A = xVar.A();
            int i16 = xVar.b;
            byte[] bArr = xVar.a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = xVar.b; i19 < i17; i19++) {
                i18 = n0.l[i18 ^ (bArr[i19] & 255)];
            }
            String str = n0.a;
            if (A != i18) {
                return false;
            }
            if (xVar.a() != 0) {
                int j13 = xVar.j();
                if ((j13 & 128) != 0) {
                    return false;
                }
                int i20 = (j13 & 126) >> 1;
                if ((i20 >= 2 && i20 <= 7) || (i20 >= 13 && i20 <= 31)) {
                    e2.a.g("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i20);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void b(String str, boolean z10) {
        if (!z10) {
            throw x0.a(null, str);
        }
    }

    public static void c(long j10, e2.x xVar, j0[] j0VarArr) {
        int i10;
        while (true) {
            if (xVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (xVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int A = xVar.A();
                i11 += A;
                if (A != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (xVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int A2 = xVar.A();
                i12 += A2;
                if (A2 != 255) {
                    break;
                }
            }
            int i13 = xVar.b + i12;
            if (i12 == -1 || i12 > xVar.a()) {
                e2.a.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = xVar.c;
            } else if (i10 == 4 && i12 >= 8) {
                int A3 = xVar.A();
                int H = xVar.H();
                int m10 = H == 49 ? xVar.m() : 0;
                int A4 = xVar.A();
                if (H == 47) {
                    xVar.O(1);
                }
                boolean z10 = A3 == 181 && (H == 49 || H == 47) && A4 == 3;
                if (H == 49) {
                    z10 &= m10 == 1195456820;
                }
                if (z10) {
                    d(j10, xVar, j0VarArr);
                }
            }
            xVar.N(i13);
        }
    }

    public static void d(long j10, e2.x xVar, j0[] j0VarArr) {
        int A = xVar.A();
        if ((A & 64) != 0) {
            xVar.O(1);
            int i10 = (A & 31) * 3;
            int i11 = xVar.b;
            for (j0 j0Var : j0VarArr) {
                xVar.N(i11);
                j0Var.d(i10, xVar);
                yb.p(j10 != -9223372036854775807L);
                j0Var.c(j10, 1, i10, 0, null);
            }
        }
    }

    public static int e(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + h[i12]) * 2;
        }
        int i14 = g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void f(int i10, e2.x xVar) {
        xVar.K(7);
        byte[] bArr = xVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            return !z10 ? (i11 * 16) / 14 : i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (!z10) {
        }
    }

    public static int h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = t[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? u[i13 - 1] : v[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? w[i13 - 1] : x[i13 - 1] : y[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int i(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static int j(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return OneUIUtilities.ONE_UI_4_0;
            case 10:
                return 100000;
            case 11:
                return androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static a4.g k(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new a4.g(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = copyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b12 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b12;
            }
        }
        a4.g gVar = new a4.g(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            a4.g gVar2 = new a4.g(copyOf, copyOf.length);
            while (gVar2.b() >= 16) {
                gVar2.o(2);
                int g7 = gVar2.g(14) & 16383;
                int min = Math.min(8 - gVar.d, 14);
                int i12 = gVar.d;
                int i13 = (8 - i12) - min;
                byte[] bArr2 = gVar.b;
                int i14 = gVar.c;
                byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b13;
                int i15 = 14 - min;
                bArr2[i14] = (byte) (b13 | ((g7 >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    gVar.b[i16] = (byte) (g7 >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = gVar.b;
                byte b14 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b14;
                bArr3[i16] = (byte) (((g7 & ((1 << i15) - 1)) << i17) | b14);
                gVar.o(14);
                gVar.a();
            }
        }
        gVar.k(copyOf.length, copyOf);
        return gVar;
    }

    public static int l(a4.g gVar) {
        int g7 = gVar.g(4);
        if (g7 == 15) {
            if (gVar.b() >= 24) {
                return gVar.g(24);
            }
            throw x0.a(null, "AAC header insufficient data");
        }
        if (g7 < 13) {
            return a[g7];
        }
        throw x0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a3.l m(a4.g gVar) {
        int i10;
        int i11;
        int g7 = gVar.g(16);
        int g10 = gVar.g(16);
        if (g10 == 65535) {
            g10 = gVar.g(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = g10 + i10;
        if (g7 == 44097) {
            i12 += 2;
        }
        if (gVar.g(2) == 3) {
            do {
                gVar.g(2);
            } while (gVar.f());
        }
        int g11 = gVar.g(10);
        if (gVar.f() && gVar.g(3) > 0) {
            gVar.o(2);
        }
        int i13 = gVar.f() ? 48000 : 44100;
        int g12 = gVar.g(4);
        int[] iArr = i;
        if (i13 == 44100 && g12 == 13) {
            i11 = iArr[g12];
        } else if (i13 != 48000 || g12 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[g12];
            int i15 = g11 % 5;
            if (i15 != 1) {
                if (i15 == 2) {
                    if (g12 != 8) {
                    }
                    i11 = i14 + 1;
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        if (g12 != 3) {
                            if (g12 != 8) {
                            }
                        }
                        i11 = i14 + 1;
                    }
                    i11 = i14;
                }
            }
            if (g12 != 3) {
            }
            i11 = i14 + 1;
        }
        return new a3.l(i13, i12, i11);
    }

    public static a n(a4.g gVar, boolean z10) {
        int g7 = gVar.g(5);
        if (g7 == 31) {
            g7 = gVar.g(6) + 32;
        }
        int l4 = l(gVar);
        int g10 = gVar.g(4);
        String i10 = ic.a.i(g7, "mp4a.40.");
        if (g7 == 5 || g7 == 29) {
            l4 = l(gVar);
            int g11 = gVar.g(5);
            if (g11 == 31) {
                g11 = gVar.g(6) + 32;
            }
            g7 = g11;
            if (g7 == 22) {
                g10 = gVar.g(4);
            }
        }
        if (z10) {
            if (g7 != 1 && g7 != 2 && g7 != 3 && g7 != 4 && g7 != 6 && g7 != 7 && g7 != 17) {
                switch (g7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw x0.c("Unsupported audio object type: " + g7);
                }
            }
            if (gVar.f()) {
                e2.a.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (gVar.f()) {
                gVar.o(14);
            }
            boolean f7 = gVar.f();
            if (g10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (g7 == 6 || g7 == 20) {
                gVar.o(3);
            }
            if (f7) {
                if (g7 == 22) {
                    gVar.o(16);
                }
                if (g7 == 17 || g7 == 19 || g7 == 20 || g7 == 23) {
                    gVar.o(3);
                }
                gVar.o(1);
            }
            switch (g7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int g12 = gVar.g(2);
                    if (g12 == 2 || g12 == 3) {
                        throw x0.c("Unsupported epConfig: " + g12);
                    }
            }
        }
        int i11 = b[g10];
        if (i11 == -1) {
            throw x0.a(null, null);
        }
        a aVar = new a();
        aVar.b = l4;
        aVar.c = i11;
        aVar.a = i10;
        return aVar;
    }

    public static void o(a4.g gVar, c cVar) {
        int g7 = gVar.g(5);
        gVar.o(2);
        if (gVar.f()) {
            gVar.o(5);
        }
        if (g7 >= 7 && g7 <= 10) {
            gVar.n();
        }
        if (gVar.f()) {
            int g10 = gVar.g(3);
            if (cVar.b == -1 && g7 >= 0 && g7 <= 15 && (g10 == 0 || g10 == 1)) {
                cVar.b = g7;
            }
            if (gVar.f()) {
                v(gVar);
            }
        }
    }

    public static void p(a4.g gVar, c cVar) {
        gVar.o(2);
        boolean f7 = gVar.f();
        int g7 = gVar.g(8);
        for (int i10 = 0; i10 < g7; i10++) {
            gVar.o(2);
            if (gVar.f()) {
                gVar.o(5);
            }
            if (f7) {
                gVar.o(24);
            } else {
                if (gVar.f()) {
                    if (!gVar.f()) {
                        gVar.o(4);
                    }
                    cVar.c = gVar.g(6) + 1;
                }
                gVar.o(4);
            }
        }
        if (gVar.f()) {
            gVar.o(3);
            if (gVar.f()) {
                v(gVar);
            }
        }
    }

    public static int q(a4.g gVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && gVar.f(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return gVar.g(iArr[i10]) + i12;
    }

    public static u0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = n0.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                e2.a.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o3.a.d(new e2.x(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    e2.a.m("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new t3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u0(arrayList);
    }

    public static int s(int i10, e2.x xVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return xVar.A() + 1;
            case 7:
                return xVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static rf.b t(e2.x xVar) {
        xVar.O(1);
        int D = xVar.D();
        long j10 = xVar.b + D;
        int i10 = D / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long u10 = xVar.u();
            if (u10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = u10;
            jArr2[i11] = xVar.u();
            xVar.O(2);
            i11++;
        }
        xVar.O((int) (j10 - xVar.b));
        return new rf.b(10, jArr, jArr2);
    }

    public static l0 u(e2.x xVar, boolean z10, boolean z11) {
        if (z10) {
            w(3, xVar, false);
        }
        xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        long r6 = xVar.r();
        String[] strArr = new String[(int) r6];
        for (int i10 = 0; i10 < r6; i10++) {
            strArr[i10] = xVar.y((int) xVar.r(), StandardCharsets.UTF_8);
        }
        if (z11 && (xVar.A() & 1) == 0) {
            throw x0.a(null, "framing bit expected to be set");
        }
        return new l0(strArr);
    }

    public static void v(a4.g gVar) {
        int g7 = gVar.g(6);
        if (g7 < 2 || g7 > 42) {
            throw x0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g7)));
        }
        gVar.o(g7 * 8);
    }

    public static boolean w(int i10, e2.x xVar, boolean z10) {
        if (xVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw x0.a(null, "too short header: " + xVar.a());
        }
        if (xVar.A() != i10) {
            if (z10) {
                return false;
            }
            throw x0.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (xVar.A() == 118 && xVar.A() == 111 && xVar.A() == 114 && xVar.A() == 98 && xVar.A() == 105 && xVar.A() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw x0.a(null, "expected characters 'vorbis'");
    }
}
