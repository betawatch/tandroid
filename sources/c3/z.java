package c3;

import b2.w0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class z {
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
    public final qi.e o;

    public z(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, qi.e eVar) {
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
        this.o = eVar;
    }

    public static z a(e2.x xVar, boolean z10, qi.e eVar) {
        boolean z11;
        com.google.android.gms.internal.cast.a j10;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                xVar.O(4);
            } else {
                xVar.O(21);
            }
            int A = xVar.A() & 3;
            int A2 = xVar.A();
            int i12 = xVar.b;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z11 = true;
                if (i14 >= A2) {
                    break;
                }
                xVar.O(1);
                int H = xVar.H();
                for (int i16 = 0; i16 < H; i16++) {
                    int H2 = xVar.H();
                    i15 += H2 + 4;
                    xVar.O(H2);
                }
                i14++;
            }
            xVar.N(i12);
            byte[] bArr = new byte[i15];
            qi.e eVar2 = eVar;
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
            while (i27 < A2) {
                int A3 = xVar.A() & 63;
                int H3 = xVar.H();
                int i29 = i13;
                qi.e eVar3 = eVar2;
                while (i29 < H3) {
                    boolean z12 = z11;
                    int H4 = xVar.H();
                    int i30 = A;
                    System.arraycopy(f2.q.a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(xVar.a, xVar.b, bArr, i31, H4);
                    if (A3 == 32 && i29 == 0) {
                        eVar3 = f2.q.l(i31, i31 + H4, bArr);
                    } else {
                        if (A3 == 33 && i29 == 0) {
                            f2.m k10 = f2.q.k(bArr, i31, i31 + H4, eVar3);
                            i17 = k10.a + 1;
                            i18 = k10.g;
                            int i32 = k10.h;
                            i20 = k10.c + 8;
                            i21 = k10.d + 8;
                            int i33 = k10.k;
                            i19 = i32;
                            int i34 = k10.l;
                            int i35 = k10.m;
                            float f10 = k10.i;
                            int i36 = k10.j;
                            f2.j jVar = k10.b;
                            if (jVar != null) {
                                i10 = i36;
                                str = e2.g.a(jVar.a, jVar.c, jVar.d, jVar.f, jVar.b, jVar.e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (A3 == 39 && i29 == 0 && (j10 = f2.q.j(i31, i31 + H4, bArr)) != null && eVar3 != null) {
                            i13 = 0;
                            i25 = j10.a == ((f2.i) ((e9.n0) eVar3.a).get(0)).b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i28 = i31 + H4;
                    xVar.O(H4);
                    i29++;
                    z11 = z12;
                    A = i30;
                    i11 = 4;
                }
                i27++;
                eVar2 = eVar3;
                i11 = 4;
            }
            return new z(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), A + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str, eVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw w0.a(e, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
