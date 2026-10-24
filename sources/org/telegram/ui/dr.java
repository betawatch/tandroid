package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class dr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ jr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public dr(jr jrVar) {
        this.n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.D0 != i11;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        jr jrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= jrVar.X0 && i11 < jrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(jrVar.G.get(i11 - jrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.U0 && i11 < jrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(jrVar.H.get(i11 - jrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < jrVar.E0 || i11 >= jrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(jrVar.F.get(i11 - jrVar.E0));
    }

    @Override // s4.o
    public final int d() {
        return this.n.d1;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.n;
        g(1, jrVar.v0, sparseIntArray);
        g(2, jrVar.z0, sparseIntArray);
        g(3, jrVar.A0, sparseIntArray);
        g(4, jrVar.C0, sparseIntArray);
        g(5, jrVar.D0, sparseIntArray);
        g(6, jrVar.G0, sparseIntArray);
        g(7, jrVar.H0, sparseIntArray);
        g(8, jrVar.s0, sparseIntArray);
        g(9, jrVar.t0, sparseIntArray);
        g(10, jrVar.u0, sparseIntArray);
        g(11, jrVar.b1, sparseIntArray);
        g(12, jrVar.c1, sparseIntArray);
        g(13, jrVar.S, sparseIntArray);
        g(14, jrVar.T, sparseIntArray);
        g(15, jrVar.U, sparseIntArray);
        g(16, jrVar.e0, sparseIntArray);
        g(17, jrVar.d0, sparseIntArray);
        g(18, jrVar.f0, sparseIntArray);
        g(19, jrVar.h0, sparseIntArray);
        g(20, jrVar.m0, sparseIntArray);
        g(21, jrVar.i0, sparseIntArray);
        g(22, jrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.k0, sparseIntArray);
        if (jrVar.x) {
            i10 = 24;
            g(24, jrVar.l0, sparseIntArray);
        }
        g(i10 + 1, jrVar.g0, sparseIntArray);
        g(i10 + 2, jrVar.B0, sparseIntArray);
        g(i10 + 3, jrVar.T0, sparseIntArray);
        g(i10 + 4, jrVar.W0, sparseIntArray);
        g(i10 + 5, jrVar.Z0, sparseIntArray);
        g(i10 + 6, jrVar.N0, sparseIntArray);
        g(i10 + 7, jrVar.O0, sparseIntArray);
        g(i10 + 8, jrVar.P0, sparseIntArray);
        g(i10 + 9, jrVar.Q0, sparseIntArray);
        g(i10 + 10, jrVar.S0, sparseIntArray);
        g(i10 + 11, jrVar.R0, sparseIntArray);
        g(i10 + 12, jrVar.a1, sparseIntArray);
        g(i10 + 13, jrVar.f1, sparseIntArray);
        g(i10 + 14, jrVar.g1, sparseIntArray);
        g(i10 + 15, jrVar.h1, sparseIntArray);
        g(i10 + 16, jrVar.i1, sparseIntArray);
        g(i10 + 17, jrVar.j1, sparseIntArray);
        g(i10 + 18, jrVar.n0, sparseIntArray);
        g(i10 + 19, jrVar.o0, sparseIntArray);
        g(i10 + 20, jrVar.p0, sparseIntArray);
        g(i10 + 21, jrVar.q0, sparseIntArray);
        g(i10 + 22, jrVar.r0, sparseIntArray);
    }
}
