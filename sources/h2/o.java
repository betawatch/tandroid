package h2;

import b8.zb;
import d2.v;
import g9.c0;
import g9.f0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class o {
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

    public static int c(byte[] bArr, int i3, int i10, boolean[] zArr) {
        int i11 = i10 - i3;
        zb.p(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            b(zArr);
            return i3 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i3] == 1) {
            b(zArr);
            return i3 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            b(zArr);
            return i3 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i3 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    b(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static String d(v vVar) {
        String str = vVar.s;
        String str2 = vVar.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return vVar.s;
    }

    public static long e(byte b10, byte b11) {
        int i3;
        int i10 = b10 & 255;
        int i11 = b10 & 3;
        if (i11 != 0) {
            i3 = 2;
            if (i11 != 1 && i11 != 2) {
                i3 = b11 & 63;
            }
        } else {
            i3 = 1;
        }
        int i12 = i10 >> 3;
        return i3 * (i12 >= 16 ? 2500 << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static boolean f(byte[] bArr, int i3, v vVar) {
        int i10;
        if (Objects.equals(vVar.s, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i10 = b10 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(vVar.s, "video/hevc")) {
            a7.d h = h(new s(bArr, 4, i3 + 4));
            int i11 = h.a;
            if (i11 == 35) {
                return false;
            }
            if (i11 <= 14 && i11 % 2 == 0 && h.c == vVar.J - 1) {
                return false;
            }
        }
        return true;
    }

    public static int g(v vVar) {
        String d10 = d(vVar);
        if (Objects.equals(d10, "video/avc")) {
            return 1;
        }
        return (Objects.equals(d10, "video/hevc") || Objects.equals(d10, "video/vvc")) ? 2 : 0;
    }

    public static a7.d h(s sVar) {
        sVar.i();
        return new a7.d(sVar.e(6), sVar.e(6), sVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h i(s sVar, boolean z10, int i3, h hVar) {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int[] iArr2 = new int[6];
        if (z10) {
            int e10 = sVar.e(2);
            z12 = sVar.d();
            i13 = sVar.e(5);
            i14 = 0;
            for (int i15 = 0; i15 < 32; i15++) {
                if (sVar.d()) {
                    i14 |= 1 << i15;
                }
            }
            for (int i16 = 0; i16 < 6; i16++) {
                iArr2[i16] = sVar.e(8);
            }
            i10 = e10;
        } else {
            if (hVar == null) {
                iArr = iArr2;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z11 = false;
                int e11 = sVar.e(8);
                int i17 = 0;
                for (int i18 = 0; i18 < i3; i18++) {
                    if (sVar.d()) {
                        i17 += 88;
                    }
                    if (sVar.d()) {
                        i17 += 8;
                    }
                }
                sVar.j(i17);
                if (i3 > 0) {
                    sVar.j((8 - i3) * 2);
                }
                return new h(i10, i11, i12, e11, z11, iArr);
            }
            int i19 = hVar.a;
            z12 = hVar.b;
            i13 = hVar.c;
            i14 = hVar.d;
            iArr2 = hVar.e;
            i10 = i19;
        }
        iArr = iArr2;
        z11 = z12;
        i11 = i13;
        i12 = i14;
        int e112 = sVar.e(8);
        int i172 = 0;
        while (i18 < i3) {
        }
        sVar.j(i172);
        if (i3 > 0) {
        }
        return new h(i10, i11, i12, e112, z11, iArr);
    }

    public static a7.l j(int i3, int i10, byte[] bArr) {
        byte b10;
        int i11 = i3 + 2;
        do {
            i10--;
            b10 = bArr[i10];
            if (b10 != 0) {
                break;
            }
        } while (i10 > i11);
        if (b10 == 0 || i10 <= i11) {
            return null;
        }
        s sVar = new s(bArr, i11, i10 + 1);
        while (sVar.b(16)) {
            int e10 = sVar.e(8);
            int i12 = 0;
            while (e10 == 255) {
                i12 += hs.e4;
                e10 = sVar.e(8);
            }
            int i13 = i12 + e10;
            int e11 = sVar.e(8);
            int i14 = 0;
            while (e11 == 255) {
                i14 += hs.e4;
                e11 = sVar.e(8);
            }
            int i15 = i14 + e11;
            if (i15 == 0 || !sVar.b(i15)) {
                return null;
            }
            if (i13 == 176) {
                int f10 = sVar.f();
                boolean d10 = sVar.d();
                int f11 = d10 ? sVar.f() : 0;
                int f12 = sVar.f();
                int i16 = -1;
                for (int i17 = 0; i17 <= f12; i17++) {
                    i16 = sVar.f();
                    sVar.f();
                    int e12 = sVar.e(6);
                    if (e12 == 63) {
                        return null;
                    }
                    sVar.e(e12 == 0 ? Math.max(0, f10 - 30) : Math.max(0, (e12 + f10) - 31));
                    if (d10) {
                        int e13 = sVar.e(6);
                        if (e13 == 63) {
                            return null;
                        }
                        sVar.e(e13 == 0 ? Math.max(0, f11 - 30) : Math.max(0, (e13 + f11) - 31));
                    }
                    if (sVar.d()) {
                        sVar.j(10);
                    }
                }
                return new a7.l(i16);
            }
            sVar.j(i15 * 8);
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
    public static k k(byte[] bArr, int i3, int i10, za.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int f10;
        int i15;
        int f11;
        int i16;
        int i17;
        int i18;
        int f12;
        int i19;
        h hVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        i iVar;
        int i30;
        int i31;
        int i32;
        p4.q qVar;
        a7.d h = h(new s(bArr, i3, i10));
        s sVar = new s(bArr, i3 + 2, i10);
        int i33 = 4;
        sVar.j(4);
        int e10 = sVar.e(3);
        int i34 = h.b;
        boolean z10 = i34 != 0 && e10 == 7;
        if (pVar != null) {
            i0 i0Var = (i0) pVar.a;
            if (!i0Var.isEmpty()) {
                i11 = ((g) i0Var.get(Math.min(i34, i0Var.size() - 1))).a;
                h hVar2 = null;
                if (z10) {
                    sVar.i();
                    hVar2 = i(sVar, true, e10, null);
                } else if (pVar != null) {
                    i iVar2 = (i) pVar.b;
                    int[] iArr = iVar2.b;
                    i0 i0Var2 = iVar2.a;
                    int i35 = iArr[i11];
                    if (i0Var2.size() > i35) {
                        hVar2 = (h) i0Var2.get(i35);
                    }
                }
                sVar.f();
                if (z10) {
                    int f13 = sVar.f();
                    if (f13 == 3) {
                        sVar.i();
                    }
                    int f14 = sVar.f();
                    int f15 = sVar.f();
                    if (sVar.d()) {
                        int f16 = sVar.f();
                        int f17 = sVar.f();
                        int f18 = sVar.f();
                        int f19 = sVar.f();
                        i12 = f14 - ((f16 + f17) * ((f13 == 1 || f13 == 2) ? 2 : 1));
                        i13 = f15 - ((f18 + f19) * (f13 == 1 ? 2 : 1));
                    } else {
                        i12 = f14;
                        i13 = f15;
                    }
                    i14 = i13;
                    f10 = sVar.f();
                    i15 = i12;
                    f11 = sVar.f();
                    i16 = f15;
                    i17 = f14;
                } else {
                    int e11 = sVar.d() ? sVar.e(8) : -1;
                    if (pVar != null && (qVar = (p4.q) pVar.c) != null) {
                        i0 i0Var3 = (i0) qVar.a;
                        if (e11 == -1) {
                            e11 = ((int[]) qVar.b)[i11];
                        }
                        if (e11 != -1 && i0Var3.size() > e11) {
                            j jVar = (j) i0Var3.get(e11);
                            int i36 = jVar.a;
                            i15 = jVar.d;
                            int i37 = jVar.e;
                            f10 = jVar.b;
                            f11 = jVar.c;
                            i14 = i37;
                            i16 = i14;
                            i17 = i15;
                        }
                    }
                    f10 = 0;
                    f11 = 0;
                    i15 = 0;
                    i17 = 0;
                    i14 = 0;
                    i16 = 0;
                }
                int f20 = sVar.f();
                if (z10) {
                    i18 = -1;
                    for (int i38 = sVar.d() ? 0 : e10; i38 <= e10; i38++) {
                        sVar.f();
                        i18 = Math.max(sVar.f(), i18);
                        sVar.f();
                    }
                } else {
                    i18 = -1;
                }
                sVar.f();
                sVar.f();
                sVar.f();
                sVar.f();
                sVar.f();
                sVar.f();
                if (sVar.d()) {
                    int i39 = 6;
                    if (z10 ? sVar.d() : false) {
                        sVar.j(6);
                    } else if (sVar.d()) {
                        int i40 = 0;
                        while (i40 < i33) {
                            int i41 = 0;
                            while (i41 < i39) {
                                if (sVar.d()) {
                                    int min = Math.min(64, 1 << ((i40 << 1) + 4));
                                    if (i40 > 1) {
                                        sVar.g();
                                    }
                                    for (int i42 = 0; i42 < min; i42++) {
                                        sVar.g();
                                    }
                                } else {
                                    sVar.f();
                                }
                                i41 += i40 == 3 ? 3 : 1;
                                i39 = 6;
                            }
                            i40++;
                            i33 = 4;
                            i39 = 6;
                        }
                    }
                }
                sVar.j(2);
                if (sVar.d()) {
                    sVar.j(8);
                    sVar.f();
                    sVar.f();
                    sVar.i();
                }
                f12 = sVar.f();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i19 = 0;
                int i43 = -1;
                int i44 = -1;
                while (i19 < f12) {
                    if (i19 == 0 || !sVar.d()) {
                        i30 = f12;
                        i31 = i11;
                        i32 = i19;
                        int f21 = sVar.f();
                        i43 = sVar.f();
                        int[] iArr4 = new int[f21];
                        int i45 = 0;
                        while (i45 < f21) {
                            iArr4[i45] = (i45 > 0 ? iArr4[i45 - 1] : 0) - (sVar.f() + 1);
                            sVar.i();
                            i45++;
                        }
                        int[] iArr5 = new int[i43];
                        int i46 = 0;
                        while (i46 < i43) {
                            iArr5[i46] = sVar.f() + 1 + (i46 > 0 ? iArr5[i46 - 1] : 0);
                            sVar.i();
                            i46++;
                        }
                        i44 = f21;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i30 = f12;
                        int i47 = i44 + i43;
                        int f22 = (1 - ((sVar.d() ? 1 : 0) * 2)) * (sVar.f() + 1);
                        i31 = i11;
                        int i48 = i47 + 1;
                        i32 = i19;
                        boolean[] zArr = new boolean[i48];
                        for (int i49 = 0; i49 <= i47; i49++) {
                            if (sVar.d()) {
                                zArr[i49] = true;
                            } else {
                                zArr[i49] = sVar.d();
                            }
                        }
                        int[] iArr6 = new int[i48];
                        int[] iArr7 = new int[i48];
                        int i50 = 0;
                        for (int i51 = i43 - 1; i51 >= 0; i51--) {
                            int i52 = iArr3[i51] + f22;
                            if (i52 < 0 && zArr[i44 + i51]) {
                                iArr6[i50] = i52;
                                i50++;
                            }
                        }
                        if (f22 < 0 && zArr[i47]) {
                            iArr6[i50] = f22;
                            i50++;
                        }
                        int i53 = i50;
                        int[] iArr8 = iArr2;
                        for (int i54 = 0; i54 < i44; i54++) {
                            int i55 = iArr8[i54] + f22;
                            if (i55 < 0 && zArr[i54]) {
                                iArr6[i53] = i55;
                                i53++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i53);
                        int i56 = 0;
                        for (int i57 = i44 - 1; i57 >= 0; i57--) {
                            int i58 = iArr8[i57] + f22;
                            if (i58 > 0 && zArr[i57]) {
                                iArr7[i56] = i58;
                                i56++;
                            }
                        }
                        if (f22 > 0 && zArr[i47]) {
                            iArr7[i56] = f22;
                            i56++;
                        }
                        int i59 = i53;
                        int i60 = i56;
                        for (int i61 = 0; i61 < i43; i61++) {
                            int i62 = iArr3[i61] + f22;
                            if (i62 > 0 && zArr[i44 + i61]) {
                                iArr7[i60] = i62;
                                i60++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i60);
                        i43 = i60;
                        i44 = i59;
                        iArr2 = copyOf;
                    }
                    i19 = i32 + 1;
                    f12 = i30;
                    i11 = i31;
                }
                int i63 = i11;
                if (sVar.d()) {
                    int f23 = sVar.f();
                    for (int i64 = 0; i64 < f23; i64++) {
                        sVar.j(f20 + 5);
                    }
                }
                sVar.j(2);
                float f24 = 1.0f;
                if (sVar.d()) {
                    hVar = hVar2;
                    i20 = f10;
                    i21 = i15;
                    i22 = i17;
                    i23 = i16;
                    i24 = -1;
                    i25 = -1;
                    i26 = -1;
                } else {
                    if (sVar.d()) {
                        int e12 = sVar.e(8);
                        if (e12 == 255) {
                            int e13 = sVar.e(16);
                            int e14 = sVar.e(16);
                            if (e13 != 0 && e14 != 0) {
                                f24 = e13 / e14;
                            }
                        } else if (e12 < 17) {
                            f24 = b[e12];
                        } else {
                            com.google.android.recaptcha.internal.a.o(e12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (sVar.d()) {
                        sVar.i();
                    }
                    if (sVar.d()) {
                        sVar.j(3);
                        i29 = sVar.d() ? 1 : 2;
                        if (sVar.d()) {
                            int e15 = sVar.e(8);
                            int e16 = sVar.e(8);
                            sVar.j(8);
                            i27 = d2.n.f(e15);
                            i28 = d2.n.g(e16);
                        } else {
                            i27 = -1;
                            i28 = -1;
                        }
                    } else {
                        if (pVar != null && (iVar = (i) pVar.d) != null) {
                            i0 i0Var4 = iVar.a;
                            int i65 = iVar.b[i63];
                            if (i0Var4.size() > i65) {
                                l lVar = (l) i0Var4.get(i65);
                                int i66 = lVar.a;
                                int i67 = lVar.b;
                                i28 = lVar.c;
                                i27 = i66;
                                i29 = i67;
                            }
                        }
                        i27 = -1;
                        i28 = -1;
                        i29 = -1;
                    }
                    if (sVar.d()) {
                        sVar.f();
                        sVar.f();
                    }
                    sVar.i();
                    if (sVar.d()) {
                        i14 *= 2;
                    }
                    i24 = i27;
                    i26 = i28;
                    i25 = i29;
                    hVar = hVar2;
                    i20 = f10;
                    i21 = i15;
                    i22 = i17;
                    i23 = i16;
                }
                return new k(e10, hVar, i20, f11, i21, i14, i22, i23, f24, i18, i24, i25, i26);
            }
        }
        i11 = 0;
        h hVar22 = null;
        if (z10) {
        }
        sVar.f();
        if (z10) {
        }
        int f202 = sVar.f();
        if (z10) {
        }
        sVar.f();
        sVar.f();
        sVar.f();
        sVar.f();
        sVar.f();
        sVar.f();
        if (sVar.d()) {
        }
        sVar.j(2);
        if (sVar.d()) {
        }
        f12 = sVar.f();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i19 = 0;
        int i432 = -1;
        int i442 = -1;
        while (i19 < f12) {
        }
        int i632 = i11;
        if (sVar.d()) {
        }
        sVar.j(2);
        float f242 = 1.0f;
        if (sVar.d()) {
        }
        return new k(e10, hVar, i20, f11, i21, i14, i22, i23, f242, i18, i24, i25, i26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static za.p l(int i3, int i10, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        i iVar;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        s1 s1Var;
        boolean[][] zArr;
        int i15;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i16;
        boolean z11;
        int i17;
        boolean d10;
        int i18;
        int i19;
        int i20;
        boolean d11;
        int i21;
        int i22;
        boolean z12;
        boolean z13;
        s sVar = new s(bArr, i3, i10);
        h(sVar);
        sVar.j(4);
        boolean d12 = sVar.d();
        boolean d13 = sVar.d();
        int e10 = sVar.e(6);
        int i23 = e10 + 1;
        int e11 = sVar.e(3);
        sVar.j(17);
        h i24 = i(sVar, true, e11, null);
        for (int i25 = sVar.d() ? 0 : e11; i25 <= e11; i25++) {
            sVar.f();
            sVar.f();
            sVar.f();
        }
        int e12 = sVar.e(6);
        int f10 = sVar.f() + 1;
        int i26 = 6;
        int i27 = 1;
        i iVar2 = new i(i0.u(i24), new int[1], 0);
        boolean z14 = i23 >= 2 && f10 >= 2;
        boolean z15 = d12 && d13;
        int i28 = e12 + 1;
        boolean z16 = i28 >= i23;
        if (!z14 || !z15 || !z16) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, f10, i28);
        int[] iArr6 = new int[f10];
        int[] iArr7 = new int[f10];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i29 = 1; i29 < f10; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= e12; i31++) {
                if (sVar.d()) {
                    iArr5[i29][i30] = i31;
                    iArr7[i29] = i31;
                    i30++;
                }
                iArr6[i29] = i30;
            }
        }
        if (sVar.d()) {
            sVar.j(64);
            if (sVar.d()) {
                sVar.f();
            }
            int f11 = sVar.f();
            int i32 = 0;
            while (i32 < f11) {
                sVar.f();
                if (i32 == 0 || sVar.d()) {
                    boolean d14 = sVar.d();
                    boolean d15 = sVar.d();
                    z13 = d14;
                    z12 = d15;
                    if (d14 || d15) {
                        d10 = sVar.d();
                        if (d10) {
                            sVar.j(19);
                        }
                        sVar.j(8);
                        if (d10) {
                            sVar.j(4);
                        }
                        sVar.j(15);
                        i19 = d14;
                        i18 = d15;
                        i20 = 0;
                        while (i20 <= e11) {
                            boolean d16 = sVar.d();
                            if (!d16) {
                                d16 = sVar.d();
                            }
                            if (d16) {
                                sVar.f();
                                d11 = false;
                            } else {
                                d11 = sVar.d();
                            }
                            if (d11) {
                                i21 = i32;
                                i22 = 0;
                            } else {
                                i21 = i32;
                                i22 = sVar.f();
                            }
                            int[][] iArr8 = iArr5;
                            int i33 = i19 + i18;
                            int[] iArr9 = iArr7;
                            int i34 = 0;
                            while (i34 < i33) {
                                int i35 = i33;
                                for (int i36 = 0; i36 <= i22; i36++) {
                                    sVar.f();
                                    sVar.f();
                                    if (d10) {
                                        sVar.f();
                                        sVar.f();
                                    }
                                    sVar.i();
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
                    z13 = false;
                    z12 = false;
                }
                d10 = false;
                i19 = z13;
                i18 = z12;
                i20 = 0;
                while (i20 <= e11) {
                }
                i32++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!sVar.d()) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int i37 = sVar.d;
        if (i37 > 0) {
            sVar.j(8 - i37);
        }
        h i38 = i(sVar, false, e11, i24);
        boolean d17 = sVar.d();
        boolean[] zArr3 = new boolean[16];
        int i39 = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            boolean d18 = sVar.d();
            zArr3[i40] = d18;
            if (d18) {
                i39++;
            }
        }
        if (i39 == 0 || !zArr3[1]) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int[] iArr12 = new int[i39];
        for (int i41 = 0; i41 < i39 - (d17 ? 1 : 0); i41++) {
            iArr12[i41] = sVar.e(3);
        }
        int[] iArr13 = new int[i39 + 1];
        if (d17) {
            int i42 = 1;
            while (i42 < i39) {
                int[] iArr14 = iArr13;
                for (int i43 = 0; i43 < i42; i43++) {
                    iArr14[i42] = iArr12[i43] + 1 + iArr14[i42];
                }
                i42++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i39] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i23, i39);
        int[] iArr16 = new int[i23];
        iArr16[0] = 0;
        boolean d19 = sVar.d();
        int i44 = 1;
        while (i44 < i23) {
            if (d19) {
                i17 = i44;
                iArr16[i17] = sVar.e(i26);
            } else {
                i17 = i44;
                iArr16[i17] = i17;
            }
            if (d17) {
                for (int i45 = 0; i45 < i39; i45++) {
                    iArr15[i17][i45] = (iArr16[i17] & ((1 << iArr[r31]) - 1)) >> iArr[i45];
                }
            } else {
                int i46 = 0;
                while (i46 < i39) {
                    int i47 = i46;
                    iArr15[i17][i47] = sVar.e(iArr12[i46] + 1);
                    i46 = i47 + 1;
                }
            }
            i44 = i17 + 1;
            i26 = 6;
        }
        int[] iArr17 = new int[i28];
        int i48 = 1;
        int i49 = 0;
        while (i49 < i23) {
            iArr17[iArr16[i49]] = -1;
            int[] iArr18 = iArr17;
            int i50 = 0;
            int i51 = 0;
            while (i50 < 16) {
                if (zArr3[i50]) {
                    if (i50 == i27) {
                        iArr18[iArr16[i49]] = iArr15[i49][i51];
                    }
                    i51++;
                }
                i50++;
                i27 = 1;
            }
            if (i49 > 0) {
                int i52 = 0;
                while (true) {
                    if (i52 >= i49) {
                        z11 = true;
                        break;
                    }
                    int i53 = i52;
                    if (iArr18[iArr16[i49]] == iArr18[iArr16[i52]]) {
                        z11 = false;
                        break;
                    }
                    i52 = i53 + 1;
                }
                if (z11) {
                    i48++;
                }
            }
            i49++;
            iArr17 = iArr18;
            i27 = 1;
        }
        int[] iArr19 = iArr17;
        int e13 = sVar.e(4);
        if (i48 < 2 || e13 == 0) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int[] iArr20 = new int[i48];
        for (int i54 = 0; i54 < i48; i54++) {
            iArr20[i54] = sVar.e(e13);
        }
        int[] iArr21 = new int[i28];
        int i55 = 0;
        while (i55 < i23) {
            iArr21[Math.min(iArr16[i55], e12)] = i55;
            i55++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        f0 p10 = i0.p();
        int i56 = 0;
        while (i56 <= e12) {
            int i57 = i48;
            int[] iArr23 = iArr16;
            int min = Math.min(iArr19[i56], i57 - 1);
            int[] iArr24 = iArr21;
            p10.c(new g(iArr24[i56], min >= 0 ? iArr22[min] : -1));
            i56++;
            i48 = i57;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        s1 f12 = p10.f();
        if (((g) f12.get(0)).b == -1) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int i58 = 1;
        while (true) {
            if (i58 > e12) {
                i58 = -1;
                break;
            }
            if (((g) f12.get(i58)).b != -1) {
                break;
            }
            i58++;
        }
        if (i58 == -1) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        int i59 = 1;
        while (i59 < i23) {
            boolean[][] zArr6 = zArr5;
            for (int i60 = 0; i60 < i59; i60++) {
                boolean[] zArr7 = zArr4[i59];
                boolean[] zArr8 = zArr6[i59];
                boolean d20 = sVar.d();
                zArr8[i60] = d20;
                zArr7[i60] = d20;
            }
            i59++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i61 = 1; i61 < i23; i61++) {
            int i62 = 0;
            while (i62 < e10) {
                boolean[][] zArr10 = zArr4;
                int i63 = 0;
                while (true) {
                    if (i63 < i61) {
                        boolean[] zArr11 = zArr9[i61];
                        if (zArr11[i63] && zArr9[i63][i62]) {
                            zArr11[i62] = true;
                            break;
                        }
                        i63++;
                    }
                }
                i62++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i28];
        for (int i64 = 0; i64 < i23; i64++) {
            int i65 = 0;
            for (int i66 = 0; i66 < i64; i66++) {
                i65 += zArr12[i64][i66] ? 1 : 0;
            }
            iArr26[iArr25[i64]] = i65;
        }
        int i67 = 0;
        for (int i68 = 0; i68 < i23; i68++) {
            if (iArr26[iArr25[i68]] == 0) {
                i67++;
            }
        }
        if (i67 > 1) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int[] iArr27 = new int[i23];
        int[] iArr28 = new int[f10];
        if (sVar.d()) {
            iArr2 = iArr26;
            int i69 = 0;
            while (i69 < i23) {
                int i70 = i69;
                iArr27[i70] = sVar.e(3);
                i69 = i70 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i23, e11);
        }
        int i71 = 0;
        while (i71 < f10) {
            int i72 = i71;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i73 = 0;
            for (int i74 = 0; i74 < iArr6[i72]; i74++) {
                i73 = Math.max(i73, iArr29[((g) f12.get(iArr10[i72][i74])).a]);
            }
            iArr30[i72] = i73 + 1;
            i71 = i72 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (sVar.d()) {
            int i75 = 0;
            while (i75 < e10) {
                int i76 = i75 + 1;
                int i77 = i76;
                while (i77 < i23) {
                    if (zArr12[i77][i75]) {
                        i16 = e10;
                        sVar.j(3);
                    } else {
                        i16 = e10;
                    }
                    i77++;
                    e10 = i16;
                }
                i75 = i76;
            }
        }
        sVar.i();
        int f13 = sVar.f() + 1;
        f0 p11 = i0.p();
        p11.c(i24);
        if (f13 > 1) {
            p11.c(i38);
            for (int i78 = 2; i78 < f13; i78++) {
                i38 = i(sVar, sVar.d(), e11, i38);
                p11.c(i38);
            }
        }
        s1 f14 = p11.f();
        int f15 = sVar.f() + f10;
        if (f15 > f10) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int e14 = sVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, f15, i28);
        int[] iArr32 = new int[f15];
        int i79 = 0;
        int[] iArr33 = new int[f15];
        int i80 = 0;
        while (i80 < f10) {
            iArr32[i80] = i79;
            iArr33[i80] = iArr11[i80];
            if (e14 == 0) {
                i15 = i80;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i15], i79, iArr6[i15], true);
                iArr3[i15] = iArr4[i15];
            } else {
                i15 = i80;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (e14 == 1) {
                    int i81 = iArr11[i15];
                    for (int i82 = 0; i82 < iArr4[i15]; i82++) {
                        zArr2[i15][i82] = iArr10[i15][i82] == i81;
                    }
                    iArr3[i15] = 1;
                } else {
                    i79 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i80 = i15 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i79 = 0;
            i80 = i15 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i28];
        int i83 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i28;
        iArr37[i79] = f15;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i84 = 1;
        int i85 = 0;
        while (i84 < f15) {
            if (e14 == i83) {
                for (int i86 = 0; i86 < iArr35[i84]; i86++) {
                    zArr14[i84][i86] = sVar.d();
                    int i87 = iArr34[i84];
                    boolean z17 = zArr14[i84][i86];
                    iArr34[i84] = i87 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr33[i84] = iArr10[i84][i86];
                    }
                }
            }
            if (i85 == 0) {
                i14 = 0;
                if (iArr10[i84][0] == 0 && zArr14[i84][0]) {
                    for (int i88 = 1; i88 < iArr35[i84]; i88++) {
                        if (iArr10[i84][i88] == i58 && zArr14[i84][i58]) {
                            i85 = i84;
                        }
                    }
                }
            } else {
                i14 = 0;
            }
            int i89 = i14;
            while (i89 < iArr35[i84]) {
                if (f13 > 1) {
                    zArr15[i84][i89] = zArr14[i84][i89];
                    s1Var = f14;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c2 = i9.c.c(f13);
                    if (!zArr[i84][i89]) {
                        int i90 = ((g) f12.get(iArr10[i84][i89])).a;
                        int i91 = i14;
                        while (true) {
                            if (i91 >= i89) {
                                break;
                            }
                            int i92 = i91;
                            if (zArr9[i90][((g) f12.get(iArr10[i84][i92])).a]) {
                                zArr[i84][i89] = true;
                                break;
                            }
                            i91 = i92 + 1;
                        }
                    }
                    if (zArr[i84][i89]) {
                        if (i85 <= 0 || i84 != i85) {
                            sVar.j(c2);
                        } else {
                            iArr36[i89] = sVar.e(c2);
                        }
                    }
                } else {
                    s1Var = f14;
                    zArr = zArr15;
                }
                i89++;
                f14 = s1Var;
                zArr15 = zArr;
            }
            s1 s1Var2 = f14;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i84] == 1 && iArr2[iArr33[i84]] > 0) {
                sVar.i();
            }
            i84++;
            f14 = s1Var2;
            zArr15 = zArr16;
            i83 = 2;
        }
        s1 s1Var3 = f14;
        boolean[][] zArr17 = zArr15;
        if (i85 == 0) {
            return new za.p((s1) null, iVar2, (p4.q) null, (i) null);
        }
        int f16 = sVar.f();
        int i93 = f16 + 1;
        g9.o.g(i93, "expectedSize");
        g9.o.g(i93, "initialCapacity");
        int[] iArr38 = new int[i23];
        Object[] objArr = new Object[i93];
        int i94 = 0;
        int i95 = 0;
        boolean z18 = false;
        while (i94 < i93) {
            int i96 = i94;
            int e15 = sVar.e(16);
            int e16 = sVar.e(16);
            boolean z19 = z18;
            if (sVar.d()) {
                i11 = sVar.e(2);
                if (i11 == 3) {
                    sVar.i();
                }
                i12 = sVar.e(4);
                i13 = sVar.e(4);
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            if (sVar.d()) {
                int f17 = sVar.f();
                int f18 = sVar.f();
                int f19 = sVar.f();
                int f20 = sVar.f();
                e15 -= (f17 + f18) * ((i11 == 1 || i11 == 2) ? 2 : 1);
                e16 -= (f19 + f20) * (i11 == 1 ? 2 : 1);
            }
            j jVar = new j(i11, i12, i13, e15, e16);
            int b10 = c0.b(objArr.length, i95 + 1);
            if (b10 > objArr.length || z19) {
                objArr = Arrays.copyOf(objArr, b10);
                z10 = false;
            } else {
                z10 = z19;
            }
            objArr[i95] = jVar;
            i95++;
            i94 = i96 + 1;
            z18 = z10;
        }
        if (i93 <= 1 || !sVar.d()) {
            for (int i97 = 1; i97 < i23; i97++) {
                iArr38[i97] = Math.min(i97, f16);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c10 = i9.c.c(i93);
            for (int i98 = 1; i98 < i23; i98++) {
                iArr38[i98] = sVar.e(c10);
            }
        }
        s1 o10 = i0.o(i95, objArr);
        p4.q qVar = new p4.q();
        qVar.a = i0.q(o10);
        qVar.b = iArr38;
        sVar.j(2);
        for (int i99 = 1; i99 < i23; i99++) {
            if (iArr2[iArr25[i99]] == 0) {
                sVar.i();
            }
        }
        for (int i100 = 1; i100 < f15; i100++) {
            boolean d21 = sVar.d();
            int i101 = 0;
            while (i101 < iArr31[i100]) {
                if ((i101 <= 0 || !d21) ? i101 == 0 : sVar.d()) {
                    for (int i102 = 0; i102 < iArr35[i100]; i102++) {
                        if (zArr17[i100][i102]) {
                            sVar.f();
                        }
                    }
                    sVar.f();
                    sVar.f();
                }
                i101++;
            }
        }
        int f21 = sVar.f() + 2;
        if (sVar.d()) {
            sVar.j(f21);
        } else {
            for (int i103 = 1; i103 < i23; i103++) {
                for (int i104 = 0; i104 < i103; i104++) {
                    if (zArr12[i103][i104]) {
                        sVar.j(f21);
                    }
                }
            }
        }
        int f22 = sVar.f();
        for (int i105 = 1; i105 <= f22; i105++) {
            sVar.j(8);
        }
        if (sVar.d()) {
            int i106 = sVar.d;
            if (i106 > 0) {
                sVar.j(8 - i106);
            }
            if (!sVar.d() ? sVar.d() : true) {
                sVar.i();
            }
            boolean d22 = sVar.d();
            boolean d23 = sVar.d();
            if (d22 || d23) {
                for (int i107 = 0; i107 < f10; i107++) {
                    for (int i108 = 0; i108 < iArr31[i107]; i108++) {
                        boolean d24 = d22 ? sVar.d() : false;
                        boolean d25 = d23 ? sVar.d() : false;
                        if (d24) {
                            sVar.j(32);
                        }
                        if (d25) {
                            sVar.j(18);
                        }
                    }
                }
            }
            boolean d26 = sVar.d();
            int e17 = d26 ? sVar.e(4) + 1 : i23;
            g9.o.g(e17, "expectedSize");
            g9.o.g(e17, "initialCapacity");
            int[] iArr39 = new int[i23];
            Object[] objArr2 = new Object[e17];
            int i109 = 0;
            int i110 = 0;
            boolean z20 = false;
            while (i109 < e17) {
                sVar.j(3);
                int i111 = sVar.d() ? 1 : 2;
                int f23 = d2.n.f(sVar.e(8));
                boolean z21 = d26;
                int g7 = d2.n.g(sVar.e(8));
                sVar.j(8);
                l lVar = new l(f23, i111, g7);
                int b11 = c0.b(objArr2.length, i110 + 1);
                if (b11 > objArr2.length || z20) {
                    objArr2 = Arrays.copyOf(objArr2, b11);
                    z20 = false;
                }
                objArr2[i110] = lVar;
                i109++;
                i110++;
                d26 = z21;
                z20 = z20;
            }
            if (d26 && e17 > 1) {
                for (int i112 = 0; i112 < i23; i112++) {
                    iArr39[i112] = sVar.e(4);
                }
            }
            iVar = new i(i0.o(i110, objArr2), iArr39, 1);
        } else {
            iVar = null;
        }
        return new za.p(f12, new i(s1Var3, iArr36, 0), qVar, iVar);
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
    public static n m(int i3, int i10, byte[] bArr) {
        int f10;
        int f11;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean d10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f12;
        int i23;
        int i24;
        int i25;
        boolean d11;
        boolean d12;
        int i26;
        s sVar = new s(bArr, i3 + 1, i10);
        int e10 = sVar.e(8);
        int e11 = sVar.e(8);
        int e12 = sVar.e(8);
        int f13 = sVar.f();
        if (e10 == 100 || e10 == 110 || e10 == 122 || e10 == 244 || e10 == 44 || e10 == 83 || e10 == 86 || e10 == 118 || e10 == 128 || e10 == 138) {
            f10 = sVar.f();
            boolean d13 = f10 == 3 ? sVar.d() : false;
            int f14 = sVar.f();
            f11 = sVar.f();
            sVar.i();
            if (sVar.d()) {
                int i27 = f10 != 3 ? 8 : 12;
                i11 = 16;
                int i28 = 0;
                while (i28 < i27) {
                    if (sVar.d()) {
                        int i29 = i28 < 6 ? 16 : 64;
                        int i30 = 8;
                        int i31 = 8;
                        for (int i32 = 0; i32 < i29; i32++) {
                            if (i30 != 0) {
                                i30 = ((sVar.g() + i31) + 256) % 256;
                            }
                            if (i30 != 0) {
                                i31 = i30;
                            }
                        }
                    }
                    i28++;
                }
            } else {
                i11 = 16;
            }
            z10 = d13;
            i12 = f14;
        } else {
            f10 = 1;
            i11 = 16;
            i12 = 0;
            z10 = false;
            f11 = 0;
        }
        int f15 = sVar.f() + 4;
        int f16 = sVar.f();
        if (f16 == 0) {
            i16 = sVar.f() + 4;
            i13 = e10;
            i14 = f16;
            i15 = f11;
        } else {
            if (f16 == 1) {
                boolean d14 = sVar.d();
                sVar.g();
                sVar.g();
                i13 = e10;
                long f17 = sVar.f();
                i14 = f16;
                for (int i33 = 0; i33 < f17; i33++) {
                    sVar.f();
                }
                i15 = f11;
                z11 = d14;
                i16 = 0;
                sVar.f();
                sVar.i();
                int f18 = sVar.f() + 1;
                int f19 = sVar.f() + 1;
                d10 = sVar.d();
                int i34 = 2 - (d10 ? 1 : 0);
                int i35 = f19 * i34;
                if (!d10) {
                    sVar.i();
                }
                sVar.i();
                int i36 = f18 * 16;
                int i37 = i35 * 16;
                if (sVar.d()) {
                    int f20 = sVar.f();
                    int f21 = sVar.f();
                    int f22 = sVar.f();
                    int f23 = sVar.f();
                    if (f10 == 0) {
                        i26 = 1;
                    } else {
                        i26 = f10 == 3 ? 1 : 2;
                        i34 *= f10 == 1 ? 2 : 1;
                    }
                    i36 -= (f20 + f21) * i26;
                    i37 -= (f22 + f23) * i34;
                }
                int i38 = i37;
                int i39 = i36;
                int i40 = i13;
                int i41 = ((i40 != 44 || i40 == 86 || i40 == 100 || i40 == 110 || i40 == 122 || i40 == 244) && (e11 & 16) != 0) ? 0 : i11;
                int i42 = -1;
                float f24 = 1.0f;
                if (sVar.d()) {
                    i17 = f15;
                    i18 = i15;
                    i19 = i41;
                    i20 = -1;
                    i21 = -1;
                    i22 = i16;
                    f12 = 1.0f;
                    i23 = -1;
                } else {
                    if (sVar.d()) {
                        int e13 = sVar.e(8);
                        if (e13 == 255) {
                            int i43 = i11;
                            int e14 = sVar.e(i43);
                            int e15 = sVar.e(i43);
                            if (e14 != 0 && e15 != 0) {
                                f24 = e14 / e15;
                            }
                        } else if (e13 < 17) {
                            f24 = b[e13];
                        } else {
                            i17 = f15;
                            com.google.android.recaptcha.internal.a.o(e13, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (sVar.d()) {
                                sVar.i();
                            }
                            if (sVar.d()) {
                                i24 = -1;
                                i25 = -1;
                            } else {
                                sVar.j(3);
                                i24 = sVar.d() ? 1 : 2;
                                if (sVar.d()) {
                                    int e16 = sVar.e(8);
                                    int e17 = sVar.e(8);
                                    sVar.j(8);
                                    i42 = d2.n.f(e16);
                                    i25 = d2.n.g(e17);
                                } else {
                                    i25 = -1;
                                }
                            }
                            if (sVar.d()) {
                                sVar.f();
                                sVar.f();
                            }
                            if (sVar.d()) {
                                sVar.j(65);
                            }
                            d11 = sVar.d();
                            if (d11) {
                                n(sVar);
                            }
                            d12 = sVar.d();
                            if (d12) {
                                n(sVar);
                            }
                            if (!d11 || d12) {
                                sVar.i();
                            }
                            sVar.i();
                            if (sVar.d()) {
                                sVar.i();
                                sVar.f();
                                sVar.f();
                                sVar.f();
                                sVar.f();
                                i41 = sVar.f();
                                sVar.f();
                            }
                            int i44 = i42;
                            i22 = i16;
                            f12 = f24;
                            i23 = i44;
                            i20 = i24;
                            i21 = i25;
                            i18 = i15;
                            i19 = i41;
                        }
                    }
                    i17 = f15;
                    if (sVar.d()) {
                    }
                    if (sVar.d()) {
                    }
                    if (sVar.d()) {
                    }
                    if (sVar.d()) {
                    }
                    d11 = sVar.d();
                    if (d11) {
                    }
                    d12 = sVar.d();
                    if (d12) {
                    }
                    if (!d11) {
                    }
                    sVar.i();
                    sVar.i();
                    if (sVar.d()) {
                    }
                    int i442 = i42;
                    i22 = i16;
                    f12 = f24;
                    i23 = i442;
                    i20 = i24;
                    i21 = i25;
                    i18 = i15;
                    i19 = i41;
                }
                return new n(i40, e11, e12, f13, i39, i38, f12, i12, i18, z10, d10, i17, i14, i22, z11, i23, i20, i21, i19);
            }
            i13 = e10;
            i14 = f16;
            i15 = f11;
            i16 = 0;
        }
        z11 = false;
        sVar.f();
        sVar.i();
        int f182 = sVar.f() + 1;
        int f192 = sVar.f() + 1;
        d10 = sVar.d();
        int i342 = 2 - (d10 ? 1 : 0);
        int i352 = f192 * i342;
        if (!d10) {
        }
        sVar.i();
        int i362 = f182 * 16;
        int i372 = i352 * 16;
        if (sVar.d()) {
        }
        int i382 = i372;
        int i392 = i362;
        int i402 = i13;
        if (i402 != 44) {
        }
        int i422 = -1;
        float f242 = 1.0f;
        if (sVar.d()) {
        }
        return new n(i402, e11, e12, f13, i392, i382, f12, i12, i18, z10, d10, i17, i14, i22, z11, i23, i20, i21, i19);
    }

    public static void n(s sVar) {
        int f10 = sVar.f() + 1;
        sVar.j(8);
        for (int i3 = 0; i3 < f10; i3++) {
            sVar.f();
            sVar.f();
            sVar.i();
        }
        sVar.j(20);
    }

    public static ArrayList o(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = asReadOnlyBuffer.get();
                int i3 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i10 = 0; i10 < 8; i10++) {
                        byte b11 = asReadOnlyBuffer.get();
                        remaining |= (b11 & Byte.MAX_VALUE) << (i10 * 7);
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
                arrayList.add(new q(i3, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int p(int i3, byte[] bArr) {
        int i10;
        synchronized (c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i3) {
                while (true) {
                    if (i11 >= i3 - 2) {
                        i11 = i3;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i11 < i3) {
                    int[] iArr = d;
                    if (iArr.length <= i12) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i3 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
