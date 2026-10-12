package f2;

import b2.x;
import e9.h0;
import e9.k0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaController;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class p {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        u6.p(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            b(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            b(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            b(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    b(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static String d(x xVar) {
        String str = xVar.s;
        String str2 = xVar.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return MediaController.VIDEO_MIME_TYPE;
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return xVar.s;
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

    public static boolean f(byte[] bArr, int i10, x xVar) {
        int i11;
        if (Objects.equals(xVar.s, MediaController.VIDEO_MIME_TYPE)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(xVar.s, "video/hevc")) {
            a3.l h = h(new t(bArr, 4, i10 + 4));
            int i12 = h.a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && h.c == xVar.J - 1) {
                return false;
            }
        }
        return true;
    }

    public static int g(x xVar) {
        String d10 = d(xVar);
        if (Objects.equals(d10, MediaController.VIDEO_MIME_TYPE)) {
            return 1;
        }
        return (Objects.equals(d10, "video/hevc") || Objects.equals(d10, "video/vvc")) ? 2 : 0;
    }

    public static a3.l h(t tVar) {
        tVar.i();
        return new a3.l(tVar.e(6), tVar.e(6), tVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i i(t tVar, boolean z10, int i10, i iVar) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (z10) {
            int e = tVar.e(2);
            z12 = tVar.d();
            i14 = tVar.e(5);
            i15 = 0;
            for (int i16 = 0; i16 < 32; i16++) {
                if (tVar.d()) {
                    i15 |= 1 << i16;
                }
            }
            for (int i17 = 0; i17 < 6; i17++) {
                iArr2[i17] = tVar.e(8);
            }
            i11 = e;
        } else {
            if (iVar == null) {
                iArr = iArr2;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                z11 = false;
                int e7 = tVar.e(8);
                int i18 = 0;
                for (int i19 = 0; i19 < i10; i19++) {
                    if (tVar.d()) {
                        i18 += 88;
                    }
                    if (tVar.d()) {
                        i18 += 8;
                    }
                }
                tVar.j(i18);
                if (i10 > 0) {
                    tVar.j((8 - i10) * 2);
                }
                return new i(i11, i12, i13, e7, z11, iArr);
            }
            int i20 = iVar.a;
            z12 = iVar.b;
            i14 = iVar.c;
            i15 = iVar.d;
            iArr2 = iVar.e;
            i11 = i20;
        }
        iArr = iArr2;
        z11 = z12;
        i12 = i14;
        i13 = i15;
        int e72 = tVar.e(8);
        int i182 = 0;
        while (i19 < i10) {
        }
        tVar.j(i182);
        if (i10 > 0) {
        }
        return new i(i11, i12, i13, e72, z11, iArr);
    }

    public static com.google.android.gms.internal.cast.a j(int i10, int i11, byte[] bArr) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 == 0 || i11 <= i12) {
            return null;
        }
        t tVar = new t(bArr, i12, i11 + 1);
        while (tVar.b(16)) {
            int e = tVar.e(8);
            int i13 = 0;
            while (e == 255) {
                i13 += 255;
                e = tVar.e(8);
            }
            int i14 = i13 + e;
            int e7 = tVar.e(8);
            int i15 = 0;
            while (e7 == 255) {
                i15 += 255;
                e7 = tVar.e(8);
            }
            int i16 = i15 + e7;
            if (i16 == 0 || !tVar.b(i16)) {
                return null;
            }
            if (i14 == 176) {
                int f7 = tVar.f();
                boolean d10 = tVar.d();
                int f10 = d10 ? tVar.f() : 0;
                int f11 = tVar.f();
                int i17 = -1;
                for (int i18 = 0; i18 <= f11; i18++) {
                    i17 = tVar.f();
                    tVar.f();
                    int e10 = tVar.e(6);
                    if (e10 == 63) {
                        return null;
                    }
                    tVar.e(e10 == 0 ? Math.max(0, f7 - 30) : Math.max(0, (e10 + f7) - 31));
                    if (d10) {
                        int e11 = tVar.e(6);
                        if (e11 == 63) {
                            return null;
                        }
                        tVar.e(e11 == 0 ? Math.max(0, f10 - 30) : Math.max(0, (e11 + f10) - 31));
                    }
                    if (tVar.d()) {
                        tVar.j(10);
                    }
                }
                return new com.google.android.gms.internal.cast.a(i17);
            }
            tVar.j(i16 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l k(byte[] bArr, int i10, int i11, qi.e eVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int f7;
        int i16;
        int f10;
        int i17;
        int i18;
        int i19;
        int f11;
        int i20;
        i iVar;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        j jVar;
        int i31;
        int i32;
        int i33;
        qf.b bVar;
        a3.l h = h(new t(bArr, i10, i11));
        t tVar = new t(bArr, i10 + 2, i11);
        int i34 = 4;
        tVar.j(4);
        int e = tVar.e(3);
        int i35 = h.b;
        boolean z10 = i35 != 0 && e == 7;
        if (eVar != null) {
            n0 n0Var = (n0) eVar.a;
            if (!n0Var.isEmpty()) {
                i12 = ((h) n0Var.get(Math.min(i35, n0Var.size() - 1))).a;
                i iVar2 = null;
                if (z10) {
                    tVar.i();
                    iVar2 = i(tVar, true, e, null);
                } else if (eVar != null) {
                    j jVar2 = (j) eVar.b;
                    int[] iArr = jVar2.b;
                    n0 n0Var2 = jVar2.a;
                    int i36 = iArr[i12];
                    if (n0Var2.size() > i36) {
                        iVar2 = (i) n0Var2.get(i36);
                    }
                }
                tVar.f();
                if (z10) {
                    int f12 = tVar.f();
                    if (f12 == 3) {
                        tVar.i();
                    }
                    int f13 = tVar.f();
                    int f14 = tVar.f();
                    if (tVar.d()) {
                        int f15 = tVar.f();
                        int f16 = tVar.f();
                        int f17 = tVar.f();
                        int f18 = tVar.f();
                        i13 = f13 - ((f15 + f16) * ((f12 == 1 || f12 == 2) ? 2 : 1));
                        i14 = f14 - ((f17 + f18) * (f12 == 1 ? 2 : 1));
                    } else {
                        i13 = f13;
                        i14 = f14;
                    }
                    i15 = i14;
                    f7 = tVar.f();
                    i16 = i13;
                    f10 = tVar.f();
                    i17 = f14;
                    i18 = f13;
                } else {
                    int e7 = tVar.d() ? tVar.e(8) : -1;
                    if (eVar != null && (bVar = (qf.b) eVar.c) != null) {
                        n0 n0Var3 = (n0) bVar.b;
                        if (e7 == -1) {
                            e7 = ((int[]) bVar.c)[i12];
                        }
                        if (e7 != -1 && n0Var3.size() > e7) {
                            k kVar = (k) n0Var3.get(e7);
                            int i37 = kVar.a;
                            i16 = kVar.d;
                            int i38 = kVar.e;
                            f7 = kVar.b;
                            f10 = kVar.c;
                            i15 = i38;
                            i17 = i15;
                            i18 = i16;
                        }
                    }
                    f7 = 0;
                    f10 = 0;
                    i16 = 0;
                    i18 = 0;
                    i15 = 0;
                    i17 = 0;
                }
                int f19 = tVar.f();
                if (z10) {
                    i19 = -1;
                    for (int i39 = tVar.d() ? 0 : e; i39 <= e; i39++) {
                        tVar.f();
                        i19 = Math.max(tVar.f(), i19);
                        tVar.f();
                    }
                } else {
                    i19 = -1;
                }
                tVar.f();
                tVar.f();
                tVar.f();
                tVar.f();
                tVar.f();
                tVar.f();
                if (tVar.d()) {
                    int i40 = 6;
                    if (z10 ? tVar.d() : false) {
                        tVar.j(6);
                    } else if (tVar.d()) {
                        int i41 = 0;
                        while (i41 < i34) {
                            int i42 = 0;
                            while (i42 < i40) {
                                if (tVar.d()) {
                                    int min = Math.min(64, 1 << ((i41 << 1) + 4));
                                    if (i41 > 1) {
                                        tVar.g();
                                    }
                                    for (int i43 = 0; i43 < min; i43++) {
                                        tVar.g();
                                    }
                                } else {
                                    tVar.f();
                                }
                                i42 += i41 == 3 ? 3 : 1;
                                i40 = 6;
                            }
                            i41++;
                            i34 = 4;
                            i40 = 6;
                        }
                    }
                }
                tVar.j(2);
                if (tVar.d()) {
                    tVar.j(8);
                    tVar.f();
                    tVar.f();
                    tVar.i();
                }
                f11 = tVar.f();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i20 = 0;
                int i44 = -1;
                int i45 = -1;
                while (i20 < f11) {
                    if (i20 == 0 || !tVar.d()) {
                        i31 = f11;
                        i32 = i12;
                        i33 = i20;
                        int f20 = tVar.f();
                        i44 = tVar.f();
                        int[] iArr4 = new int[f20];
                        int i46 = 0;
                        while (i46 < f20) {
                            iArr4[i46] = (i46 > 0 ? iArr4[i46 - 1] : 0) - (tVar.f() + 1);
                            tVar.i();
                            i46++;
                        }
                        int[] iArr5 = new int[i44];
                        int i47 = 0;
                        while (i47 < i44) {
                            iArr5[i47] = tVar.f() + 1 + (i47 > 0 ? iArr5[i47 - 1] : 0);
                            tVar.i();
                            i47++;
                        }
                        i45 = f20;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i31 = f11;
                        int i48 = i45 + i44;
                        int f21 = (1 - ((tVar.d() ? 1 : 0) * 2)) * (tVar.f() + 1);
                        i32 = i12;
                        int i49 = i48 + 1;
                        i33 = i20;
                        boolean[] zArr = new boolean[i49];
                        for (int i50 = 0; i50 <= i48; i50++) {
                            if (tVar.d()) {
                                zArr[i50] = true;
                            } else {
                                zArr[i50] = tVar.d();
                            }
                        }
                        int[] iArr6 = new int[i49];
                        int[] iArr7 = new int[i49];
                        int i51 = 0;
                        for (int i52 = i44 - 1; i52 >= 0; i52--) {
                            int i53 = iArr3[i52] + f21;
                            if (i53 < 0 && zArr[i45 + i52]) {
                                iArr6[i51] = i53;
                                i51++;
                            }
                        }
                        if (f21 < 0 && zArr[i48]) {
                            iArr6[i51] = f21;
                            i51++;
                        }
                        int i54 = i51;
                        int[] iArr8 = iArr2;
                        for (int i55 = 0; i55 < i45; i55++) {
                            int i56 = iArr8[i55] + f21;
                            if (i56 < 0 && zArr[i55]) {
                                iArr6[i54] = i56;
                                i54++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i54);
                        int i57 = 0;
                        for (int i58 = i45 - 1; i58 >= 0; i58--) {
                            int i59 = iArr8[i58] + f21;
                            if (i59 > 0 && zArr[i58]) {
                                iArr7[i57] = i59;
                                i57++;
                            }
                        }
                        if (f21 > 0 && zArr[i48]) {
                            iArr7[i57] = f21;
                            i57++;
                        }
                        int i60 = i54;
                        int i61 = i57;
                        for (int i62 = 0; i62 < i44; i62++) {
                            int i63 = iArr3[i62] + f21;
                            if (i63 > 0 && zArr[i45 + i62]) {
                                iArr7[i61] = i63;
                                i61++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i61);
                        i44 = i61;
                        i45 = i60;
                        iArr2 = copyOf;
                    }
                    i20 = i33 + 1;
                    f11 = i31;
                    i12 = i32;
                }
                int i64 = i12;
                if (tVar.d()) {
                    int f22 = tVar.f();
                    for (int i65 = 0; i65 < f22; i65++) {
                        tVar.j(f19 + 5);
                    }
                }
                tVar.j(2);
                float f23 = 1.0f;
                if (tVar.d()) {
                    iVar = iVar2;
                    i21 = f7;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                    i25 = -1;
                    i26 = -1;
                    i27 = -1;
                } else {
                    if (tVar.d()) {
                        int e10 = tVar.e(8);
                        if (e10 == 255) {
                            int e11 = tVar.e(16);
                            int e12 = tVar.e(16);
                            if (e11 != 0 && e12 != 0) {
                                f23 = e11 / e12;
                            }
                        } else if (e10 < 17) {
                            f23 = b[e10];
                        } else {
                            a1.g.x(e10, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (tVar.d()) {
                        tVar.i();
                    }
                    if (tVar.d()) {
                        tVar.j(3);
                        i30 = tVar.d() ? 1 : 2;
                        if (tVar.d()) {
                            int e13 = tVar.e(8);
                            int e14 = tVar.e(8);
                            tVar.j(8);
                            i28 = b2.o.f(e13);
                            i29 = b2.o.g(e14);
                        } else {
                            i28 = -1;
                            i29 = -1;
                        }
                    } else {
                        if (eVar != null && (jVar = (j) eVar.d) != null) {
                            n0 n0Var4 = jVar.a;
                            int i66 = jVar.b[i64];
                            if (n0Var4.size() > i66) {
                                m mVar = (m) n0Var4.get(i66);
                                int i67 = mVar.a;
                                int i68 = mVar.b;
                                i29 = mVar.c;
                                i28 = i67;
                                i30 = i68;
                            }
                        }
                        i28 = -1;
                        i29 = -1;
                        i30 = -1;
                    }
                    if (tVar.d()) {
                        tVar.f();
                        tVar.f();
                    }
                    tVar.i();
                    if (tVar.d()) {
                        i15 *= 2;
                    }
                    i25 = i28;
                    i27 = i29;
                    i26 = i30;
                    iVar = iVar2;
                    i21 = f7;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                }
                return new l(e, iVar, i21, f10, i22, i15, i23, i24, f23, i19, i25, i26, i27);
            }
        }
        i12 = 0;
        i iVar22 = null;
        if (z10) {
        }
        tVar.f();
        if (z10) {
        }
        int f192 = tVar.f();
        if (z10) {
        }
        tVar.f();
        tVar.f();
        tVar.f();
        tVar.f();
        tVar.f();
        tVar.f();
        if (tVar.d()) {
        }
        tVar.j(2);
        if (tVar.d()) {
        }
        f11 = tVar.f();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i20 = 0;
        int i442 = -1;
        int i452 = -1;
        while (i20 < f11) {
        }
        int i642 = i12;
        if (tVar.d()) {
        }
        tVar.j(2);
        float f232 = 1.0f;
        if (tVar.d()) {
        }
        return new l(e, iVar, i21, f10, i22, i15, i23, i24, f232, i19, i25, i26, i27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qi.e l(int i10, int i11, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        x1 x1Var;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i17;
        boolean z11;
        int i18;
        boolean d10;
        int i19;
        int i20;
        int i21;
        boolean d11;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        t tVar = new t(bArr, i10, i11);
        h(tVar);
        tVar.j(4);
        boolean d12 = tVar.d();
        boolean d13 = tVar.d();
        int e = tVar.e(6);
        int i24 = e + 1;
        int e7 = tVar.e(3);
        tVar.j(17);
        i i25 = i(tVar, true, e7, null);
        for (int i26 = tVar.d() ? 0 : e7; i26 <= e7; i26++) {
            tVar.f();
            tVar.f();
            tVar.f();
        }
        int e10 = tVar.e(6);
        int f7 = tVar.f() + 1;
        int i27 = 6;
        int i28 = 1;
        j jVar2 = new j(n0.y(i25), new int[1], 0);
        boolean z14 = i24 >= 2 && f7 >= 2;
        boolean z15 = d12 && d13;
        int i29 = e10 + 1;
        boolean z16 = i29 >= i24;
        if (!z14 || !z15 || !z16) {
            return new qi.e(null, jVar2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, f7, i29);
        int[] iArr6 = new int[f7];
        int[] iArr7 = new int[f7];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i30 = 1; i30 < f7; i30++) {
            int i31 = 0;
            for (int i32 = 0; i32 <= e10; i32++) {
                if (tVar.d()) {
                    iArr5[i30][i31] = i32;
                    iArr7[i30] = i32;
                    i31++;
                }
                iArr6[i30] = i31;
            }
        }
        if (tVar.d()) {
            tVar.j(64);
            if (tVar.d()) {
                tVar.f();
            }
            int f10 = tVar.f();
            int i33 = 0;
            while (i33 < f10) {
                tVar.f();
                if (i33 == 0 || tVar.d()) {
                    boolean d14 = tVar.d();
                    boolean d15 = tVar.d();
                    z13 = d14;
                    z12 = d15;
                    if (d14 || d15) {
                        d10 = tVar.d();
                        if (d10) {
                            tVar.j(19);
                        }
                        tVar.j(8);
                        if (d10) {
                            tVar.j(4);
                        }
                        tVar.j(15);
                        i20 = d14;
                        i19 = d15;
                        i21 = 0;
                        while (i21 <= e7) {
                            boolean d16 = tVar.d();
                            if (!d16) {
                                d16 = tVar.d();
                            }
                            if (d16) {
                                tVar.f();
                                d11 = false;
                            } else {
                                d11 = tVar.d();
                            }
                            if (d11) {
                                i22 = i33;
                                i23 = 0;
                            } else {
                                i22 = i33;
                                i23 = tVar.f();
                            }
                            int[][] iArr8 = iArr5;
                            int i34 = i20 + i19;
                            int[] iArr9 = iArr7;
                            int i35 = 0;
                            while (i35 < i34) {
                                int i36 = i34;
                                for (int i37 = 0; i37 <= i23; i37++) {
                                    tVar.f();
                                    tVar.f();
                                    if (d10) {
                                        tVar.f();
                                        tVar.f();
                                    }
                                    tVar.i();
                                }
                                i35++;
                                i34 = i36;
                            }
                            i21++;
                            i33 = i22;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i33++;
                    }
                } else {
                    z13 = false;
                    z12 = false;
                }
                d10 = false;
                i20 = z13;
                i19 = z12;
                i21 = 0;
                while (i21 <= e7) {
                }
                i33++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!tVar.d()) {
            return new qi.e(null, jVar2, null, null);
        }
        int i38 = tVar.d;
        if (i38 > 0) {
            tVar.j(8 - i38);
        }
        i i39 = i(tVar, false, e7, i25);
        boolean d17 = tVar.d();
        boolean[] zArr3 = new boolean[16];
        int i40 = 0;
        for (int i41 = 0; i41 < 16; i41++) {
            boolean d18 = tVar.d();
            zArr3[i41] = d18;
            if (d18) {
                i40++;
            }
        }
        if (i40 == 0 || !zArr3[1]) {
            return new qi.e(null, jVar2, null, null);
        }
        int[] iArr12 = new int[i40];
        for (int i42 = 0; i42 < i40 - (d17 ? 1 : 0); i42++) {
            iArr12[i42] = tVar.e(3);
        }
        int[] iArr13 = new int[i40 + 1];
        if (d17) {
            int i43 = 1;
            while (i43 < i40) {
                int[] iArr14 = iArr13;
                for (int i44 = 0; i44 < i43; i44++) {
                    iArr14[i43] = iArr12[i44] + 1 + iArr14[i43];
                }
                i43++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i40] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i24, i40);
        int[] iArr16 = new int[i24];
        iArr16[0] = 0;
        boolean d19 = tVar.d();
        int i45 = 1;
        while (i45 < i24) {
            if (d19) {
                i18 = i45;
                iArr16[i18] = tVar.e(i27);
            } else {
                i18 = i45;
                iArr16[i18] = i18;
            }
            if (d17) {
                for (int i46 = 0; i46 < i40; i46++) {
                    iArr15[i18][i46] = (iArr16[i18] & ((1 << iArr[r31]) - 1)) >> iArr[i46];
                }
            } else {
                int i47 = 0;
                while (i47 < i40) {
                    int i48 = i47;
                    iArr15[i18][i48] = tVar.e(iArr12[i47] + 1);
                    i47 = i48 + 1;
                }
            }
            i45 = i18 + 1;
            i27 = 6;
        }
        int[] iArr17 = new int[i29];
        int i49 = 1;
        int i50 = 0;
        while (i50 < i24) {
            iArr17[iArr16[i50]] = -1;
            int[] iArr18 = iArr17;
            int i51 = 0;
            int i52 = 0;
            while (i51 < 16) {
                if (zArr3[i51]) {
                    if (i51 == i28) {
                        iArr18[iArr16[i50]] = iArr15[i50][i52];
                    }
                    i52++;
                }
                i51++;
                i28 = 1;
            }
            if (i50 > 0) {
                int i53 = 0;
                while (true) {
                    if (i53 >= i50) {
                        z11 = true;
                        break;
                    }
                    int i54 = i53;
                    if (iArr18[iArr16[i50]] == iArr18[iArr16[i53]]) {
                        z11 = false;
                        break;
                    }
                    i53 = i54 + 1;
                }
                if (z11) {
                    i49++;
                }
            }
            i50++;
            iArr17 = iArr18;
            i28 = 1;
        }
        int[] iArr19 = iArr17;
        int e11 = tVar.e(4);
        if (i49 < 2 || e11 == 0) {
            return new qi.e(null, jVar2, null, null);
        }
        int[] iArr20 = new int[i49];
        for (int i55 = 0; i55 < i49; i55++) {
            iArr20[i55] = tVar.e(e11);
        }
        int[] iArr21 = new int[i29];
        int i56 = 0;
        while (i56 < i24) {
            iArr21[Math.min(iArr16[i56], e10)] = i56;
            i56++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        k0 t10 = n0.t();
        int i57 = 0;
        while (i57 <= e10) {
            int i58 = i49;
            int[] iArr23 = iArr16;
            int min = Math.min(iArr19[i57], i58 - 1);
            int[] iArr24 = iArr21;
            t10.c(new h(iArr24[i57], min >= 0 ? iArr22[min] : -1));
            i57++;
            i49 = i58;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        x1 f11 = t10.f();
        if (((h) f11.get(0)).b == -1) {
            return new qi.e(null, jVar2, null, null);
        }
        int i59 = 1;
        while (true) {
            if (i59 > e10) {
                i59 = -1;
                break;
            }
            if (((h) f11.get(i59)).b != -1) {
                break;
            }
            i59++;
        }
        if (i59 == -1) {
            return new qi.e(null, jVar2, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        int i60 = 1;
        while (i60 < i24) {
            boolean[][] zArr6 = zArr5;
            for (int i61 = 0; i61 < i60; i61++) {
                boolean[] zArr7 = zArr4[i60];
                boolean[] zArr8 = zArr6[i60];
                boolean d20 = tVar.d();
                zArr8[i61] = d20;
                zArr7[i61] = d20;
            }
            i60++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i62 = 1; i62 < i24; i62++) {
            int i63 = 0;
            while (i63 < e) {
                boolean[][] zArr10 = zArr4;
                int i64 = 0;
                while (true) {
                    if (i64 < i62) {
                        boolean[] zArr11 = zArr9[i62];
                        if (zArr11[i64] && zArr9[i64][i63]) {
                            zArr11[i63] = true;
                            break;
                        }
                        i64++;
                    }
                }
                i63++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i29];
        for (int i65 = 0; i65 < i24; i65++) {
            int i66 = 0;
            for (int i67 = 0; i67 < i65; i67++) {
                i66 += zArr12[i65][i67] ? 1 : 0;
            }
            iArr26[iArr25[i65]] = i66;
        }
        int i68 = 0;
        for (int i69 = 0; i69 < i24; i69++) {
            if (iArr26[iArr25[i69]] == 0) {
                i68++;
            }
        }
        if (i68 > 1) {
            return new qi.e(null, jVar2, null, null);
        }
        int[] iArr27 = new int[i24];
        int[] iArr28 = new int[f7];
        if (tVar.d()) {
            iArr2 = iArr26;
            int i70 = 0;
            while (i70 < i24) {
                int i71 = i70;
                iArr27[i71] = tVar.e(3);
                i70 = i71 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i24, e7);
        }
        int i72 = 0;
        while (i72 < f7) {
            int i73 = i72;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i74 = 0;
            for (int i75 = 0; i75 < iArr6[i73]; i75++) {
                i74 = Math.max(i74, iArr29[((h) f11.get(iArr10[i73][i75])).a]);
            }
            iArr30[i73] = i74 + 1;
            i72 = i73 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (tVar.d()) {
            int i76 = 0;
            while (i76 < e) {
                int i77 = i76 + 1;
                int i78 = i77;
                while (i78 < i24) {
                    if (zArr12[i78][i76]) {
                        i17 = e;
                        tVar.j(3);
                    } else {
                        i17 = e;
                    }
                    i78++;
                    e = i17;
                }
                i76 = i77;
            }
        }
        tVar.i();
        int f12 = tVar.f() + 1;
        k0 t11 = n0.t();
        t11.c(i25);
        if (f12 > 1) {
            t11.c(i39);
            for (int i79 = 2; i79 < f12; i79++) {
                i39 = i(tVar, tVar.d(), e7, i39);
                t11.c(i39);
            }
        }
        x1 f13 = t11.f();
        int f14 = tVar.f() + f7;
        if (f14 > f7) {
            return new qi.e(null, jVar2, null, null);
        }
        int e12 = tVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, f14, i29);
        int[] iArr32 = new int[f14];
        int i80 = 0;
        int[] iArr33 = new int[f14];
        int i81 = 0;
        while (i81 < f7) {
            iArr32[i81] = i80;
            iArr33[i81] = iArr11[i81];
            if (e12 == 0) {
                i16 = i81;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i16], i80, iArr6[i16], true);
                iArr3[i16] = iArr4[i16];
            } else {
                i16 = i81;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (e12 == 1) {
                    int i82 = iArr11[i16];
                    for (int i83 = 0; i83 < iArr4[i16]; i83++) {
                        zArr2[i16][i83] = iArr10[i16][i83] == i82;
                    }
                    iArr3[i16] = 1;
                } else {
                    i80 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i81 = i16 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i80 = 0;
            i81 = i16 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i29];
        int i84 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i29;
        iArr37[i80] = f14;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i85 = 1;
        int i86 = 0;
        while (i85 < f14) {
            if (e12 == i84) {
                for (int i87 = 0; i87 < iArr35[i85]; i87++) {
                    zArr14[i85][i87] = tVar.d();
                    int i88 = iArr34[i85];
                    boolean z17 = zArr14[i85][i87];
                    iArr34[i85] = i88 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr33[i85] = iArr10[i85][i87];
                    }
                }
            }
            if (i86 == 0) {
                i15 = 0;
                if (iArr10[i85][0] == 0 && zArr14[i85][0]) {
                    for (int i89 = 1; i89 < iArr35[i85]; i89++) {
                        if (iArr10[i85][i89] == i59 && zArr14[i85][i59]) {
                            i86 = i85;
                        }
                    }
                }
            } else {
                i15 = 0;
            }
            int i90 = i15;
            while (i90 < iArr35[i85]) {
                if (f12 > 1) {
                    zArr15[i85][i90] = zArr14[i85][i90];
                    x1Var = f13;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c10 = g9.c.c(f12);
                    if (!zArr[i85][i90]) {
                        int i91 = ((h) f11.get(iArr10[i85][i90])).a;
                        int i92 = i15;
                        while (true) {
                            if (i92 >= i90) {
                                break;
                            }
                            int i93 = i92;
                            if (zArr9[i91][((h) f11.get(iArr10[i85][i93])).a]) {
                                zArr[i85][i90] = true;
                                break;
                            }
                            i92 = i93 + 1;
                        }
                    }
                    if (zArr[i85][i90]) {
                        if (i86 <= 0 || i85 != i86) {
                            tVar.j(c10);
                        } else {
                            iArr36[i90] = tVar.e(c10);
                        }
                    }
                } else {
                    x1Var = f13;
                    zArr = zArr15;
                }
                i90++;
                f13 = x1Var;
                zArr15 = zArr;
            }
            x1 x1Var2 = f13;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i85] == 1 && iArr2[iArr33[i85]] > 0) {
                tVar.i();
            }
            i85++;
            f13 = x1Var2;
            zArr15 = zArr16;
            i84 = 2;
        }
        x1 x1Var3 = f13;
        boolean[][] zArr17 = zArr15;
        if (i86 == 0) {
            return new qi.e(null, jVar2, null, null);
        }
        int f15 = tVar.f();
        int i94 = f15 + 1;
        e9.s.f(i94, "expectedSize");
        e9.s.f(i94, "initialCapacity");
        int[] iArr38 = new int[i24];
        Object[] objArr = new Object[i94];
        int i95 = 0;
        int i96 = 0;
        boolean z18 = false;
        while (i95 < i94) {
            int i97 = i95;
            int e13 = tVar.e(16);
            int e14 = tVar.e(16);
            boolean z19 = z18;
            if (tVar.d()) {
                i12 = tVar.e(2);
                if (i12 == 3) {
                    tVar.i();
                }
                i13 = tVar.e(4);
                i14 = tVar.e(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (tVar.d()) {
                int f16 = tVar.f();
                int f17 = tVar.f();
                int f18 = tVar.f();
                int f19 = tVar.f();
                e13 -= (f16 + f17) * ((i12 == 1 || i12 == 2) ? 2 : 1);
                e14 -= (f18 + f19) * (i12 == 1 ? 2 : 1);
            }
            k kVar = new k(i12, i13, i14, e13, e14);
            int b10 = h0.b(objArr.length, i96 + 1);
            if (b10 > objArr.length || z19) {
                objArr = Arrays.copyOf(objArr, b10);
                z10 = false;
            } else {
                z10 = z19;
            }
            objArr[i96] = kVar;
            i96++;
            i95 = i97 + 1;
            z18 = z10;
        }
        if (i94 <= 1 || !tVar.d()) {
            for (int i98 = 1; i98 < i24; i98++) {
                iArr38[i98] = Math.min(i98, f15);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c11 = g9.c.c(i94);
            for (int i99 = 1; i99 < i24; i99++) {
                iArr38[i99] = tVar.e(c11);
            }
        }
        qf.b bVar = new qf.b(n0.s(i96, objArr), iArr38);
        tVar.j(2);
        for (int i100 = 1; i100 < i24; i100++) {
            if (iArr2[iArr25[i100]] == 0) {
                tVar.i();
            }
        }
        for (int i101 = 1; i101 < f14; i101++) {
            boolean d21 = tVar.d();
            int i102 = 0;
            while (i102 < iArr31[i101]) {
                if ((i102 <= 0 || !d21) ? i102 == 0 : tVar.d()) {
                    for (int i103 = 0; i103 < iArr35[i101]; i103++) {
                        if (zArr17[i101][i103]) {
                            tVar.f();
                        }
                    }
                    tVar.f();
                    tVar.f();
                }
                i102++;
            }
        }
        int f20 = tVar.f() + 2;
        if (tVar.d()) {
            tVar.j(f20);
        } else {
            for (int i104 = 1; i104 < i24; i104++) {
                for (int i105 = 0; i105 < i104; i105++) {
                    if (zArr12[i104][i105]) {
                        tVar.j(f20);
                    }
                }
            }
        }
        int f21 = tVar.f();
        for (int i106 = 1; i106 <= f21; i106++) {
            tVar.j(8);
        }
        if (tVar.d()) {
            int i107 = tVar.d;
            if (i107 > 0) {
                tVar.j(8 - i107);
            }
            if (!tVar.d() ? tVar.d() : true) {
                tVar.i();
            }
            boolean d22 = tVar.d();
            boolean d23 = tVar.d();
            if (d22 || d23) {
                for (int i108 = 0; i108 < f7; i108++) {
                    for (int i109 = 0; i109 < iArr31[i108]; i109++) {
                        boolean d24 = d22 ? tVar.d() : false;
                        boolean d25 = d23 ? tVar.d() : false;
                        if (d24) {
                            tVar.j(32);
                        }
                        if (d25) {
                            tVar.j(18);
                        }
                    }
                }
            }
            boolean d26 = tVar.d();
            int e15 = d26 ? tVar.e(4) + 1 : i24;
            e9.s.f(e15, "expectedSize");
            e9.s.f(e15, "initialCapacity");
            int[] iArr39 = new int[i24];
            Object[] objArr2 = new Object[e15];
            int i110 = 0;
            int i111 = 0;
            boolean z20 = false;
            while (i110 < e15) {
                tVar.j(3);
                int i112 = tVar.d() ? 1 : 2;
                int f22 = b2.o.f(tVar.e(8));
                boolean z21 = d26;
                int g10 = b2.o.g(tVar.e(8));
                tVar.j(8);
                m mVar = new m(f22, i112, g10);
                int b11 = h0.b(objArr2.length, i111 + 1);
                if (b11 > objArr2.length || z20) {
                    objArr2 = Arrays.copyOf(objArr2, b11);
                    z20 = false;
                }
                objArr2[i111] = mVar;
                i110++;
                i111++;
                d26 = z21;
                z20 = z20;
            }
            if (d26 && e15 > 1) {
                for (int i113 = 0; i113 < i24; i113++) {
                    iArr39[i113] = tVar.e(4);
                }
            }
            jVar = new j(n0.s(i111, objArr2), iArr39, 1);
        } else {
            jVar = null;
        }
        return new qi.e(f11, new j(x1Var3, iArr36, 0), bVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o m(int i10, int i11, byte[] bArr) {
        int f7;
        int f10;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean d10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f11;
        int i24;
        int i25;
        int i26;
        boolean d11;
        boolean d12;
        int i27;
        t tVar = new t(bArr, i10 + 1, i11);
        int e = tVar.e(8);
        int e7 = tVar.e(8);
        int e10 = tVar.e(8);
        int f12 = tVar.f();
        if (e == 100 || e == 110 || e == 122 || e == 244 || e == 44 || e == 83 || e == 86 || e == 118 || e == 128 || e == 138) {
            f7 = tVar.f();
            boolean d13 = f7 == 3 ? tVar.d() : false;
            int f13 = tVar.f();
            f10 = tVar.f();
            tVar.i();
            if (tVar.d()) {
                int i28 = f7 != 3 ? 8 : 12;
                i12 = 16;
                int i29 = 0;
                while (i29 < i28) {
                    if (tVar.d()) {
                        int i30 = i29 < 6 ? 16 : 64;
                        int i31 = 8;
                        int i32 = 8;
                        for (int i33 = 0; i33 < i30; i33++) {
                            if (i31 != 0) {
                                i31 = ((tVar.g() + i32) + 256) % 256;
                            }
                            if (i31 != 0) {
                                i32 = i31;
                            }
                        }
                    }
                    i29++;
                }
            } else {
                i12 = 16;
            }
            z10 = d13;
            i13 = f13;
        } else {
            f7 = 1;
            i12 = 16;
            i13 = 0;
            z10 = false;
            f10 = 0;
        }
        int f14 = tVar.f() + 4;
        int f15 = tVar.f();
        if (f15 == 0) {
            i17 = tVar.f() + 4;
            i14 = e;
            i15 = f15;
            i16 = f10;
        } else {
            if (f15 == 1) {
                boolean d14 = tVar.d();
                tVar.g();
                tVar.g();
                i14 = e;
                long f16 = tVar.f();
                i15 = f15;
                for (int i34 = 0; i34 < f16; i34++) {
                    tVar.f();
                }
                i16 = f10;
                z11 = d14;
                i17 = 0;
                tVar.f();
                tVar.i();
                int f17 = tVar.f() + 1;
                int f18 = tVar.f() + 1;
                d10 = tVar.d();
                int i35 = 2 - (d10 ? 1 : 0);
                int i36 = f18 * i35;
                if (!d10) {
                    tVar.i();
                }
                tVar.i();
                int i37 = f17 * 16;
                int i38 = i36 * 16;
                if (tVar.d()) {
                    int f19 = tVar.f();
                    int f20 = tVar.f();
                    int f21 = tVar.f();
                    int f22 = tVar.f();
                    if (f7 == 0) {
                        i27 = 1;
                    } else {
                        i27 = f7 == 3 ? 1 : 2;
                        i35 *= f7 == 1 ? 2 : 1;
                    }
                    i37 -= (f19 + f20) * i27;
                    i38 -= (f21 + f22) * i35;
                }
                int i39 = i38;
                int i40 = i37;
                int i41 = i14;
                int i42 = ((i41 != 44 || i41 == 86 || i41 == 100 || i41 == 110 || i41 == 122 || i41 == 244) && (e7 & 16) != 0) ? 0 : i12;
                int i43 = -1;
                float f23 = 1.0f;
                if (tVar.d()) {
                    i18 = f14;
                    i19 = i16;
                    i20 = i42;
                    i21 = -1;
                    i22 = -1;
                    i23 = i17;
                    f11 = 1.0f;
                    i24 = -1;
                } else {
                    if (tVar.d()) {
                        int e11 = tVar.e(8);
                        if (e11 == 255) {
                            int i44 = i12;
                            int e12 = tVar.e(i44);
                            int e13 = tVar.e(i44);
                            if (e12 != 0 && e13 != 0) {
                                f23 = e12 / e13;
                            }
                        } else if (e11 < 17) {
                            f23 = b[e11];
                        } else {
                            i18 = f14;
                            a1.g.x(e11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (tVar.d()) {
                                tVar.i();
                            }
                            if (tVar.d()) {
                                i25 = -1;
                                i26 = -1;
                            } else {
                                tVar.j(3);
                                i25 = tVar.d() ? 1 : 2;
                                if (tVar.d()) {
                                    int e14 = tVar.e(8);
                                    int e15 = tVar.e(8);
                                    tVar.j(8);
                                    i43 = b2.o.f(e14);
                                    i26 = b2.o.g(e15);
                                } else {
                                    i26 = -1;
                                }
                            }
                            if (tVar.d()) {
                                tVar.f();
                                tVar.f();
                            }
                            if (tVar.d()) {
                                tVar.j(65);
                            }
                            d11 = tVar.d();
                            if (d11) {
                                n(tVar);
                            }
                            d12 = tVar.d();
                            if (d12) {
                                n(tVar);
                            }
                            if (!d11 || d12) {
                                tVar.i();
                            }
                            tVar.i();
                            if (tVar.d()) {
                                tVar.i();
                                tVar.f();
                                tVar.f();
                                tVar.f();
                                tVar.f();
                                i42 = tVar.f();
                                tVar.f();
                            }
                            int i45 = i43;
                            i23 = i17;
                            f11 = f23;
                            i24 = i45;
                            i21 = i25;
                            i22 = i26;
                            i19 = i16;
                            i20 = i42;
                        }
                    }
                    i18 = f14;
                    if (tVar.d()) {
                    }
                    if (tVar.d()) {
                    }
                    if (tVar.d()) {
                    }
                    if (tVar.d()) {
                    }
                    d11 = tVar.d();
                    if (d11) {
                    }
                    d12 = tVar.d();
                    if (d12) {
                    }
                    if (!d11) {
                    }
                    tVar.i();
                    tVar.i();
                    if (tVar.d()) {
                    }
                    int i452 = i43;
                    i23 = i17;
                    f11 = f23;
                    i24 = i452;
                    i21 = i25;
                    i22 = i26;
                    i19 = i16;
                    i20 = i42;
                }
                return new o(i41, e7, e10, f12, i40, i39, f11, i13, i19, z10, d10, i18, i15, i23, z11, i24, i21, i22, i20);
            }
            i14 = e;
            i15 = f15;
            i16 = f10;
            i17 = 0;
        }
        z11 = false;
        tVar.f();
        tVar.i();
        int f172 = tVar.f() + 1;
        int f182 = tVar.f() + 1;
        d10 = tVar.d();
        int i352 = 2 - (d10 ? 1 : 0);
        int i362 = f182 * i352;
        if (!d10) {
        }
        tVar.i();
        int i372 = f172 * 16;
        int i382 = i362 * 16;
        if (tVar.d()) {
        }
        int i392 = i382;
        int i402 = i372;
        int i412 = i14;
        if (i412 != 44) {
        }
        int i432 = -1;
        float f232 = 1.0f;
        if (tVar.d()) {
        }
        return new o(i412, e7, e10, f12, i402, i392, f11, i13, i19, z10, d10, i18, i15, i23, z11, i24, i21, i22, i20);
    }

    public static void n(t tVar) {
        int f7 = tVar.f() + 1;
        tVar.j(8);
        for (int i10 = 0; i10 < f7; i10++) {
            tVar.f();
            tVar.f();
            tVar.i();
        }
        tVar.j(20);
    }

    public static ArrayList o(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = asReadOnlyBuffer.get();
                int i10 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b11 = asReadOnlyBuffer.get();
                        remaining |= (b11 & Byte.MAX_VALUE) << (i11 * 7);
                        if ((b11 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new r(i10, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int p(int i10, byte[] bArr) {
        int i11;
        synchronized (c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = d;
                    if (iArr.length <= i13) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
