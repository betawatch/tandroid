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
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
            a3.k e7 = e(new a4.h(bArr, 4, i10 + 4));
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

    public static a3.k e(a4.h hVar) {
        hVar.s();
        return new a3.k(hVar.i(6), hVar.i(6), hVar.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i f(a4.h hVar, boolean z10, int i10, i iVar) {
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
            int i16 = hVar.i(2);
            z12 = hVar.h();
            i14 = hVar.i(5);
            i15 = 0;
            for (int i17 = 0; i17 < 32; i17++) {
                if (hVar.h()) {
                    i15 |= 1 << i17;
                }
            }
            for (int i18 = 0; i18 < 6; i18++) {
                iArr2[i18] = hVar.i(8);
            }
            i11 = i16;
        } else {
            if (iVar == null) {
                iArr = iArr2;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                z11 = false;
                int i19 = hVar.i(8);
                int i20 = 0;
                for (int i21 = 0; i21 < i10; i21++) {
                    if (hVar.h()) {
                        i20 += 88;
                    }
                    if (hVar.h()) {
                        i20 += 8;
                    }
                }
                hVar.t(i20);
                if (i10 > 0) {
                    hVar.t((8 - i10) * 2);
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
        int i192 = hVar.i(8);
        int i202 = 0;
        while (i21 < i10) {
        }
        hVar.t(i202);
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
        a4.h hVar = new a4.h(bArr, i12, i11 + 1);
        while (hVar.d(16)) {
            int i13 = hVar.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += 255;
                i13 = hVar.i(8);
            }
            int i15 = i14 + i13;
            int i16 = hVar.i(8);
            int i17 = 0;
            while (i16 == 255) {
                i17 += 255;
                i16 = hVar.i(8);
            }
            int i18 = i17 + i16;
            if (i18 == 0 || !hVar.d(i18)) {
                return null;
            }
            if (i15 == 176) {
                int m10 = hVar.m();
                boolean h = hVar.h();
                int m11 = h ? hVar.m() : 0;
                int m12 = hVar.m();
                int i19 = -1;
                for (int i20 = 0; i20 <= m12; i20++) {
                    i19 = hVar.m();
                    hVar.m();
                    int i21 = hVar.i(6);
                    if (i21 == 63) {
                        return null;
                    }
                    hVar.i(i21 == 0 ? Math.max(0, m10 - 30) : Math.max(0, (i21 + m10) - 31));
                    if (h) {
                        int i22 = hVar.i(6);
                        if (i22 == 63) {
                            return null;
                        }
                        hVar.i(i22 == 0 ? Math.max(0, m11 - 30) : Math.max(0, (i22 + m11) - 31));
                    }
                    if (hVar.h()) {
                        hVar.t(10);
                    }
                }
                return new com.google.android.gms.internal.cast.a(i19);
            }
            hVar.t(i18 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l h(byte[] bArr, int i10, int i11, fg.f fVar) {
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
        float f7;
        int i31;
        int i32;
        int i33;
        j jVar;
        int i34;
        int i35;
        int i36;
        pf.b bVar;
        a3.k e7 = e(new a4.h(bArr, i10, i11));
        a4.h hVar = new a4.h(bArr, i10 + 2, i11);
        int i37 = 4;
        hVar.t(4);
        int i38 = hVar.i(3);
        int i39 = e7.b;
        boolean z10 = i39 != 0 && i38 == 7;
        if (fVar != null) {
            i0 i0Var = (i0) fVar.a;
            if (!i0Var.isEmpty()) {
                i12 = ((h) i0Var.get(Math.min(i39, i0Var.size() - 1))).a;
                i iVar2 = null;
                if (z10) {
                    hVar.s();
                    iVar2 = f(hVar, true, i38, null);
                } else if (fVar != null) {
                    j jVar2 = (j) fVar.b;
                    int[] iArr = jVar2.b;
                    i0 i0Var2 = jVar2.a;
                    int i40 = iArr[i12];
                    if (i0Var2.size() > i40) {
                        iVar2 = (i) i0Var2.get(i40);
                    }
                }
                hVar.m();
                if (z10) {
                    int m13 = hVar.m();
                    if (m13 == 3) {
                        hVar.s();
                    }
                    int m14 = hVar.m();
                    int m15 = hVar.m();
                    if (hVar.h()) {
                        int m16 = hVar.m();
                        int m17 = hVar.m();
                        int m18 = hVar.m();
                        int m19 = hVar.m();
                        i13 = m14 - ((m16 + m17) * ((m13 == 1 || m13 == 2) ? 2 : 1));
                        i14 = m15 - ((m18 + m19) * (m13 == 1 ? 2 : 1));
                    } else {
                        i13 = m14;
                        i14 = m15;
                    }
                    i15 = i14;
                    m10 = hVar.m();
                    i16 = i13;
                    m11 = hVar.m();
                    i17 = m15;
                    i18 = m14;
                } else {
                    int i41 = hVar.h() ? hVar.i(8) : -1;
                    if (fVar != null && (bVar = (pf.b) fVar.c) != null) {
                        i0 i0Var3 = (i0) bVar.b;
                        if (i41 == -1) {
                            i41 = ((int[]) bVar.c)[i12];
                        }
                        if (i41 != -1 && i0Var3.size() > i41) {
                            k kVar = (k) i0Var3.get(i41);
                            int i42 = kVar.a;
                            i16 = kVar.d;
                            int i43 = kVar.e;
                            m10 = kVar.b;
                            m11 = kVar.c;
                            i15 = i43;
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
                int m20 = hVar.m();
                if (z10) {
                    i19 = -1;
                    for (int i44 = hVar.h() ? 0 : i38; i44 <= i38; i44++) {
                        hVar.m();
                        i19 = Math.max(hVar.m(), i19);
                        hVar.m();
                    }
                } else {
                    i19 = -1;
                }
                hVar.m();
                hVar.m();
                hVar.m();
                hVar.m();
                hVar.m();
                hVar.m();
                if (hVar.h()) {
                    int i45 = 6;
                    if (z10 ? hVar.h() : false) {
                        hVar.t(6);
                    } else if (hVar.h()) {
                        int i46 = 0;
                        while (i46 < i37) {
                            int i47 = 0;
                            while (i47 < i45) {
                                if (hVar.h()) {
                                    int min = Math.min(64, 1 << ((i46 << 1) + 4));
                                    if (i46 > 1) {
                                        hVar.n();
                                    }
                                    for (int i48 = 0; i48 < min; i48++) {
                                        hVar.n();
                                    }
                                } else {
                                    hVar.m();
                                }
                                i47 += i46 == 3 ? 3 : 1;
                                i45 = 6;
                            }
                            i46++;
                            i37 = 4;
                            i45 = 6;
                        }
                    }
                }
                hVar.t(2);
                if (hVar.h()) {
                    hVar.t(8);
                    hVar.m();
                    hVar.m();
                    hVar.s();
                }
                m12 = hVar.m();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                int i49 = -1;
                i20 = 0;
                int i50 = -1;
                while (i20 < m12) {
                    if (i20 == 0 || !hVar.h()) {
                        i34 = m12;
                        i35 = i12;
                        i36 = i20;
                        int m21 = hVar.m();
                        i49 = hVar.m();
                        int[] iArr4 = new int[m21];
                        int i51 = 0;
                        while (i51 < m21) {
                            iArr4[i51] = (i51 > 0 ? iArr4[i51 - 1] : 0) - (hVar.m() + 1);
                            hVar.s();
                            i51++;
                        }
                        int[] iArr5 = new int[i49];
                        int i52 = 0;
                        while (i52 < i49) {
                            iArr5[i52] = hVar.m() + 1 + (i52 > 0 ? iArr5[i52 - 1] : 0);
                            hVar.s();
                            i52++;
                        }
                        i50 = m21;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i34 = m12;
                        int i53 = i50 + i49;
                        int m22 = (1 - ((hVar.h() ? 1 : 0) * 2)) * (hVar.m() + 1);
                        i35 = i12;
                        int i54 = i53 + 1;
                        i36 = i20;
                        boolean[] zArr = new boolean[i54];
                        for (int i55 = 0; i55 <= i53; i55++) {
                            if (hVar.h()) {
                                zArr[i55] = true;
                            } else {
                                zArr[i55] = hVar.h();
                            }
                        }
                        int[] iArr6 = new int[i54];
                        int[] iArr7 = new int[i54];
                        int i56 = 0;
                        for (int i57 = i49 - 1; i57 >= 0; i57--) {
                            int i58 = iArr3[i57] + m22;
                            if (i58 < 0 && zArr[i50 + i57]) {
                                iArr6[i56] = i58;
                                i56++;
                            }
                        }
                        if (m22 < 0 && zArr[i53]) {
                            iArr6[i56] = m22;
                            i56++;
                        }
                        int i59 = i56;
                        int[] iArr8 = iArr2;
                        for (int i60 = 0; i60 < i50; i60++) {
                            int i61 = iArr8[i60] + m22;
                            if (i61 < 0 && zArr[i60]) {
                                iArr6[i59] = i61;
                                i59++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i59);
                        int i62 = 0;
                        for (int i63 = i50 - 1; i63 >= 0; i63--) {
                            int i64 = iArr8[i63] + m22;
                            if (i64 > 0 && zArr[i63]) {
                                iArr7[i62] = i64;
                                i62++;
                            }
                        }
                        if (m22 > 0 && zArr[i53]) {
                            iArr7[i62] = m22;
                            i62++;
                        }
                        int i65 = i59;
                        int i66 = i62;
                        for (int i67 = 0; i67 < i49; i67++) {
                            int i68 = iArr3[i67] + m22;
                            if (i68 > 0 && zArr[i50 + i67]) {
                                iArr7[i66] = i68;
                                i66++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i66);
                        i49 = i66;
                        i50 = i65;
                        iArr2 = copyOf;
                    }
                    i20 = i36 + 1;
                    m12 = i34;
                    i12 = i35;
                }
                int i69 = i12;
                if (hVar.h()) {
                    int m23 = hVar.m();
                    for (int i70 = 0; i70 < m23; i70++) {
                        hVar.t(m20 + 5);
                    }
                }
                hVar.t(2);
                float f10 = 1.0f;
                if (hVar.h()) {
                    iVar = iVar2;
                    i21 = m10;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                    i25 = -1;
                    i26 = -1;
                    i27 = -1;
                    i28 = i19;
                    i29 = m11;
                    i30 = i15;
                    f7 = 1.0f;
                } else {
                    if (hVar.h()) {
                        int i71 = hVar.i(8);
                        if (i71 == 255) {
                            int i72 = hVar.i(16);
                            int i73 = hVar.i(16);
                            if (i72 != 0 && i73 != 0) {
                                f10 = i72 / i73;
                            }
                        } else if (i71 < 17) {
                            f10 = b[i71];
                        } else {
                            e2.n(i71, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (hVar.h()) {
                        hVar.s();
                    }
                    if (hVar.h()) {
                        hVar.t(3);
                        i33 = hVar.h() ? 1 : 2;
                        if (hVar.h()) {
                            int i74 = hVar.i(8);
                            int i75 = hVar.i(8);
                            hVar.t(8);
                            i31 = b2.j.f(i74);
                            i32 = b2.j.g(i75);
                        } else {
                            i31 = -1;
                            i32 = -1;
                        }
                    } else {
                        if (fVar != null && (jVar = (j) fVar.d) != null) {
                            i0 i0Var4 = jVar.a;
                            int i76 = jVar.b[i69];
                            if (i0Var4.size() > i76) {
                                m mVar = (m) i0Var4.get(i76);
                                int i77 = mVar.a;
                                int i78 = mVar.b;
                                i32 = mVar.c;
                                i31 = i77;
                                i33 = i78;
                            }
                        }
                        i31 = -1;
                        i32 = -1;
                        i33 = -1;
                    }
                    if (hVar.h()) {
                        hVar.m();
                        hVar.m();
                    }
                    hVar.s();
                    if (hVar.h()) {
                        i15 *= 2;
                    }
                    i25 = i31;
                    i27 = i32;
                    i26 = i33;
                    iVar = iVar2;
                    i21 = m10;
                    i22 = i16;
                    i23 = i18;
                    i24 = i17;
                    i28 = i19;
                    i29 = m11;
                    i30 = i15;
                    f7 = f10;
                }
                return new l(i38, iVar, i21, i29, i22, i30, i23, i24, f7, i28, i25, i26, i27);
            }
        }
        i12 = 0;
        i iVar22 = null;
        if (z10) {
        }
        hVar.m();
        if (z10) {
        }
        int m202 = hVar.m();
        if (z10) {
        }
        hVar.m();
        hVar.m();
        hVar.m();
        hVar.m();
        hVar.m();
        hVar.m();
        if (hVar.h()) {
        }
        hVar.t(2);
        if (hVar.h()) {
        }
        m12 = hVar.m();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        int i492 = -1;
        i20 = 0;
        int i502 = -1;
        while (i20 < m12) {
        }
        int i692 = i12;
        if (hVar.h()) {
        }
        hVar.t(2);
        float f102 = 1.0f;
        if (hVar.h()) {
        }
        return new l(i38, iVar, i21, i29, i22, i30, i23, i24, f7, i28, i25, i26, i27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fg.f i(int i10, int i11, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i12;
        int i13;
        int i14;
        a1 a1Var;
        boolean[][] zArr;
        int i15;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i16;
        boolean z10;
        int i17;
        boolean h;
        int i18;
        int i19;
        int i20;
        boolean h10;
        int i21;
        int i22;
        boolean z11;
        boolean z12;
        a4.h hVar = new a4.h(bArr, i10, i11);
        e(hVar);
        hVar.t(4);
        boolean h11 = hVar.h();
        boolean h12 = hVar.h();
        int i23 = hVar.i(6);
        int i24 = i23 + 1;
        int i25 = hVar.i(3);
        hVar.t(17);
        i f7 = f(hVar, true, i25, null);
        for (int i26 = hVar.h() ? 0 : i25; i26 <= i25; i26++) {
            hVar.m();
            hVar.m();
            hVar.m();
        }
        int i27 = hVar.i(6);
        int m10 = hVar.m() + 1;
        j jVar2 = new j(i0.z(f7), new int[1], 0);
        boolean z13 = i24 >= 2 && m10 >= 2;
        boolean z14 = h11 && h12;
        int i28 = i27 + 1;
        boolean z15 = i28 >= i24;
        if (!z13 || !z14 || !z15) {
            return new fg.f(null, jVar2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, m10, i28);
        int[] iArr6 = new int[m10];
        int[] iArr7 = new int[m10];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i29 = 1; i29 < m10; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= i27; i31++) {
                if (hVar.h()) {
                    iArr5[i29][i30] = i31;
                    iArr7[i29] = i31;
                    i30++;
                }
                iArr6[i29] = i30;
            }
        }
        if (hVar.h()) {
            hVar.t(64);
            if (hVar.h()) {
                hVar.m();
            }
            int m11 = hVar.m();
            int i32 = 0;
            while (i32 < m11) {
                hVar.m();
                if (i32 == 0 || hVar.h()) {
                    boolean h13 = hVar.h();
                    boolean h14 = hVar.h();
                    z12 = h13;
                    z11 = h14;
                    if (h13 || h14) {
                        h = hVar.h();
                        if (h) {
                            hVar.t(19);
                        }
                        hVar.t(8);
                        if (h) {
                            hVar.t(4);
                        }
                        hVar.t(15);
                        i19 = h13;
                        i18 = h14;
                        i20 = 0;
                        while (i20 <= i25) {
                            boolean h15 = hVar.h();
                            if (!h15) {
                                h15 = hVar.h();
                            }
                            if (h15) {
                                hVar.m();
                                h10 = false;
                            } else {
                                h10 = hVar.h();
                            }
                            if (h10) {
                                i21 = i32;
                                i22 = 0;
                            } else {
                                i21 = i32;
                                i22 = hVar.m();
                            }
                            int[][] iArr8 = iArr5;
                            int i33 = i19 + i18;
                            int[] iArr9 = iArr7;
                            int i34 = 0;
                            while (i34 < i33) {
                                int i35 = i33;
                                for (int i36 = 0; i36 <= i22; i36++) {
                                    hVar.m();
                                    hVar.m();
                                    if (h) {
                                        hVar.m();
                                        hVar.m();
                                    }
                                    hVar.s();
                                }
                                i34++;
                                i33 = i35;
                            }
                            i20++;
                            i32 = i21;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i32++;
                    }
                } else {
                    z12 = false;
                    z11 = false;
                }
                h = false;
                i19 = z12;
                i18 = z11;
                i20 = 0;
                while (i20 <= i25) {
                }
                i32++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!hVar.h()) {
            return new fg.f(null, jVar2, null, null);
        }
        int i37 = hVar.e;
        if (i37 > 0) {
            hVar.t(8 - i37);
        }
        i f10 = f(hVar, false, i25, f7);
        boolean h16 = hVar.h();
        boolean[] zArr3 = new boolean[16];
        int i38 = 0;
        for (int i39 = 0; i39 < 16; i39++) {
            boolean h17 = hVar.h();
            zArr3[i39] = h17;
            if (h17) {
                i38++;
            }
        }
        if (i38 == 0 || !zArr3[1]) {
            return new fg.f(null, jVar2, null, null);
        }
        int[] iArr12 = new int[i38];
        for (int i40 = 0; i40 < i38 - (h16 ? 1 : 0); i40++) {
            iArr12[i40] = hVar.i(3);
        }
        int[] iArr13 = new int[i38 + 1];
        if (h16) {
            int i41 = 1;
            while (i41 < i38) {
                int[] iArr14 = iArr13;
                for (int i42 = 0; i42 < i41; i42++) {
                    iArr14[i41] = iArr12[i42] + 1 + iArr14[i41];
                }
                i41++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i38] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i24, i38);
        int[] iArr16 = new int[i24];
        iArr16[0] = 0;
        boolean h18 = hVar.h();
        int i43 = 1;
        while (i43 < i24) {
            if (h18) {
                i17 = i43;
                iArr16[i17] = hVar.i(6);
            } else {
                i17 = i43;
                iArr16[i17] = i17;
            }
            if (h16) {
                for (int i44 = 0; i44 < i38; i44++) {
                    iArr15[i17][i44] = (iArr16[i17] & ((1 << iArr[r31]) - 1)) >> iArr[i44];
                }
            } else {
                int i45 = 0;
                while (i45 < i38) {
                    int i46 = i45;
                    iArr15[i17][i46] = hVar.i(iArr12[i45] + 1);
                    i45 = i46 + 1;
                }
            }
            i43 = i17 + 1;
        }
        int[] iArr17 = new int[i28];
        int i47 = 1;
        int i48 = 0;
        while (i48 < i24) {
            iArr17[iArr16[i48]] = -1;
            int[] iArr18 = iArr17;
            int i49 = 0;
            for (int i50 = 0; i50 < 16; i50++) {
                if (zArr3[i50]) {
                    if (i50 == 1) {
                        iArr18[iArr16[i48]] = iArr15[i48][i49];
                    }
                    i49++;
                }
            }
            if (i48 > 0) {
                int i51 = 0;
                while (true) {
                    if (i51 >= i48) {
                        z10 = true;
                        break;
                    }
                    int i52 = i51;
                    if (iArr18[iArr16[i48]] == iArr18[iArr16[i51]]) {
                        z10 = false;
                        break;
                    }
                    i51 = i52 + 1;
                }
                if (z10) {
                    i47++;
                }
            }
            i48++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        int i53 = hVar.i(4);
        if (i47 < 2 || i53 == 0) {
            return new fg.f(null, jVar2, null, null);
        }
        int[] iArr20 = new int[i47];
        for (int i54 = 0; i54 < i47; i54++) {
            iArr20[i54] = hVar.i(i53);
        }
        int[] iArr21 = new int[i28];
        int i55 = 0;
        while (i55 < i24) {
            iArr21[Math.min(iArr16[i55], i27)] = i55;
            i55++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        f0 u10 = i0.u();
        int i56 = 0;
        while (i56 <= i27) {
            int i57 = i47;
            int[] iArr23 = iArr16;
            int min = Math.min(iArr19[i56], i57 - 1);
            int[] iArr24 = iArr21;
            u10.b(new h(iArr24[i56], min >= 0 ? iArr22[min] : -1));
            i56++;
            i47 = i57;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        a1 i58 = u10.i();
        if (((h) i58.get(0)).b == -1) {
            return new fg.f(null, jVar2, null, null);
        }
        int i59 = 1;
        while (true) {
            if (i59 > i27) {
                i59 = -1;
                break;
            }
            if (((h) i58.get(i59)).b != -1) {
                break;
            }
            i59++;
        }
        if (i59 == -1) {
            return new fg.f(null, jVar2, null, null);
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
                boolean h19 = hVar.h();
                zArr8[i61] = h19;
                zArr7[i61] = h19;
            }
            i60++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i62 = 1; i62 < i24; i62++) {
            int i63 = 0;
            while (i63 < i23) {
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
        int[] iArr26 = new int[i28];
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
            return new fg.f(null, jVar2, null, null);
        }
        int[] iArr27 = new int[i24];
        int[] iArr28 = new int[m10];
        if (hVar.h()) {
            iArr2 = iArr26;
            int i70 = 0;
            while (i70 < i24) {
                int i71 = i70;
                iArr27[i71] = hVar.i(3);
                i70 = i71 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i24, i25);
        }
        int i72 = 0;
        while (i72 < m10) {
            int i73 = i72;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i74 = 0;
            for (int i75 = 0; i75 < iArr6[i73]; i75++) {
                i74 = Math.max(i74, iArr29[((h) i58.get(iArr10[i73][i75])).a]);
            }
            iArr30[i73] = i74 + 1;
            i72 = i73 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (hVar.h()) {
            int i76 = 0;
            while (i76 < i23) {
                int i77 = i76 + 1;
                int i78 = i77;
                while (i78 < i24) {
                    if (zArr12[i78][i76]) {
                        i16 = i23;
                        hVar.t(3);
                    } else {
                        i16 = i23;
                    }
                    i78++;
                    i23 = i16;
                }
                i76 = i77;
            }
        }
        hVar.s();
        int m12 = hVar.m() + 1;
        f0 u11 = i0.u();
        u11.b(f7);
        if (m12 > 1) {
            u11.b(f10);
            for (int i79 = 2; i79 < m12; i79++) {
                f10 = f(hVar, hVar.h(), i25, f10);
                u11.b(f10);
            }
        }
        a1 i80 = u11.i();
        int m13 = hVar.m() + m10;
        if (m13 > m10) {
            return new fg.f(null, jVar2, null, null);
        }
        int i81 = hVar.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, m13, i28);
        int[] iArr32 = new int[m13];
        int i82 = 0;
        int[] iArr33 = new int[m13];
        int i83 = 0;
        while (i83 < m10) {
            iArr32[i83] = i82;
            iArr33[i83] = iArr11[i83];
            if (i81 == 0) {
                i15 = i83;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i15], 0, iArr6[i15], true);
                iArr3[i15] = iArr4[i15];
            } else {
                i15 = i83;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (i81 == 1) {
                    int i84 = iArr11[i15];
                    for (int i85 = 0; i85 < iArr4[i15]; i85++) {
                        zArr2[i15][i85] = iArr10[i15][i85] == i84;
                    }
                    iArr3[i15] = 1;
                } else {
                    i82 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i83 = i15 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i82 = 0;
            i83 = i15 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i28];
        int i86 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i28;
        iArr37[i82] = m13;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i87 = 1;
        int i88 = 0;
        while (i87 < m13) {
            if (i81 == i86) {
                for (int i89 = 0; i89 < iArr35[i87]; i89++) {
                    zArr14[i87][i89] = hVar.h();
                    int i90 = iArr34[i87];
                    boolean z16 = zArr14[i87][i89];
                    iArr34[i87] = i90 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr33[i87] = iArr10[i87][i89];
                    }
                }
            }
            if (i88 == 0 && iArr10[i87][0] == 0 && zArr14[i87][0]) {
                for (int i91 = 1; i91 < iArr35[i87]; i91++) {
                    if (iArr10[i87][i91] == i59 && zArr14[i87][i59]) {
                        i88 = i87;
                    }
                }
            }
            int i92 = 0;
            while (i92 < iArr35[i87]) {
                if (m12 > 1) {
                    zArr15[i87][i92] = zArr14[i87][i92];
                    a1Var = i80;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c10 = g9.c.c(m12);
                    if (!zArr[i87][i92]) {
                        int i93 = ((h) i58.get(iArr10[i87][i92])).a;
                        int i94 = 0;
                        while (true) {
                            if (i94 >= i92) {
                                break;
                            }
                            int i95 = i94;
                            if (zArr9[i93][((h) i58.get(iArr10[i87][i95])).a]) {
                                zArr[i87][i92] = true;
                                break;
                            }
                            i94 = i95 + 1;
                        }
                    }
                    if (zArr[i87][i92]) {
                        if (i88 <= 0 || i87 != i88) {
                            hVar.t(c10);
                        } else {
                            iArr36[i92] = hVar.i(c10);
                        }
                    }
                } else {
                    a1Var = i80;
                    zArr = zArr15;
                }
                i92++;
                i80 = a1Var;
                zArr15 = zArr;
            }
            a1 a1Var2 = i80;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i87] == 1 && iArr2[iArr33[i87]] > 0) {
                hVar.s();
            }
            i87++;
            i80 = a1Var2;
            zArr15 = zArr16;
            i86 = 2;
        }
        a1 a1Var3 = i80;
        boolean[][] zArr17 = zArr15;
        if (i88 == 0) {
            return new fg.f(null, jVar2, null, null);
        }
        int m14 = hVar.m();
        int i96 = m14 + 1;
        e9.q.e(i96, "expectedSize");
        e9.q.e(i96, "initialCapacity");
        int[] iArr38 = new int[i24];
        Object[] objArr = new Object[i96];
        int i97 = 0;
        int i98 = 0;
        boolean z17 = false;
        while (i97 < i96) {
            int i99 = i97;
            int i100 = hVar.i(16);
            int i101 = hVar.i(16);
            boolean z18 = z17;
            if (hVar.h()) {
                i12 = hVar.i(2);
                if (i12 == 3) {
                    hVar.s();
                }
                i13 = hVar.i(4);
                i14 = hVar.i(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (hVar.h()) {
                int m15 = hVar.m();
                int m16 = hVar.m();
                int m17 = hVar.m();
                int m18 = hVar.m();
                i100 -= (m15 + m16) * ((i12 == 1 || i12 == 2) ? 2 : 1);
                i101 -= (m17 + m18) * (i12 == 1 ? 2 : 1);
            }
            k kVar = new k(i12, i13, i14, i100, i101);
            int h20 = w.h(objArr.length, i98 + 1);
            if (h20 > objArr.length || z18) {
                objArr = Arrays.copyOf(objArr, h20);
                z17 = false;
            } else {
                z17 = z18;
            }
            objArr[i98] = kVar;
            i98++;
            i97 = i99 + 1;
        }
        if (i96 <= 1 || !hVar.h()) {
            for (int i102 = 1; i102 < i24; i102++) {
                iArr38[i102] = Math.min(i102, m14);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c11 = g9.c.c(i96);
            for (int i103 = 1; i103 < i24; i103++) {
                iArr38[i103] = hVar.i(c11);
            }
        }
        pf.b bVar = new pf.b(i0.t(i98, objArr), iArr38);
        hVar.t(2);
        for (int i104 = 1; i104 < i24; i104++) {
            if (iArr2[iArr25[i104]] == 0) {
                hVar.s();
            }
        }
        for (int i105 = 1; i105 < m13; i105++) {
            boolean h21 = hVar.h();
            int i106 = 0;
            while (i106 < iArr31[i105]) {
                if ((i106 <= 0 || !h21) ? i106 == 0 : hVar.h()) {
                    for (int i107 = 0; i107 < iArr35[i105]; i107++) {
                        if (zArr17[i105][i107]) {
                            hVar.m();
                        }
                    }
                    hVar.m();
                    hVar.m();
                }
                i106++;
            }
        }
        int m19 = hVar.m() + 2;
        if (hVar.h()) {
            hVar.t(m19);
        } else {
            for (int i108 = 1; i108 < i24; i108++) {
                for (int i109 = 0; i109 < i108; i109++) {
                    if (zArr12[i108][i109]) {
                        hVar.t(m19);
                    }
                }
            }
        }
        int m20 = hVar.m();
        for (int i110 = 1; i110 <= m20; i110++) {
            hVar.t(8);
        }
        if (hVar.h()) {
            int i111 = hVar.e;
            if (i111 > 0) {
                hVar.t(8 - i111);
            }
            if (!hVar.h() ? hVar.h() : true) {
                hVar.s();
            }
            boolean h22 = hVar.h();
            boolean h23 = hVar.h();
            if (h22 || h23) {
                for (int i112 = 0; i112 < m10; i112++) {
                    for (int i113 = 0; i113 < iArr31[i112]; i113++) {
                        boolean h24 = h22 ? hVar.h() : false;
                        boolean h25 = h23 ? hVar.h() : false;
                        if (h24) {
                            hVar.t(32);
                        }
                        if (h25) {
                            hVar.t(18);
                        }
                    }
                }
            }
            boolean h26 = hVar.h();
            int i114 = h26 ? hVar.i(4) + 1 : i24;
            e9.q.e(i114, "expectedSize");
            e9.q.e(i114, "initialCapacity");
            int[] iArr39 = new int[i24];
            Object[] objArr2 = new Object[i114];
            int i115 = 0;
            int i116 = 0;
            boolean z19 = false;
            while (i115 < i114) {
                hVar.t(3);
                int i117 = hVar.h() ? 1 : 2;
                int f11 = b2.j.f(hVar.i(8));
                boolean z20 = h26;
                int g10 = b2.j.g(hVar.i(8));
                hVar.t(8);
                m mVar = new m(f11, i117, g10);
                int h27 = w.h(objArr2.length, i116 + 1);
                if (h27 > objArr2.length || z19) {
                    objArr2 = Arrays.copyOf(objArr2, h27);
                    z19 = false;
                }
                objArr2[i116] = mVar;
                i115++;
                i116++;
                h26 = z20;
            }
            if (h26 && i114 > 1) {
                for (int i118 = 0; i118 < i24; i118++) {
                    iArr39[i118] = hVar.i(4);
                }
            }
            jVar = new j(i0.t(i116, objArr2), iArr39, 1);
        } else {
            jVar = null;
        }
        return new fg.f(i58, new j(a1Var3, iArr36, 0), bVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o j(int i10, int i11, byte[] bArr) {
        int m10;
        int m11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean h;
        int i17;
        int i18;
        int i19;
        int i20;
        float f7;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean h10;
        boolean h11;
        int i26;
        a4.h hVar = new a4.h(bArr, i10 + 1, i11);
        int i27 = hVar.i(8);
        int i28 = hVar.i(8);
        int i29 = hVar.i(8);
        int m12 = hVar.m();
        if (i27 == 100 || i27 == 110 || i27 == 122 || i27 == 244 || i27 == 44 || i27 == 83 || i27 == 86 || i27 == 118 || i27 == 128 || i27 == 138) {
            m10 = hVar.m();
            boolean h12 = m10 == 3 ? hVar.h() : false;
            int m13 = hVar.m();
            m11 = hVar.m();
            hVar.s();
            if (hVar.h()) {
                int i30 = m10 != 3 ? 8 : 12;
                int i31 = 0;
                while (i31 < i30) {
                    if (hVar.h()) {
                        int i32 = i31 < 6 ? 16 : 64;
                        int i33 = 8;
                        int i34 = 8;
                        for (int i35 = 0; i35 < i32; i35++) {
                            if (i33 != 0) {
                                i33 = ((hVar.n() + i34) + 256) % 256;
                            }
                            if (i33 != 0) {
                                i34 = i33;
                            }
                        }
                    }
                    i31++;
                }
            }
            z10 = h12;
            i12 = m13;
        } else {
            i12 = 0;
            z10 = false;
            m10 = 1;
            m11 = 0;
        }
        int m14 = hVar.m() + 4;
        int m15 = hVar.m();
        if (m15 == 0) {
            i16 = hVar.m() + 4;
            i13 = i27;
            i14 = m15;
            i15 = m11;
        } else {
            if (m15 == 1) {
                boolean h13 = hVar.h();
                hVar.n();
                hVar.n();
                i13 = i27;
                long m16 = hVar.m();
                i14 = m15;
                for (int i36 = 0; i36 < m16; i36++) {
                    hVar.m();
                }
                i15 = m11;
                z11 = h13;
                i16 = 0;
                hVar.m();
                hVar.s();
                int m17 = hVar.m() + 1;
                int m18 = hVar.m() + 1;
                h = hVar.h();
                int i37 = 2 - (h ? 1 : 0);
                int i38 = m18 * i37;
                if (!h) {
                    hVar.s();
                }
                hVar.s();
                int i39 = m17 * 16;
                int i40 = i38 * 16;
                if (hVar.h()) {
                    int m19 = hVar.m();
                    int m20 = hVar.m();
                    int m21 = hVar.m();
                    int m22 = hVar.m();
                    if (m10 == 0) {
                        i26 = 1;
                    } else {
                        i26 = m10 == 3 ? 1 : 2;
                        i37 *= m10 == 1 ? 2 : 1;
                    }
                    i39 -= (m19 + m20) * i26;
                    i40 -= (m21 + m22) * i37;
                }
                int i41 = i40;
                int i42 = i39;
                int i43 = i13;
                int i44 = ((i43 != 44 || i43 == 86 || i43 == 100 || i43 == 110 || i43 == 122 || i43 == 244) && (i28 & 16) != 0) ? 0 : 16;
                int i45 = -1;
                float f10 = 1.0f;
                if (hVar.h()) {
                    i17 = m14;
                    i18 = i15;
                    i19 = i16;
                    i20 = i44;
                    f7 = 1.0f;
                    i21 = -1;
                    i22 = -1;
                    i23 = -1;
                } else {
                    if (hVar.h()) {
                        int i46 = hVar.i(8);
                        if (i46 == 255) {
                            int i47 = hVar.i(16);
                            int i48 = hVar.i(16);
                            if (i47 != 0 && i48 != 0) {
                                f10 = i47 / i48;
                            }
                        } else if (i46 < 17) {
                            f10 = b[i46];
                        } else {
                            i17 = m14;
                            e2.n(i46, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (hVar.h()) {
                                hVar.s();
                            }
                            if (hVar.h()) {
                                i24 = -1;
                            } else {
                                hVar.t(3);
                                i24 = hVar.h() ? 1 : 2;
                                if (hVar.h()) {
                                    int i49 = hVar.i(8);
                                    int i50 = hVar.i(8);
                                    hVar.t(8);
                                    i45 = b2.j.f(i49);
                                    i25 = b2.j.g(i50);
                                    if (hVar.h()) {
                                        hVar.m();
                                        hVar.m();
                                    }
                                    if (hVar.h()) {
                                        hVar.t(65);
                                    }
                                    h10 = hVar.h();
                                    if (h10) {
                                        k(hVar);
                                    }
                                    h11 = hVar.h();
                                    if (h11) {
                                        k(hVar);
                                    }
                                    if (!h10 || h11) {
                                        hVar.s();
                                    }
                                    hVar.s();
                                    if (hVar.h()) {
                                        hVar.s();
                                        hVar.m();
                                        hVar.m();
                                        hVar.m();
                                        hVar.m();
                                        i44 = hVar.m();
                                        hVar.m();
                                    }
                                    int i51 = i45;
                                    i19 = i16;
                                    f7 = f10;
                                    i21 = i51;
                                    i22 = i24;
                                    i23 = i25;
                                    i18 = i15;
                                    i20 = i44;
                                }
                            }
                            i25 = -1;
                            if (hVar.h()) {
                            }
                            if (hVar.h()) {
                            }
                            h10 = hVar.h();
                            if (h10) {
                            }
                            h11 = hVar.h();
                            if (h11) {
                            }
                            if (!h10) {
                            }
                            hVar.s();
                            hVar.s();
                            if (hVar.h()) {
                            }
                            int i512 = i45;
                            i19 = i16;
                            f7 = f10;
                            i21 = i512;
                            i22 = i24;
                            i23 = i25;
                            i18 = i15;
                            i20 = i44;
                        }
                    }
                    i17 = m14;
                    if (hVar.h()) {
                    }
                    if (hVar.h()) {
                    }
                    i25 = -1;
                    if (hVar.h()) {
                    }
                    if (hVar.h()) {
                    }
                    h10 = hVar.h();
                    if (h10) {
                    }
                    h11 = hVar.h();
                    if (h11) {
                    }
                    if (!h10) {
                    }
                    hVar.s();
                    hVar.s();
                    if (hVar.h()) {
                    }
                    int i5122 = i45;
                    i19 = i16;
                    f7 = f10;
                    i21 = i5122;
                    i22 = i24;
                    i23 = i25;
                    i18 = i15;
                    i20 = i44;
                }
                return new o(i43, i28, i29, m12, i42, i41, f7, i12, i18, z10, h, i17, i14, i19, z11, i21, i22, i23, i20);
            }
            i13 = i27;
            i14 = m15;
            i15 = m11;
            i16 = 0;
        }
        z11 = false;
        hVar.m();
        hVar.s();
        int m172 = hVar.m() + 1;
        int m182 = hVar.m() + 1;
        h = hVar.h();
        int i372 = 2 - (h ? 1 : 0);
        int i382 = m182 * i372;
        if (!h) {
        }
        hVar.s();
        int i392 = m172 * 16;
        int i402 = i382 * 16;
        if (hVar.h()) {
        }
        int i412 = i402;
        int i422 = i392;
        int i432 = i13;
        if (i432 != 44) {
        }
        int i452 = -1;
        float f102 = 1.0f;
        if (hVar.h()) {
        }
        return new o(i432, i28, i29, m12, i422, i412, f7, i12, i18, z10, h, i17, i14, i19, z11, i21, i22, i23, i20);
    }

    public static void k(a4.h hVar) {
        int m10 = hVar.m() + 1;
        hVar.t(8);
        for (int i10 = 0; i10 < m10; i10++) {
            hVar.m();
            hVar.m();
            hVar.s();
        }
        hVar.t(20);
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
