package e3;

import d2.v0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final za.p o;

    public x(List list, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, za.p pVar) {
        this.a = list;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = i14;
        this.h = i15;
        this.i = i16;
        this.j = i17;
        this.k = i18;
        this.l = f10;
        this.m = i19;
        this.n = str;
        this.o = pVar;
    }

    public static x a(g2.y yVar, boolean z10, za.p pVar) {
        boolean z11;
        a7.l j10;
        int i3;
        int i10 = 4;
        try {
            if (z10) {
                yVar.O(4);
            } else {
                yVar.O(21);
            }
            int A = yVar.A() & 3;
            int A2 = yVar.A();
            int i11 = yVar.b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= A2) {
                    break;
                }
                yVar.O(1);
                int H = yVar.H();
                for (int i15 = 0; i15 < H; i15++) {
                    int H2 = yVar.H();
                    i14 += H2 + 4;
                    yVar.O(H2);
                }
                i13++;
            }
            yVar.N(i11);
            byte[] bArr = new byte[i14];
            za.p pVar2 = pVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String str = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < A2) {
                int A3 = yVar.A() & 63;
                int H3 = yVar.H();
                int i28 = i12;
                za.p pVar3 = pVar2;
                while (i28 < H3) {
                    boolean z12 = z11;
                    int H4 = yVar.H();
                    int i29 = A;
                    System.arraycopy(h2.o.a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(yVar.a, yVar.b, bArr, i30, H4);
                    if (A3 == 32 && i28 == 0) {
                        pVar3 = h2.o.l(i30, i30 + H4, bArr);
                    } else {
                        if (A3 == 33 && i28 == 0) {
                            h2.k k10 = h2.o.k(bArr, i30, i30 + H4, pVar3);
                            i16 = k10.a + 1;
                            i17 = k10.g;
                            int i31 = k10.h;
                            i19 = k10.c + 8;
                            i20 = k10.d + 8;
                            int i32 = k10.k;
                            i18 = i31;
                            int i33 = k10.l;
                            int i34 = k10.m;
                            float f11 = k10.i;
                            int i35 = k10.j;
                            h2.h hVar = k10.b;
                            if (hVar != null) {
                                i3 = i35;
                                str = g2.h.a(hVar.a, hVar.c, hVar.d, hVar.f, hVar.b, hVar.e);
                            } else {
                                i3 = i35;
                            }
                            i25 = i3;
                            f10 = f11;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (A3 == 39 && i28 == 0 && (j10 = h2.o.j(i30, i30 + H4, bArr)) != null && pVar3 != null) {
                            i12 = 0;
                            i24 = j10.a == ((h2.g) ((g9.i0) pVar3.a).get(0)).b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i27 = i30 + H4;
                    yVar.O(H4);
                    i28++;
                    z11 = z12;
                    A = i29;
                    i10 = 4;
                }
                i26++;
                pVar2 = pVar3;
                i10 = 4;
            }
            return new x(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), A + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, str, pVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw v0.a(e10, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
