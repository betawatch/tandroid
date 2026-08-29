package l3;

import j3.t1;
import j7.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.OneUIUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static int b(int i10, int i11) {
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

    public static void c(int i10, f5.w wVar) {
        wVar.z(7);
        byte[] bArr = wVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int d(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = n[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? o[i13 - 1] : p[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? q[i13 - 1] : r[i13 - 1] : s[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static long e(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r6 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int f(f5.v vVar) {
        int i10 = vVar.i(4);
        if (i10 == 15) {
            if (vVar.b() >= 24) {
                return vVar.i(24);
            }
            throw t1.a("AAC header insufficient data", null);
        }
        if (i10 < 13) {
            return a[i10];
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
    public static c8.a g(f5.v vVar) {
        int i10;
        int i11;
        int i12 = vVar.i(16);
        int i13 = vVar.i(16);
        if (i13 == 65535) {
            i13 = vVar.i(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i14 = i13 + i10;
        if (i12 == 44097) {
            i14 += 2;
        }
        if (vVar.i(2) == 3) {
            do {
                vVar.i(2);
            } while (vVar.h());
        }
        int i15 = vVar.i(10);
        if (vVar.h() && vVar.i(3) > 0) {
            vVar.s(2);
        }
        int i16 = vVar.h() ? 48000 : 44100;
        int i17 = vVar.i(4);
        int[] iArr = i;
        if (i16 == 44100 && i17 == 13) {
            i11 = iArr[i17];
        } else if (i16 != 48000 || i17 >= 14) {
            i11 = 0;
        } else {
            int i18 = iArr[i17];
            int i19 = i15 % 5;
            if (i19 != 1) {
                if (i19 == 2) {
                    if (i17 != 8) {
                    }
                    i11 = i18 + 1;
                } else if (i19 != 3) {
                    if (i19 == 4) {
                        if (i17 != 3) {
                            if (i17 != 8) {
                            }
                        }
                        i11 = i18 + 1;
                    }
                    i11 = i18;
                }
            }
            if (i17 != 3) {
            }
            i11 = i18 + 1;
        }
        return new c8.a(i16, i14, i11);
    }

    public static a h(f5.v vVar, boolean z10) {
        int i10 = vVar.i(5);
        if (i10 == 31) {
            i10 = vVar.i(6) + 32;
        }
        int f9 = f(vVar);
        int i11 = vVar.i(4);
        String k9 = l1.k(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            f9 = f(vVar);
            int i12 = vVar.i(5);
            if (i12 == 31) {
                i12 = vVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = vVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw t1.c("Unsupported audio object type: " + i10);
                }
            }
            if (vVar.h()) {
                f5.a.K("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (vVar.h()) {
                vVar.s(14);
            }
            boolean h10 = vVar.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                vVar.s(3);
            }
            if (h10) {
                if (i10 == 22) {
                    vVar.s(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    vVar.s(3);
                }
                vVar.s(1);
            }
            switch (i10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i13 = vVar.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw t1.c("Unsupported epConfig: " + i13);
                    }
            }
        }
        int i14 = b[i11];
        if (i14 == -1) {
            throw t1.a(null, null);
        }
        a aVar = new a();
        aVar.a = f9;
        aVar.b = i14;
        aVar.c = k9;
        return aVar;
    }

    public static int i(int i10) {
        int i11;
        int i12;
        if ((i10 & (-2097152)) == -2097152 && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0) {
            int i13 = (i10 >>> 12) & 15;
            int i14 = (i10 >>> 10) & 3;
            if (i13 != 0 && i13 != 15 && i14 != 3) {
                if (i12 == 1) {
                    return i11 == 3 ? 1152 : 576;
                }
                if (i12 == 2) {
                    return 1152;
                }
                if (i12 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }
}
