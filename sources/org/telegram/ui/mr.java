package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class mr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ sr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public mr(sr srVar) {
        this.n = srVar;
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
        sr srVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= srVar.X0 && i11 < srVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(srVar.G.get(i11 - srVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= srVar.U0 && i11 < srVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(srVar.H.get(i11 - srVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < srVar.E0 || i11 >= srVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(srVar.F.get(i11 - srVar.E0));
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
        sr srVar = this.n;
        g(1, srVar.v0, sparseIntArray);
        g(2, srVar.z0, sparseIntArray);
        g(3, srVar.A0, sparseIntArray);
        g(4, srVar.C0, sparseIntArray);
        g(5, srVar.D0, sparseIntArray);
        g(6, srVar.G0, sparseIntArray);
        g(7, srVar.H0, sparseIntArray);
        g(8, srVar.s0, sparseIntArray);
        g(9, srVar.t0, sparseIntArray);
        g(10, srVar.u0, sparseIntArray);
        g(11, srVar.b1, sparseIntArray);
        g(12, srVar.c1, sparseIntArray);
        g(13, srVar.S, sparseIntArray);
        g(14, srVar.T, sparseIntArray);
        g(15, srVar.U, sparseIntArray);
        g(16, srVar.e0, sparseIntArray);
        g(17, srVar.d0, sparseIntArray);
        g(18, srVar.f0, sparseIntArray);
        g(19, srVar.h0, sparseIntArray);
        g(20, srVar.m0, sparseIntArray);
        g(21, srVar.i0, sparseIntArray);
        g(22, srVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, srVar.k0, sparseIntArray);
        if (srVar.x) {
            i10 = 24;
            g(24, srVar.l0, sparseIntArray);
        }
        g(i10 + 1, srVar.g0, sparseIntArray);
        g(i10 + 2, srVar.B0, sparseIntArray);
        g(i10 + 3, srVar.T0, sparseIntArray);
        g(i10 + 4, srVar.W0, sparseIntArray);
        g(i10 + 5, srVar.Z0, sparseIntArray);
        g(i10 + 6, srVar.N0, sparseIntArray);
        g(i10 + 7, srVar.O0, sparseIntArray);
        g(i10 + 8, srVar.P0, sparseIntArray);
        g(i10 + 9, srVar.Q0, sparseIntArray);
        g(i10 + 10, srVar.S0, sparseIntArray);
        g(i10 + 11, srVar.R0, sparseIntArray);
        g(i10 + 12, srVar.a1, sparseIntArray);
        g(i10 + 13, srVar.f1, sparseIntArray);
        g(i10 + 14, srVar.g1, sparseIntArray);
        g(i10 + 15, srVar.h1, sparseIntArray);
        g(i10 + 16, srVar.i1, sparseIntArray);
        g(i10 + 17, srVar.j1, sparseIntArray);
        g(i10 + 18, srVar.n0, sparseIntArray);
        g(i10 + 19, srVar.o0, sparseIntArray);
        g(i10 + 20, srVar.p0, sparseIntArray);
        g(i10 + 21, srVar.q0, sparseIntArray);
        g(i10 + 22, srVar.r0, sparseIntArray);
    }
}
