package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class er extends s4.p {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ kr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public er(kr krVar) {
        this.n = krVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.C0 != i11;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        kr krVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= krVar.W0 && i11 < krVar.X0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(krVar.F.get(i11 - krVar.W0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= krVar.T0 && i11 < krVar.U0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(krVar.G.get(i11 - krVar.T0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < krVar.D0 || i11 >= krVar.E0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(krVar.E.get(i11 - krVar.D0));
    }

    @Override // s4.p
    public final int d() {
        return this.n.c1;
    }

    @Override // s4.p
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kr krVar = this.n;
        g(1, krVar.u0, sparseIntArray);
        g(2, krVar.y0, sparseIntArray);
        g(3, krVar.z0, sparseIntArray);
        g(4, krVar.B0, sparseIntArray);
        g(5, krVar.C0, sparseIntArray);
        g(6, krVar.F0, sparseIntArray);
        g(7, krVar.G0, sparseIntArray);
        g(8, krVar.r0, sparseIntArray);
        g(9, krVar.s0, sparseIntArray);
        g(10, krVar.t0, sparseIntArray);
        g(11, krVar.a1, sparseIntArray);
        g(12, krVar.b1, sparseIntArray);
        g(13, krVar.R, sparseIntArray);
        g(14, krVar.S, sparseIntArray);
        g(15, krVar.T, sparseIntArray);
        g(16, krVar.d0, sparseIntArray);
        g(17, krVar.c0, sparseIntArray);
        g(18, krVar.e0, sparseIntArray);
        g(19, krVar.g0, sparseIntArray);
        g(20, krVar.l0, sparseIntArray);
        g(21, krVar.h0, sparseIntArray);
        g(22, krVar.i0, sparseIntArray);
        int i10 = 23;
        g(23, krVar.j0, sparseIntArray);
        if (krVar.w) {
            i10 = 24;
            g(24, krVar.k0, sparseIntArray);
        }
        g(i10 + 1, krVar.f0, sparseIntArray);
        g(i10 + 2, krVar.A0, sparseIntArray);
        g(i10 + 3, krVar.S0, sparseIntArray);
        g(i10 + 4, krVar.V0, sparseIntArray);
        g(i10 + 5, krVar.Y0, sparseIntArray);
        g(i10 + 6, krVar.M0, sparseIntArray);
        g(i10 + 7, krVar.N0, sparseIntArray);
        g(i10 + 8, krVar.O0, sparseIntArray);
        g(i10 + 9, krVar.P0, sparseIntArray);
        g(i10 + 10, krVar.R0, sparseIntArray);
        g(i10 + 11, krVar.Q0, sparseIntArray);
        g(i10 + 12, krVar.Z0, sparseIntArray);
        g(i10 + 13, krVar.e1, sparseIntArray);
        g(i10 + 14, krVar.f1, sparseIntArray);
        g(i10 + 15, krVar.g1, sparseIntArray);
        g(i10 + 16, krVar.h1, sparseIntArray);
        g(i10 + 17, krVar.i1, sparseIntArray);
        g(i10 + 18, krVar.m0, sparseIntArray);
        g(i10 + 19, krVar.n0, sparseIntArray);
        g(i10 + 20, krVar.o0, sparseIntArray);
        g(i10 + 21, krVar.p0, sparseIntArray);
        g(i10 + 22, krVar.q0, sparseIntArray);
    }
}
