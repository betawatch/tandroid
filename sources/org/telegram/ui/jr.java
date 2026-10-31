package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jr extends s4.n {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ pr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public jr(pr prVar) {
        this.n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.C0 != i11;
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        pr prVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= prVar.W0 && i11 < prVar.X0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(prVar.F.get(i11 - prVar.W0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.T0 && i11 < prVar.U0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(prVar.G.get(i11 - prVar.T0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < prVar.D0 || i11 >= prVar.E0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(prVar.E.get(i11 - prVar.D0));
    }

    @Override // s4.n
    public final int d() {
        return this.n.c1;
    }

    @Override // s4.n
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.n;
        g(1, prVar.u0, sparseIntArray);
        g(2, prVar.y0, sparseIntArray);
        g(3, prVar.z0, sparseIntArray);
        g(4, prVar.B0, sparseIntArray);
        g(5, prVar.C0, sparseIntArray);
        g(6, prVar.F0, sparseIntArray);
        g(7, prVar.G0, sparseIntArray);
        g(8, prVar.r0, sparseIntArray);
        g(9, prVar.s0, sparseIntArray);
        g(10, prVar.t0, sparseIntArray);
        g(11, prVar.a1, sparseIntArray);
        g(12, prVar.b1, sparseIntArray);
        g(13, prVar.R, sparseIntArray);
        g(14, prVar.S, sparseIntArray);
        g(15, prVar.T, sparseIntArray);
        g(16, prVar.d0, sparseIntArray);
        g(17, prVar.c0, sparseIntArray);
        g(18, prVar.e0, sparseIntArray);
        g(19, prVar.g0, sparseIntArray);
        g(20, prVar.l0, sparseIntArray);
        g(21, prVar.h0, sparseIntArray);
        g(22, prVar.i0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.j0, sparseIntArray);
        if (prVar.x) {
            i10 = 24;
            g(24, prVar.k0, sparseIntArray);
        }
        g(i10 + 1, prVar.f0, sparseIntArray);
        g(i10 + 2, prVar.A0, sparseIntArray);
        g(i10 + 3, prVar.S0, sparseIntArray);
        g(i10 + 4, prVar.V0, sparseIntArray);
        g(i10 + 5, prVar.Y0, sparseIntArray);
        g(i10 + 6, prVar.M0, sparseIntArray);
        g(i10 + 7, prVar.N0, sparseIntArray);
        g(i10 + 8, prVar.O0, sparseIntArray);
        g(i10 + 9, prVar.P0, sparseIntArray);
        g(i10 + 10, prVar.R0, sparseIntArray);
        g(i10 + 11, prVar.Q0, sparseIntArray);
        g(i10 + 12, prVar.Z0, sparseIntArray);
        g(i10 + 13, prVar.e1, sparseIntArray);
        g(i10 + 14, prVar.f1, sparseIntArray);
        g(i10 + 15, prVar.g1, sparseIntArray);
        g(i10 + 16, prVar.h1, sparseIntArray);
        g(i10 + 17, prVar.i1, sparseIntArray);
        g(i10 + 18, prVar.m0, sparseIntArray);
        g(i10 + 19, prVar.n0, sparseIntArray);
        g(i10 + 20, prVar.o0, sparseIntArray);
        g(i10 + 21, prVar.p0, sparseIntArray);
        g(i10 + 22, prVar.q0, sparseIntArray);
    }
}
