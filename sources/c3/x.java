package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final ki.f o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, ki.f fVar) {
        this.a = list;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = i15;
        this.h = i16;
        this.i = i17;
        this.j = i18;
        this.k = i19;
        this.l = f7;
        this.m = i20;
        this.n = str;
        this.o = fVar;
    }

    public static x a(e2.v vVar, boolean z10, ki.f fVar) {
        com.google.android.gms.internal.cast.a g10;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                vVar.K(4);
            } else {
                vVar.K(21);
            }
            int x10 = vVar.x() & 3;
            int x11 = vVar.x();
            int i12 = vVar.b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < x11; i15++) {
                vVar.K(1);
                int D = vVar.D();
                for (int i16 = 0; i16 < D; i16++) {
                    int D2 = vVar.D();
                    i14 += D2 + 4;
                    vVar.K(D2);
                }
            }
            vVar.J(i12);
            byte[] bArr = new byte[i14];
            ki.f fVar2 = fVar;
            String str = null;
            int i17 = 0;
            int i18 = 0;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f7 = 1.0f;
            int i28 = -1;
            while (i17 < x11) {
                int x12 = vVar.x() & 63;
                int D3 = vVar.D();
                ki.f fVar3 = fVar2;
                int i29 = 0;
                while (i29 < D3) {
                    int D4 = vVar.D();
                    int i30 = x10;
                    System.arraycopy(f2.o.a, i13, bArr, i18, i11);
                    int i31 = i18 + 4;
                    System.arraycopy(vVar.a, vVar.b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.o.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.k h = f2.o.h(bArr, i31, i31 + D4, fVar3);
                            i19 = h.a + 1;
                            i20 = h.g;
                            int i32 = h.h;
                            i22 = h.c + 8;
                            i23 = h.d + 8;
                            int i33 = h.k;
                            i21 = i32;
                            int i34 = h.l;
                            int i35 = h.m;
                            float f10 = h.i;
                            int i36 = h.j;
                            f2.h hVar = h.b;
                            if (hVar != null) {
                                i10 = i36;
                                str = e2.e.a(hVar.a, hVar.c, hVar.d, hVar.f, hVar.b, hVar.e);
                            } else {
                                i10 = i36;
                            }
                            i28 = i10;
                            f7 = f10;
                            i26 = i35;
                            i25 = i34;
                            i24 = i33;
                        } else if (x12 == 39 && i29 == 0 && (g10 = f2.o.g(i31, i31 + D4, bArr)) != null && fVar3 != null) {
                            i13 = 0;
                            i27 = g10.a == ((f2.g) ((e9.i0) fVar3.a).get(0)).b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i18 = i31 + D4;
                    vVar.K(D4);
                    i29++;
                    x10 = i30;
                    i11 = 4;
                }
                i17++;
                fVar2 = fVar3;
                i11 = 4;
            }
            return new x(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), x10 + 1, i19, i20, i21, i22, i23, i24, i25, i26, i27, f7, i28, str, fVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s0.a(e, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
