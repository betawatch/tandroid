package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public final oi.f o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, oi.f fVar) {
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

    public static x a(e2.v vVar, boolean z10, oi.f fVar) {
        boolean z11;
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
            int i15 = 0;
            while (true) {
                z11 = true;
                if (i14 >= x11) {
                    break;
                }
                vVar.K(1);
                int D = vVar.D();
                for (int i16 = 0; i16 < D; i16++) {
                    int D2 = vVar.D();
                    i15 += D2 + 4;
                    vVar.K(D2);
                }
                i14++;
            }
            vVar.J(i12);
            byte[] bArr = new byte[i15];
            oi.f fVar2 = fVar;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            float f7 = 1.0f;
            String str = null;
            int i27 = 0;
            int i28 = 0;
            while (i27 < x11) {
                int x12 = vVar.x() & 63;
                int D3 = vVar.D();
                int i29 = i13;
                oi.f fVar3 = fVar2;
                while (i29 < D3) {
                    boolean z12 = z11;
                    int D4 = vVar.D();
                    int i30 = x10;
                    System.arraycopy(f2.p.a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(vVar.a, vVar.b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.p.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.l h = f2.p.h(bArr, i31, i31 + D4, fVar3);
                            i17 = h.a + 1;
                            i18 = h.g;
                            int i32 = h.h;
                            i20 = h.c + 8;
                            i21 = h.d + 8;
                            int i33 = h.k;
                            i19 = i32;
                            int i34 = h.l;
                            int i35 = h.m;
                            float f10 = h.i;
                            int i36 = h.j;
                            f2.i iVar = h.b;
                            if (iVar != null) {
                                i10 = i36;
                                str = e2.e.a(iVar.a, iVar.c, iVar.d, iVar.f, iVar.b, iVar.e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (x12 == 39 && i29 == 0 && (g10 = f2.p.g(i31, i31 + D4, bArr)) != null && fVar3 != null) {
                            i13 = 0;
                            i25 = g10.a == ((f2.h) ((e9.i0) fVar3.a).get(0)).b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i28 = i31 + D4;
                    vVar.K(D4);
                    i29++;
                    z11 = z12;
                    x10 = i30;
                    i11 = 4;
                }
                i27++;
                fVar2 = fVar3;
                i11 = 4;
            }
            return new x(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), x10 + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str, fVar2);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw s0.a(e7, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
