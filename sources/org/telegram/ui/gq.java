package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gq extends u4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ nq n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public gq(nq nqVar) {
        this.n = nqVar;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return b(i3, i10) && this.n.D0 != i10;
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        int i11 = this.i;
        nq nqVar = this.n;
        if (i3 >= i11 && i3 < this.j && i10 >= nqVar.X0 && i10 < nqVar.Y0) {
            return ((TLObject) this.l.get(i3 - i11)).equals(nqVar.G.get(i10 - nqVar.X0));
        }
        int i12 = this.g;
        if (i3 >= i12 && i3 < this.h && i10 >= nqVar.U0 && i10 < nqVar.V0) {
            return ((TLObject) this.m.get(i3 - i12)).equals(nqVar.H.get(i10 - nqVar.U0));
        }
        int i13 = this.e;
        return (i3 < i13 || i3 >= this.f || i10 < nqVar.E0 || i10 >= nqVar.F0) ? this.c.get(i3) == this.d.get(i10) : ((TLObject) this.k.get(i3 - i13)).equals(nqVar.F.get(i10 - nqVar.E0));
    }

    @Override // u4.o
    public final int d() {
        return this.n.d1;
    }

    @Override // u4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        nq nqVar = this.n;
        g(1, nqVar.v0, sparseIntArray);
        g(2, nqVar.z0, sparseIntArray);
        g(3, nqVar.A0, sparseIntArray);
        g(4, nqVar.C0, sparseIntArray);
        g(5, nqVar.D0, sparseIntArray);
        g(6, nqVar.G0, sparseIntArray);
        g(7, nqVar.H0, sparseIntArray);
        g(8, nqVar.s0, sparseIntArray);
        g(9, nqVar.t0, sparseIntArray);
        g(10, nqVar.u0, sparseIntArray);
        g(11, nqVar.b1, sparseIntArray);
        g(12, nqVar.c1, sparseIntArray);
        g(13, nqVar.S, sparseIntArray);
        g(14, nqVar.T, sparseIntArray);
        g(15, nqVar.U, sparseIntArray);
        g(16, nqVar.e0, sparseIntArray);
        g(17, nqVar.d0, sparseIntArray);
        g(18, nqVar.f0, sparseIntArray);
        g(19, nqVar.h0, sparseIntArray);
        g(20, nqVar.m0, sparseIntArray);
        g(21, nqVar.i0, sparseIntArray);
        g(22, nqVar.j0, sparseIntArray);
        int i3 = 23;
        g(23, nqVar.k0, sparseIntArray);
        if (nqVar.x) {
            i3 = 24;
            g(24, nqVar.l0, sparseIntArray);
        }
        g(i3 + 1, nqVar.g0, sparseIntArray);
        g(i3 + 2, nqVar.B0, sparseIntArray);
        g(i3 + 3, nqVar.T0, sparseIntArray);
        g(i3 + 4, nqVar.W0, sparseIntArray);
        g(i3 + 5, nqVar.Z0, sparseIntArray);
        g(i3 + 6, nqVar.N0, sparseIntArray);
        g(i3 + 7, nqVar.O0, sparseIntArray);
        g(i3 + 8, nqVar.P0, sparseIntArray);
        g(i3 + 9, nqVar.Q0, sparseIntArray);
        g(i3 + 10, nqVar.S0, sparseIntArray);
        g(i3 + 11, nqVar.R0, sparseIntArray);
        g(i3 + 12, nqVar.a1, sparseIntArray);
        g(i3 + 13, nqVar.f1, sparseIntArray);
        g(i3 + 14, nqVar.g1, sparseIntArray);
        g(i3 + 15, nqVar.h1, sparseIntArray);
        g(i3 + 16, nqVar.i1, sparseIntArray);
        g(i3 + 17, nqVar.j1, sparseIntArray);
        g(i3 + 18, nqVar.n0, sparseIntArray);
        g(i3 + 19, nqVar.o0, sparseIntArray);
        g(i3 + 20, nqVar.p0, sparseIntArray);
        g(i3 + 21, nqVar.q0, sparseIntArray);
        g(i3 + 22, nqVar.r0, sparseIntArray);
    }
}
