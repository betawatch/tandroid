package j3;

import h3.t1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.OneUIUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public static final String[] m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] n = {44100, 48000, 32000};
    public static final int[] o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] r = {32000, OneUIUtilities.ONE_UI_4_0, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] s = {8000, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 24000, 32000, OneUIUtilities.ONE_UI_4_0, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int b(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 < 0 || i9 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = d[i9];
        if (i12 == 44100) {
            return ((i10 % 2) + h[i11]) * 2;
        }
        int i13 = g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void c(int i9, d5.y yVar) {
        yVar.z(7);
        byte[] bArr = yVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i9 >> 16) & 255);
        bArr[5] = (byte) ((i9 >> 8) & 255);
        bArr[6] = (byte) (i9 & 255);
    }

    public static int d(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = n[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? o[i12 - 1] : p[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? q[i12 - 1] : r[i12 - 1] : s[i12 - 1];
        if (i10 == 3) {
            return ((i16 * 144) / i14) + i15;
        }
        return (((i11 == 1 ? 72 : 144) * i16) / i14) + i15;
    }

    public static long e(byte b10, byte b11) {
        int i9;
        int i10 = b10 & 255;
        int i11 = b10 & 3;
        if (i11 != 0) {
            i9 = 2;
            if (i11 != 1 && i11 != 2) {
                i9 = b11 & 63;
            }
        } else {
            i9 = 1;
        }
        int i12 = i10 >> 3;
        return i9 * (i12 >= 16 ? 2500 << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int f(d5.x xVar) {
        int i9 = xVar.i(4);
        if (i9 == 15) {
            if (xVar.b() >= 24) {
                return xVar.i(24);
            }
            throw t1.a("AAC header insufficient data", null);
        }
        if (i9 < 13) {
            return a[i9];
        }
        throw t1.a("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a8.b g(d5.x xVar) {
        int i9;
        int i10;
        int i11 = xVar.i(16);
        int i12 = xVar.i(16);
        if (i12 == 65535) {
            i12 = xVar.i(24);
            i9 = 7;
        } else {
            i9 = 4;
        }
        int i13 = i12 + i9;
        if (i11 == 44097) {
            i13 += 2;
        }
        if (xVar.i(2) == 3) {
            do {
                xVar.i(2);
            } while (xVar.h());
        }
        int i14 = xVar.i(10);
        if (xVar.h() && xVar.i(3) > 0) {
            xVar.s(2);
        }
        int i15 = xVar.h() ? 48000 : 44100;
        int i16 = xVar.i(4);
        int[] iArr = i;
        if (i15 == 44100 && i16 == 13) {
            i10 = iArr[i16];
        } else if (i15 != 48000 || i16 >= 14) {
            i10 = 0;
        } else {
            int i17 = iArr[i16];
            int i18 = i14 % 5;
            if (i18 != 1) {
                if (i18 == 2) {
                    if (i16 != 8) {
                    }
                    i10 = i17 + 1;
                } else if (i18 != 3) {
                    if (i18 == 4) {
                        if (i16 != 3) {
                            if (i16 != 8) {
                            }
                        }
                        i10 = i17 + 1;
                    }
                    i10 = i17;
                }
            }
            if (i16 != 3) {
            }
            i10 = i17 + 1;
        }
        return new a8.b(i15, i13, i10);
    }

    public static a h(d5.x xVar, boolean z10) {
        int i9 = xVar.i(5);
        if (i9 == 31) {
            i9 = xVar.i(6) + 32;
        }
        int f10 = f(xVar);
        int i10 = xVar.i(4);
        String l10 = r0.l(i9, "mp4a.40.");
        if (i9 == 5 || i9 == 29) {
            f10 = f(xVar);
            int i11 = xVar.i(5);
            if (i11 == 31) {
                i11 = xVar.i(6) + 32;
            }
            i9 = i11;
            if (i9 == 22) {
                i10 = xVar.i(4);
            }
        }
        if (z10) {
            if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4 && i9 != 6 && i9 != 7 && i9 != 17) {
                switch (i9) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw t1.c("Unsupported audio object type: " + i9);
                }
            }
            if (xVar.h()) {
                d5.a.K("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (xVar.h()) {
                xVar.s(14);
            }
            boolean h10 = xVar.h();
            if (i10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i9 == 6 || i9 == 20) {
                xVar.s(3);
            }
            if (h10) {
                if (i9 == 22) {
                    xVar.s(16);
                }
                if (i9 == 17 || i9 == 19 || i9 == 20 || i9 == 23) {
                    xVar.s(3);
                }
                xVar.s(1);
            }
            switch (i9) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i12 = xVar.i(2);
                    if (i12 == 2 || i12 == 3) {
                        throw t1.c("Unsupported epConfig: " + i12);
                    }
            }
        }
        int i13 = b[i10];
        if (i13 == -1) {
            throw t1.a(null, null);
        }
        a aVar = new a();
        aVar.a = f10;
        aVar.b = i13;
        aVar.c = l10;
        return aVar;
    }

    public static int i(int i9) {
        int i10;
        int i11;
        if ((i9 & (-2097152)) == -2097152 && (i10 = (i9 >>> 19) & 3) != 1 && (i11 = (i9 >>> 17) & 3) != 0) {
            int i12 = (i9 >>> 12) & 15;
            int i13 = (i9 >>> 10) & 3;
            if (i12 != 0 && i12 != 15 && i13 != 3) {
                if (i11 == 1) {
                    return i10 == 3 ? 1152 : 576;
                }
                if (i11 == 2) {
                    return 1152;
                }
                if (i11 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }
}
