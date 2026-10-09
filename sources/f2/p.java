package f2;

import b2.r0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.vision.e2;
import e9.a1;
import e9.f0;
import e9.i0;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import n4.x;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class p {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        e2.d.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
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

    public static boolean c(byte[] bArr, int i10, b2.s sVar) {
        int i11;
        if (Objects.equals(sVar.r, MediaController.VIDEO_MIME_TYPE)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(sVar.r, "video/hevc")) {
            a3.l e7 = e(new a4.g(bArr, 4, i10 + 4));
            int i12 = e7.a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && e7.c == sVar.I - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(b2.s sVar) {
        if (Objects.equals(sVar.r, MediaController.VIDEO_MIME_TYPE)) {
            return 1;
        }
        return (Objects.equals(sVar.r, "video/hevc") || r0.b(sVar.k, "video/hevc") != null) ? 2 : 0;
    }

    public static a3.l e(a4.g gVar) {
        gVar.s();
        return new a3.l(gVar.i(6), gVar.i(6), gVar.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i f(a4.g gVar, boolean z10, int i10, i iVar) {
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
            int i16 = gVar.i(2);
            z12 = gVar.h();
            i14 = gVar.i(5);
            i15 = 0;
            for (int i17 = 0; i17 < 32; i17++) {
                if (gVar.h()) {
                    i15 |= 1 << i17;
                }
            }
            for (int i18 = 0; i18 < 6; i18++) {
                iArr2[i18] = gVar.i(8);
            }
            i11 = i16;
        } else {
            if (iVar == null) {
                iArr = iArr2;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                z11 = false;
                int i19 = gVar.i(8);
                int i20 = 0;
                for (int i21 = 0; i21 < i10; i21++) {
                    if (gVar.h()) {
                        i20 += 88;
                    }
                    if (gVar.h()) {
                        i20 += 8;
                    }
                }
                gVar.t(i20);
                if (i10 > 0) {
                    gVar.t((8 - i10) * 2);
                }
                return new i(i11, i12, i13, i19, z11, iArr);
            }
            int i22 = iVar.a;
            z12 = iVar.b;
            i14 = iVar.c;
            i15 = iVar.d;
            iArr2 = iVar.e;
            i11 = i22;
        }
        iArr = iArr2;
        z11 = z12;
        i12 = i14;
        i13 = i15;
        int i192 = gVar.i(8);
        int i202 = 0;
        while (i21 < i10) {
        }
        gVar.t(i202);
        if (i10 > 0) {
        }
        return new i(i11, i12, i13, i192, z11, iArr);
    }

    public static com.google.android.gms.internal.cast.a g(int i10, int i11, byte[] bArr) {
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
        a4.g gVar = new a4.g(bArr, i12, i11 + 1);
        while (gVar.d(16)) {
            int i13 = gVar.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += 255;
                i13 = gVar.i(8);
            }
            int i15 = i14 + i13;
            int i16 = gVar.i(8);
            int i17 = 0;
            while (i16 == 255) {
                i17 += 255;
                i16 = gVar.i(8);
            }
            int i18 = i17 + i16;
            if (i18 == 0 || !gVar.d(i18)) {
                return null;
            }
            if (i15 == 176) {
                int m10 = gVar.m();
                boolean h = gVar.h();
                int m11 = h ? gVar.m() : 0;
                int m12 = gVar.m();
                int i19 = -1;
                for (int i20 = 0; i20 <= m12; i20++) {
                    i19 = gVar.m();
                    gVar.m();
                    int i21 = gVar.i(6);
                    if (i21 == 63) {
                        return null;
                    }
                    gVar.i(i21 == 0 ? Math.max(0, m10 - 30) : Math.max(0, (i21 + m10) - 31));
                    if (h) {
                        int i22 = gVar.i(6);
                        if (i22 == 63) {
                            return null;
                        }
                        gVar.i(i22 == 0 ? Math.max(0, m11 - 30) : Math.max(0, (i22 + m11) - 31));
                    }
                    if (gVar.h()) {
                        gVar.t(10);
                    }
                }
                return new com.google.android.gms.internal.cast.a(i19);
            }
            gVar.t(i18 * 8);
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
    public static l h(byte[] bArr, int i10, int i11, oi.f fVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m10;
        int i16;
        int m11;
        int i17;
        int i18;
        int i19;
        int m12;
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
        x xVar;
        a3.l e7 = e(new a4.g(bArr, i10, i11));
        a4.g gVar = new a4.g(bArr, i10 + 2, i11);
        int i34 = 4;
        gVar.t(4);
        int i35 = gVar.i(3);
        int i36 = e7.b;
        boolean z10 = i36 != 0 && i35 == 7;
        if (fVar != null) {
            i0 i0Var = (i0) fVar.a;
            if (!i0Var.isEmpty()) {
                i12 = ((h) i0Var.get(Math.min(i36, i0Var.size() - 1))).a;
                i iVar2 = null;
                if (z10) {
                    gVar.s();
                    iVar2 = f(gVar, true, i35, null);
                } else if (fVar != null) {
                    j jVar2 = (j) fVar.b;
                    int[] iArr = jVar2.b;
                    i0 i0Var2 = jVar2.a;
                    int i37 = iArr[i12];
                    if (i0Var2.size() > i37) {
                        iVar2 = (i) i0Var2.get(i37);
                    }
                }
                gVar.m();
                if (z10) {
                    int m13 = gVar.m();
                    if (m13 == 3) {
                        gVar.s();
                    }
                    int m14 = gVar.m();
                    int m15 = gVar.m();
                    if (gVar.h()) {
                        int m16 = gVar.m();
                        int m17 = gVar.m();
                        int m18 = gVar.m();
                        int m19 = gVar.m();
                        i13 = m14 - ((m16 + m17) * ((m13 == 1 || m13 == 2) ? 2 : 1));
                        i14 = m15 - ((m18 + m19) * (m13 == 1 ? 2 : 1));
                    } else {
                        i13 = m14;
                        i14 = m15;
                    }
                    i15 = i14;
                    m10 = gVar.m();
                    i16 = i13;
                    m11 = gVar.m();
                    i17 = m15;
                    i18 = m14;
                } else {
                    int i38 = gVar.h() ? gVar.i(8) : -1;
                    if (fVar != null && (xVar = (x) fVar.c) != null) {
                        i0 i0Var3 = (i0) xVar.b;
                        if (i38 == -1) {
                            i38 = ((int[]) xVar.c)[i12];
                        }
                        if (i38 != -1 && i0Var3.size() > i38) {
                            k kVar = (k) i0Var3.get(i38);
                            int i39 = kVar.a;
                            i16 = kVar.d;
                            int i40 = kVar.e;
                            m10 = kVar.b;
                            m11 = kVar.c;
                            i15 = i40;
                            i17 = i15;
                            i18 = i16;
                        }
                    }
                    m10 = 0;
                    m11 = 0;
                    i16 = 0;
                    i18 = 0;
                    i15 = 0;
                    i17 = 0;
                }
                int m20 = gVar.m();
                if (z10) {
                    i19 = -1;
                    for (int i41 = gVar.h() ? 0 : i35; i41 <= i35; i41++) {
                        gVar.m();
                        i19 = Math.max(gVar.m(), i19);
                        gVar.m();
                    }
                } else {
                    i19 = -1;
                }
                gVar.m();
                gVar.m();
                gVar.m();
                gVar.m();
                gVar.m();
                gVar.m();
                if (gVar.h()) {
                    int i42 = 6;
                    if (z10 ? gVar.h() : false) {
                        gVar.t(6);
                    } else if (gVar.h()) {
                        int i43 = 0;
                        while (i43 < i34) {
                            int i44 = 0;
                            while (i44 < i42) {
                                if (gVar.h()) {
                                    int min = Math.min(64, 1 << ((i43 << 1) + 4));
                                    if (i43 > 1) {
                                        gVar.n();
                                    }
                                    for (int i45 = 0; i45 < min; i45++) {
                                        gVar.n();
                                    }
                                } else {
                                    gVar.m();
                                }
                                i44 += i43 == 3 ? 3 : 1;
                                i42 = 6;
                            }
                            i43++;
                            i34 = 4;
                            i42 = 6;
                        }
                    }
                }
                gVar.t(2);
                if (gVar.h()) {
                    gVar.t(8);
                    gVar.m();
                    gVar.m();
                    gVar.s();
                }
                m12 = gVar.m();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i20 = 0;
                int i46 = -1;
                int i47 = -1;
                while (i20 < m12) {
                    if (i20 == 0 || !gVar.h()) {
                        i31 = m12;
                        i32 = i12;
                        i33 = i20;
                        int m21 = gVar.m();
                        i46 = gVar.m();
                        int[] iArr4 = new int[m21];
                        int i48 = 0;
                        while (i48 < m21) {
                            iArr4[i48] = (i48 > 0 ? iArr4[i48 - 1] : 0) - (gVar.m() + 1);
                            gVar.s();
                            i48++;
                        }
                        int[] iArr5 = new int[i46];
                        int i49 = 0;
                        while (i49 < i46) {
                            iArr5[i49] = gVar.m() + 1 + (i49 > 0 ? iArr5[i49 - 1] : 0);
                            gVar.s();
                            i49++;
                        }
                        i47 = m21;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i31 = m12;
                        int i50 = i47 + i46;
                        int m22 = (1 - ((gVar.h() ? 1 : 0) * 2)) * (gVar.m() + 1);
                        i32 = i12;
                        int i51 = i50 + 1;
                        i33 = i20;
                        boolean[] zArr = new boolean[i51];
                        for (int i52 = 0; i52 <= i50; i52++) {
                            if (gVar.h()) {
                                zArr[i52] = true;
                            } else {
                                zArr[i52] = gVar.h();
                            }
                        }
                        int[] iArr6 = new int[i51];
                        int[] iArr7 = new int[i51];
                        int i53 = 0;
                        for (int i54 = i46 - 1; i54 >= 0; i54--) {
                            int i55 = iArr3[i54] + m22;
                            if (i55 < 0 && zArr[i47 + i54]) {
                                iArr6[i53] = i55;
                                i53++;
                            }
                        }
                        if (m22 < 0 && zArr[i50]) {
                            iArr6[i53] = m22;
                            i53++;
                        }
                        int i56 = i53;
                        int[] iArr8 = iArr2;
                        for (int i57 = 0; i57 < i47; i57++) {
                            int i58 = iArr8[i57] + m22;
                            if (i58 < 0 && zArr[i57]) {
                                iArr6[i56] = i58;
                                i56++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i56);
                        int i59 = 0;
                        for (int i60 = i47 - 1; i60 >= 0; i60--) {
                            int i61 = iArr8[i60] + m22;
                            if (i61 > 0 && zArr[i60]) {
                                iArr7[i59] = i61;
                                i59++;
                            }
                        }
                        if (m22 > 0 && zArr[i50]) {
                            iArr7[i59] = m22;
                            i59++;
                        }
                        int i62 = i56;
                        int i63 = i59;
                        for (int i64 = 0; i64 < i46; i64++) {
                            int i65 = iArr3[i64] + m22;
                            if (i65 > 0 && zArr[i47 + i64]) {
                                iArr7[i63] = i65;
                                i63++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i63);
                        i46 = i63;
                        i47 = i62;
                        iArr2 = copyOf;
                    }
                    i20 = i33 + 1;
                    m12 = i31;
                    i12 = i32;
                }
                int i66 = i12;
                if (gVar.h()) {
                    int m23 = gVar.m();
                    for (int i67 = 0; i67 < m23; i67++) {
                        gVar.t(m20 + 5);
                    }
                }
                gVar.t(2);
                float f7 = 1.0f;
                if (gVar.h()) {
                    iVar = iVar2;
                    i21 = m10;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                    i25 = -1;
                    i26 = -1;
                    i27 = -1;
                } else {
                    if (gVar.h()) {
                        int i68 = gVar.i(8);
                        if (i68 == 255) {
                            int i69 = gVar.i(16);
                            int i70 = gVar.i(16);
                            if (i69 != 0 && i70 != 0) {
                                f7 = i69 / i70;
                            }
                        } else if (i68 < 17) {
                            f7 = b[i68];
                        } else {
                            e2.m(i68, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (gVar.h()) {
                        gVar.s();
                    }
                    if (gVar.h()) {
                        gVar.t(3);
                        i30 = gVar.h() ? 1 : 2;
                        if (gVar.h()) {
                            int i71 = gVar.i(8);
                            int i72 = gVar.i(8);
                            gVar.t(8);
                            i28 = b2.j.f(i71);
                            i29 = b2.j.g(i72);
                        } else {
                            i28 = -1;
                            i29 = -1;
                        }
                    } else {
                        if (fVar != null && (jVar = (j) fVar.d) != null) {
                            i0 i0Var4 = jVar.a;
                            int i73 = jVar.b[i66];
                            if (i0Var4.size() > i73) {
                                m mVar = (m) i0Var4.get(i73);
                                int i74 = mVar.a;
                                int i75 = mVar.b;
                                i29 = mVar.c;
                                i28 = i74;
                                i30 = i75;
                            }
                        }
                        i28 = -1;
                        i29 = -1;
                        i30 = -1;
                    }
                    if (gVar.h()) {
                        gVar.m();
                        gVar.m();
                    }
                    gVar.s();
                    if (gVar.h()) {
                        i15 *= 2;
                    }
                    i25 = i28;
                    i27 = i29;
                    i26 = i30;
                    iVar = iVar2;
                    i21 = m10;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                }
                return new l(i35, iVar, i21, m11, i22, i15, i23, i24, f7, i19, i25, i26, i27);
            }
        }
        i12 = 0;
        i iVar22 = null;
        if (z10) {
        }
        gVar.m();
        if (z10) {
        }
        int m202 = gVar.m();
        if (z10) {
        }
        gVar.m();
        gVar.m();
        gVar.m();
        gVar.m();
        gVar.m();
        gVar.m();
        if (gVar.h()) {
        }
        gVar.t(2);
        if (gVar.h()) {
        }
        m12 = gVar.m();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i20 = 0;
        int i462 = -1;
        int i472 = -1;
        while (i20 < m12) {
        }
        int i662 = i12;
        if (gVar.h()) {
        }
        gVar.t(2);
        float f72 = 1.0f;
        if (gVar.h()) {
        }
        return new l(i35, iVar, i21, m11, i22, i15, i23, i24, f72, i19, i25, i26, i27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oi.f i(int i10, int i11, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        a1 a1Var;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i17;
        boolean z11;
        int i18;
        boolean h;
        int i19;
        int i20;
        int i21;
        boolean h10;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        a4.g gVar = new a4.g(bArr, i10, i11);
        e(gVar);
        gVar.t(4);
        boolean h11 = gVar.h();
        boolean h12 = gVar.h();
        int i24 = gVar.i(6);
        int i25 = i24 + 1;
        int i26 = gVar.i(3);
        gVar.t(17);
        i f7 = f(gVar, true, i26, null);
        for (int i27 = gVar.h() ? 0 : i26; i27 <= i26; i27++) {
            gVar.m();
            gVar.m();
            gVar.m();
        }
        int i28 = gVar.i(6);
        int m10 = gVar.m() + 1;
        int i29 = 6;
        int i30 = 1;
        j jVar2 = new j(i0.z(f7), new int[1], 0);
        boolean z14 = i25 >= 2 && m10 >= 2;
        boolean z15 = h11 && h12;
        int i31 = i28 + 1;
        boolean z16 = i31 >= i25;
        if (!z14 || !z15 || !z16) {
            return new oi.f(null, jVar2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, m10, i31);
        int[] iArr6 = new int[m10];
        int[] iArr7 = new int[m10];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i32 = 1; i32 < m10; i32++) {
            int i33 = 0;
            for (int i34 = 0; i34 <= i28; i34++) {
                if (gVar.h()) {
                    iArr5[i32][i33] = i34;
                    iArr7[i32] = i34;
                    i33++;
                }
                iArr6[i32] = i33;
            }
        }
        if (gVar.h()) {
            gVar.t(64);
            if (gVar.h()) {
                gVar.m();
            }
            int m11 = gVar.m();
            int i35 = 0;
            while (i35 < m11) {
                gVar.m();
                if (i35 == 0 || gVar.h()) {
                    boolean h13 = gVar.h();
                    boolean h14 = gVar.h();
                    z13 = h13;
                    z12 = h14;
                    if (h13 || h14) {
                        h = gVar.h();
                        if (h) {
                            gVar.t(19);
                        }
                        gVar.t(8);
                        if (h) {
                            gVar.t(4);
                        }
                        gVar.t(15);
                        i20 = h13;
                        i19 = h14;
                        i21 = 0;
                        while (i21 <= i26) {
                            boolean h15 = gVar.h();
                            if (!h15) {
                                h15 = gVar.h();
                            }
                            if (h15) {
                                gVar.m();
                                h10 = false;
                            } else {
                                h10 = gVar.h();
                            }
                            if (h10) {
                                i22 = i35;
                                i23 = 0;
                            } else {
                                i22 = i35;
                                i23 = gVar.m();
                            }
                            int[][] iArr8 = iArr5;
                            int i36 = i20 + i19;
                            int[] iArr9 = iArr7;
                            int i37 = 0;
                            while (i37 < i36) {
                                int i38 = i36;
                                for (int i39 = 0; i39 <= i23; i39++) {
                                    gVar.m();
                                    gVar.m();
                                    if (h) {
                                        gVar.m();
                                        gVar.m();
                                    }
                                    gVar.s();
                                }
                                i37++;
                                i36 = i38;
                            }
                            i21++;
                            i35 = i22;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i35++;
                    }
                } else {
                    z13 = false;
                    z12 = false;
                }
                h = false;
                i20 = z13;
                i19 = z12;
                i21 = 0;
                while (i21 <= i26) {
                }
                i35++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!gVar.h()) {
            return new oi.f(null, jVar2, null, null);
        }
        int i40 = gVar.e;
        if (i40 > 0) {
            gVar.t(8 - i40);
        }
        i f10 = f(gVar, false, i26, f7);
        boolean h16 = gVar.h();
        boolean[] zArr3 = new boolean[16];
        int i41 = 0;
        for (int i42 = 0; i42 < 16; i42++) {
            boolean h17 = gVar.h();
            zArr3[i42] = h17;
            if (h17) {
                i41++;
            }
        }
        if (i41 == 0 || !zArr3[1]) {
            return new oi.f(null, jVar2, null, null);
        }
        int[] iArr12 = new int[i41];
        for (int i43 = 0; i43 < i41 - (h16 ? 1 : 0); i43++) {
            iArr12[i43] = gVar.i(3);
        }
        int[] iArr13 = new int[i41 + 1];
        if (h16) {
            int i44 = 1;
            while (i44 < i41) {
                int[] iArr14 = iArr13;
                for (int i45 = 0; i45 < i44; i45++) {
                    iArr14[i44] = iArr12[i45] + 1 + iArr14[i44];
                }
                i44++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i41] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i25, i41);
        int[] iArr16 = new int[i25];
        iArr16[0] = 0;
        boolean h18 = gVar.h();
        int i46 = 1;
        while (i46 < i25) {
            if (h18) {
                i18 = i46;
                iArr16[i18] = gVar.i(i29);
            } else {
                i18 = i46;
                iArr16[i18] = i18;
            }
            if (h16) {
                for (int i47 = 0; i47 < i41; i47++) {
                    iArr15[i18][i47] = (iArr16[i18] & ((1 << iArr[r31]) - 1)) >> iArr[i47];
                }
            } else {
                int i48 = 0;
                while (i48 < i41) {
                    int i49 = i48;
                    iArr15[i18][i49] = gVar.i(iArr12[i48] + 1);
                    i48 = i49 + 1;
                }
            }
            i46 = i18 + 1;
            i29 = 6;
        }
        int[] iArr17 = new int[i31];
        int i50 = 1;
        int i51 = 0;
        while (i51 < i25) {
            iArr17[iArr16[i51]] = -1;
            int[] iArr18 = iArr17;
            int i52 = 0;
            int i53 = 0;
            while (i52 < 16) {
                if (zArr3[i52]) {
                    if (i52 == i30) {
                        iArr18[iArr16[i51]] = iArr15[i51][i53];
                    }
                    i53++;
                }
                i52++;
                i30 = 1;
            }
            if (i51 > 0) {
                int i54 = 0;
                while (true) {
                    if (i54 >= i51) {
                        z11 = true;
                        break;
                    }
                    int i55 = i54;
                    if (iArr18[iArr16[i51]] == iArr18[iArr16[i54]]) {
                        z11 = false;
                        break;
                    }
                    i54 = i55 + 1;
                }
                if (z11) {
                    i50++;
                }
            }
            i51++;
            iArr17 = iArr18;
            i30 = 1;
        }
        int[] iArr19 = iArr17;
        int i56 = gVar.i(4);
        if (i50 < 2 || i56 == 0) {
            return new oi.f(null, jVar2, null, null);
        }
        int[] iArr20 = new int[i50];
        for (int i57 = 0; i57 < i50; i57++) {
            iArr20[i57] = gVar.i(i56);
        }
        int[] iArr21 = new int[i31];
        int i58 = 0;
        while (i58 < i25) {
            iArr21[Math.min(iArr16[i58], i28)] = i58;
            i58++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        f0 u10 = i0.u();
        int i59 = 0;
        while (i59 <= i28) {
            int i60 = i50;
            int[] iArr23 = iArr16;
            int min = Math.min(iArr19[i59], i60 - 1);
            int[] iArr24 = iArr21;
            u10.b(new h(iArr24[i59], min >= 0 ? iArr22[min] : -1));
            i59++;
            i50 = i60;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        a1 i61 = u10.i();
        if (((h) i61.get(0)).b == -1) {
            return new oi.f(null, jVar2, null, null);
        }
        int i62 = 1;
        while (true) {
            if (i62 > i28) {
                i62 = -1;
                break;
            }
            if (((h) i61.get(i62)).b != -1) {
                break;
            }
            i62++;
        }
        if (i62 == -1) {
            return new oi.f(null, jVar2, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        int i63 = 1;
        while (i63 < i25) {
            boolean[][] zArr6 = zArr5;
            for (int i64 = 0; i64 < i63; i64++) {
                boolean[] zArr7 = zArr4[i63];
                boolean[] zArr8 = zArr6[i63];
                boolean h19 = gVar.h();
                zArr8[i64] = h19;
                zArr7[i64] = h19;
            }
            i63++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i65 = 1; i65 < i25; i65++) {
            int i66 = 0;
            while (i66 < i24) {
                boolean[][] zArr10 = zArr4;
                int i67 = 0;
                while (true) {
                    if (i67 < i65) {
                        boolean[] zArr11 = zArr9[i65];
                        if (zArr11[i67] && zArr9[i67][i66]) {
                            zArr11[i66] = true;
                            break;
                        }
                        i67++;
                    }
                }
                i66++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i31];
        for (int i68 = 0; i68 < i25; i68++) {
            int i69 = 0;
            for (int i70 = 0; i70 < i68; i70++) {
                i69 += zArr12[i68][i70] ? 1 : 0;
            }
            iArr26[iArr25[i68]] = i69;
        }
        int i71 = 0;
        for (int i72 = 0; i72 < i25; i72++) {
            if (iArr26[iArr25[i72]] == 0) {
                i71++;
            }
        }
        if (i71 > 1) {
            return new oi.f(null, jVar2, null, null);
        }
        int[] iArr27 = new int[i25];
        int[] iArr28 = new int[m10];
        if (gVar.h()) {
            iArr2 = iArr26;
            int i73 = 0;
            while (i73 < i25) {
                int i74 = i73;
                iArr27[i74] = gVar.i(3);
                i73 = i74 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i25, i26);
        }
        int i75 = 0;
        while (i75 < m10) {
            int i76 = i75;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i77 = 0;
            for (int i78 = 0; i78 < iArr6[i76]; i78++) {
                i77 = Math.max(i77, iArr29[((h) i61.get(iArr10[i76][i78])).a]);
            }
            iArr30[i76] = i77 + 1;
            i75 = i76 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (gVar.h()) {
            int i79 = 0;
            while (i79 < i24) {
                int i80 = i79 + 1;
                int i81 = i80;
                while (i81 < i25) {
                    if (zArr12[i81][i79]) {
                        i17 = i24;
                        gVar.t(3);
                    } else {
                        i17 = i24;
                    }
                    i81++;
                    i24 = i17;
                }
                i79 = i80;
            }
        }
        gVar.s();
        int m12 = gVar.m() + 1;
        f0 u11 = i0.u();
        u11.b(f7);
        if (m12 > 1) {
            u11.b(f10);
            for (int i82 = 2; i82 < m12; i82++) {
                f10 = f(gVar, gVar.h(), i26, f10);
                u11.b(f10);
            }
        }
        a1 i83 = u11.i();
        int m13 = gVar.m() + m10;
        if (m13 > m10) {
            return new oi.f(null, jVar2, null, null);
        }
        int i84 = gVar.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, m13, i31);
        int[] iArr32 = new int[m13];
        int i85 = 0;
        int[] iArr33 = new int[m13];
        int i86 = 0;
        while (i86 < m10) {
            iArr32[i86] = i85;
            iArr33[i86] = iArr11[i86];
            if (i84 == 0) {
                i16 = i86;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i16], i85, iArr6[i16], true);
                iArr3[i16] = iArr4[i16];
            } else {
                i16 = i86;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (i84 == 1) {
                    int i87 = iArr11[i16];
                    for (int i88 = 0; i88 < iArr4[i16]; i88++) {
                        zArr2[i16][i88] = iArr10[i16][i88] == i87;
                    }
                    iArr3[i16] = 1;
                } else {
                    i85 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i86 = i16 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i85 = 0;
            i86 = i16 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i31];
        int i89 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i31;
        iArr37[i85] = m13;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i90 = 1;
        int i91 = 0;
        while (i90 < m13) {
            if (i84 == i89) {
                for (int i92 = 0; i92 < iArr35[i90]; i92++) {
                    zArr14[i90][i92] = gVar.h();
                    int i93 = iArr34[i90];
                    boolean z17 = zArr14[i90][i92];
                    iArr34[i90] = i93 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr33[i90] = iArr10[i90][i92];
                    }
                }
            }
            if (i91 == 0) {
                i15 = 0;
                if (iArr10[i90][0] == 0 && zArr14[i90][0]) {
                    for (int i94 = 1; i94 < iArr35[i90]; i94++) {
                        if (iArr10[i90][i94] == i62 && zArr14[i90][i62]) {
                            i91 = i90;
                        }
                    }
                }
            } else {
                i15 = 0;
            }
            int i95 = i15;
            while (i95 < iArr35[i90]) {
                if (m12 > 1) {
                    zArr15[i90][i95] = zArr14[i90][i95];
                    a1Var = i83;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c10 = g9.c.c(m12);
                    if (!zArr[i90][i95]) {
                        int i96 = ((h) i61.get(iArr10[i90][i95])).a;
                        int i97 = i15;
                        while (true) {
                            if (i97 >= i95) {
                                break;
                            }
                            int i98 = i97;
                            if (zArr9[i96][((h) i61.get(iArr10[i90][i98])).a]) {
                                zArr[i90][i95] = true;
                                break;
                            }
                            i97 = i98 + 1;
                        }
                    }
                    if (zArr[i90][i95]) {
                        if (i91 <= 0 || i90 != i91) {
                            gVar.t(c10);
                        } else {
                            iArr36[i95] = gVar.i(c10);
                        }
                    }
                } else {
                    a1Var = i83;
                    zArr = zArr15;
                }
                i95++;
                i83 = a1Var;
                zArr15 = zArr;
            }
            a1 a1Var2 = i83;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i90] == 1 && iArr2[iArr33[i90]] > 0) {
                gVar.s();
            }
            i90++;
            i83 = a1Var2;
            zArr15 = zArr16;
            i89 = 2;
        }
        a1 a1Var3 = i83;
        boolean[][] zArr17 = zArr15;
        if (i91 == 0) {
            return new oi.f(null, jVar2, null, null);
        }
        int m14 = gVar.m();
        int i99 = m14 + 1;
        e9.q.e(i99, "expectedSize");
        e9.q.e(i99, "initialCapacity");
        int[] iArr38 = new int[i25];
        Object[] objArr = new Object[i99];
        int i100 = 0;
        int i101 = 0;
        boolean z18 = false;
        while (i100 < i99) {
            int i102 = i100;
            int i103 = gVar.i(16);
            int i104 = gVar.i(16);
            boolean z19 = z18;
            if (gVar.h()) {
                i12 = gVar.i(2);
                if (i12 == 3) {
                    gVar.s();
                }
                i13 = gVar.i(4);
                i14 = gVar.i(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (gVar.h()) {
                int m15 = gVar.m();
                int m16 = gVar.m();
                int m17 = gVar.m();
                int m18 = gVar.m();
                i103 -= (m15 + m16) * ((i12 == 1 || i12 == 2) ? 2 : 1);
                i104 -= (m17 + m18) * (i12 == 1 ? 2 : 1);
            }
            k kVar = new k(i12, i13, i14, i103, i104);
            int h20 = w.h(objArr.length, i101 + 1);
            if (h20 > objArr.length || z19) {
                objArr = Arrays.copyOf(objArr, h20);
                z10 = false;
            } else {
                z10 = z19;
            }
            objArr[i101] = kVar;
            i101++;
            i100 = i102 + 1;
            z18 = z10;
        }
        if (i99 <= 1 || !gVar.h()) {
            for (int i105 = 1; i105 < i25; i105++) {
                iArr38[i105] = Math.min(i105, m14);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c11 = g9.c.c(i99);
            for (int i106 = 1; i106 < i25; i106++) {
                iArr38[i106] = gVar.i(c11);
            }
        }
        x xVar = new x(i0.t(i101, objArr), iArr38);
        gVar.t(2);
        for (int i107 = 1; i107 < i25; i107++) {
            if (iArr2[iArr25[i107]] == 0) {
                gVar.s();
            }
        }
        for (int i108 = 1; i108 < m13; i108++) {
            boolean h21 = gVar.h();
            int i109 = 0;
            while (i109 < iArr31[i108]) {
                if ((i109 <= 0 || !h21) ? i109 == 0 : gVar.h()) {
                    for (int i110 = 0; i110 < iArr35[i108]; i110++) {
                        if (zArr17[i108][i110]) {
                            gVar.m();
                        }
                    }
                    gVar.m();
                    gVar.m();
                }
                i109++;
            }
        }
        int m19 = gVar.m() + 2;
        if (gVar.h()) {
            gVar.t(m19);
        } else {
            for (int i111 = 1; i111 < i25; i111++) {
                for (int i112 = 0; i112 < i111; i112++) {
                    if (zArr12[i111][i112]) {
                        gVar.t(m19);
                    }
                }
            }
        }
        int m20 = gVar.m();
        for (int i113 = 1; i113 <= m20; i113++) {
            gVar.t(8);
        }
        if (gVar.h()) {
            int i114 = gVar.e;
            if (i114 > 0) {
                gVar.t(8 - i114);
            }
            if (!gVar.h() ? gVar.h() : true) {
                gVar.s();
            }
            boolean h22 = gVar.h();
            boolean h23 = gVar.h();
            if (h22 || h23) {
                for (int i115 = 0; i115 < m10; i115++) {
                    for (int i116 = 0; i116 < iArr31[i115]; i116++) {
                        boolean h24 = h22 ? gVar.h() : false;
                        boolean h25 = h23 ? gVar.h() : false;
                        if (h24) {
                            gVar.t(32);
                        }
                        if (h25) {
                            gVar.t(18);
                        }
                    }
                }
            }
            boolean h26 = gVar.h();
            int i117 = h26 ? gVar.i(4) + 1 : i25;
            e9.q.e(i117, "expectedSize");
            e9.q.e(i117, "initialCapacity");
            int[] iArr39 = new int[i25];
            Object[] objArr2 = new Object[i117];
            int i118 = 0;
            int i119 = 0;
            boolean z20 = false;
            while (i118 < i117) {
                gVar.t(3);
                int i120 = gVar.h() ? 1 : 2;
                int f11 = b2.j.f(gVar.i(8));
                boolean z21 = h26;
                int g10 = b2.j.g(gVar.i(8));
                gVar.t(8);
                m mVar = new m(f11, i120, g10);
                int h27 = w.h(objArr2.length, i119 + 1);
                if (h27 > objArr2.length || z20) {
                    objArr2 = Arrays.copyOf(objArr2, h27);
                    z20 = false;
                }
                objArr2[i119] = mVar;
                i118++;
                i119++;
                h26 = z21;
                z20 = z20;
            }
            if (h26 && i117 > 1) {
                for (int i121 = 0; i121 < i25; i121++) {
                    iArr39[i121] = gVar.i(4);
                }
            }
            jVar = new j(i0.t(i119, objArr2), iArr39, 1);
        } else {
            jVar = null;
        }
        return new oi.f(i61, new j(a1Var3, iArr36, 0), xVar, jVar);
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
    public static o j(int i10, int i11, byte[] bArr) {
        int m10;
        int m11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean h;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f7;
        int i24;
        int i25;
        int i26;
        boolean h10;
        boolean h11;
        int i27;
        a4.g gVar = new a4.g(bArr, i10 + 1, i11);
        int i28 = gVar.i(8);
        int i29 = gVar.i(8);
        int i30 = gVar.i(8);
        int m12 = gVar.m();
        if (i28 == 100 || i28 == 110 || i28 == 122 || i28 == 244 || i28 == 44 || i28 == 83 || i28 == 86 || i28 == 118 || i28 == 128 || i28 == 138) {
            m10 = gVar.m();
            boolean h12 = m10 == 3 ? gVar.h() : false;
            int m13 = gVar.m();
            m11 = gVar.m();
            gVar.s();
            if (gVar.h()) {
                int i31 = m10 != 3 ? 8 : 12;
                i12 = 16;
                int i32 = 0;
                while (i32 < i31) {
                    if (gVar.h()) {
                        int i33 = i32 < 6 ? 16 : 64;
                        int i34 = 8;
                        int i35 = 8;
                        for (int i36 = 0; i36 < i33; i36++) {
                            if (i34 != 0) {
                                i34 = ((gVar.n() + i35) + 256) % 256;
                            }
                            if (i34 != 0) {
                                i35 = i34;
                            }
                        }
                    }
                    i32++;
                }
            } else {
                i12 = 16;
            }
            z10 = h12;
            i13 = m13;
        } else {
            m10 = 1;
            i12 = 16;
            i13 = 0;
            z10 = false;
            m11 = 0;
        }
        int m14 = gVar.m() + 4;
        int m15 = gVar.m();
        if (m15 == 0) {
            i17 = gVar.m() + 4;
            i14 = i28;
            i15 = m15;
            i16 = m11;
        } else {
            if (m15 == 1) {
                boolean h13 = gVar.h();
                gVar.n();
                gVar.n();
                i14 = i28;
                long m16 = gVar.m();
                i15 = m15;
                for (int i37 = 0; i37 < m16; i37++) {
                    gVar.m();
                }
                i16 = m11;
                z11 = h13;
                i17 = 0;
                gVar.m();
                gVar.s();
                int m17 = gVar.m() + 1;
                int m18 = gVar.m() + 1;
                h = gVar.h();
                int i38 = 2 - (h ? 1 : 0);
                int i39 = m18 * i38;
                if (!h) {
                    gVar.s();
                }
                gVar.s();
                int i40 = m17 * 16;
                int i41 = i39 * 16;
                if (gVar.h()) {
                    int m19 = gVar.m();
                    int m20 = gVar.m();
                    int m21 = gVar.m();
                    int m22 = gVar.m();
                    if (m10 == 0) {
                        i27 = 1;
                    } else {
                        i27 = m10 == 3 ? 1 : 2;
                        i38 *= m10 == 1 ? 2 : 1;
                    }
                    i40 -= (m19 + m20) * i27;
                    i41 -= (m21 + m22) * i38;
                }
                int i42 = i41;
                int i43 = i40;
                int i44 = i14;
                int i45 = ((i44 != 44 || i44 == 86 || i44 == 100 || i44 == 110 || i44 == 122 || i44 == 244) && (i29 & 16) != 0) ? 0 : i12;
                int i46 = -1;
                float f10 = 1.0f;
                if (gVar.h()) {
                    i18 = m14;
                    i19 = i16;
                    i20 = i45;
                    i21 = -1;
                    i22 = -1;
                    i23 = i17;
                    f7 = 1.0f;
                    i24 = -1;
                } else {
                    if (gVar.h()) {
                        int i47 = gVar.i(8);
                        if (i47 == 255) {
                            int i48 = i12;
                            int i49 = gVar.i(i48);
                            int i50 = gVar.i(i48);
                            if (i49 != 0 && i50 != 0) {
                                f10 = i49 / i50;
                            }
                        } else if (i47 < 17) {
                            f10 = b[i47];
                        } else {
                            i18 = m14;
                            e2.m(i47, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (gVar.h()) {
                                gVar.s();
                            }
                            if (gVar.h()) {
                                i25 = -1;
                                i26 = -1;
                            } else {
                                gVar.t(3);
                                i25 = gVar.h() ? 1 : 2;
                                if (gVar.h()) {
                                    int i51 = gVar.i(8);
                                    int i52 = gVar.i(8);
                                    gVar.t(8);
                                    i46 = b2.j.f(i51);
                                    i26 = b2.j.g(i52);
                                } else {
                                    i26 = -1;
                                }
                            }
                            if (gVar.h()) {
                                gVar.m();
                                gVar.m();
                            }
                            if (gVar.h()) {
                                gVar.t(65);
                            }
                            h10 = gVar.h();
                            if (h10) {
                                k(gVar);
                            }
                            h11 = gVar.h();
                            if (h11) {
                                k(gVar);
                            }
                            if (!h10 || h11) {
                                gVar.s();
                            }
                            gVar.s();
                            if (gVar.h()) {
                                gVar.s();
                                gVar.m();
                                gVar.m();
                                gVar.m();
                                gVar.m();
                                i45 = gVar.m();
                                gVar.m();
                            }
                            int i53 = i46;
                            i23 = i17;
                            f7 = f10;
                            i24 = i53;
                            i21 = i25;
                            i22 = i26;
                            i19 = i16;
                            i20 = i45;
                        }
                    }
                    i18 = m14;
                    if (gVar.h()) {
                    }
                    if (gVar.h()) {
                    }
                    if (gVar.h()) {
                    }
                    if (gVar.h()) {
                    }
                    h10 = gVar.h();
                    if (h10) {
                    }
                    h11 = gVar.h();
                    if (h11) {
                    }
                    if (!h10) {
                    }
                    gVar.s();
                    gVar.s();
                    if (gVar.h()) {
                    }
                    int i532 = i46;
                    i23 = i17;
                    f7 = f10;
                    i24 = i532;
                    i21 = i25;
                    i22 = i26;
                    i19 = i16;
                    i20 = i45;
                }
                return new o(i44, i29, i30, m12, i43, i42, f7, i13, i19, z10, h, i18, i15, i23, z11, i24, i21, i22, i20);
            }
            i14 = i28;
            i15 = m15;
            i16 = m11;
            i17 = 0;
        }
        z11 = false;
        gVar.m();
        gVar.s();
        int m172 = gVar.m() + 1;
        int m182 = gVar.m() + 1;
        h = gVar.h();
        int i382 = 2 - (h ? 1 : 0);
        int i392 = m182 * i382;
        if (!h) {
        }
        gVar.s();
        int i402 = m172 * 16;
        int i412 = i392 * 16;
        if (gVar.h()) {
        }
        int i422 = i412;
        int i432 = i402;
        int i442 = i14;
        if (i442 != 44) {
        }
        int i462 = -1;
        float f102 = 1.0f;
        if (gVar.h()) {
        }
        return new o(i442, i29, i30, m12, i432, i422, f7, i13, i19, z10, h, i18, i15, i23, z11, i24, i21, i22, i20);
    }

    public static void k(a4.g gVar) {
        int m10 = gVar.m() + 1;
        gVar.t(8);
        for (int i10 = 0; i10 < m10; i10++) {
            gVar.m();
            gVar.m();
            gVar.s();
        }
        gVar.t(20);
    }

    public static ArrayList l(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
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
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new r(i10, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }

    public static int m(int i10, byte[] bArr) {
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
