package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ rr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public lr(rr rrVar) {
        this.n = rrVar;
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
        rr rrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= rrVar.X0 && i11 < rrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(rrVar.G.get(i11 - rrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= rrVar.U0 && i11 < rrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(rrVar.H.get(i11 - rrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < rrVar.E0 || i11 >= rrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(rrVar.F.get(i11 - rrVar.E0));
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
        rr rrVar = this.n;
        g(1, rrVar.v0, sparseIntArray);
        g(2, rrVar.z0, sparseIntArray);
        g(3, rrVar.A0, sparseIntArray);
        g(4, rrVar.C0, sparseIntArray);
        g(5, rrVar.D0, sparseIntArray);
        g(6, rrVar.G0, sparseIntArray);
        g(7, rrVar.H0, sparseIntArray);
        g(8, rrVar.s0, sparseIntArray);
        g(9, rrVar.t0, sparseIntArray);
        g(10, rrVar.u0, sparseIntArray);
        g(11, rrVar.b1, sparseIntArray);
        g(12, rrVar.c1, sparseIntArray);
        g(13, rrVar.S, sparseIntArray);
        g(14, rrVar.T, sparseIntArray);
        g(15, rrVar.U, sparseIntArray);
        g(16, rrVar.e0, sparseIntArray);
        g(17, rrVar.d0, sparseIntArray);
        g(18, rrVar.f0, sparseIntArray);
        g(19, rrVar.h0, sparseIntArray);
        g(20, rrVar.m0, sparseIntArray);
        g(21, rrVar.i0, sparseIntArray);
        g(22, rrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, rrVar.k0, sparseIntArray);
        if (rrVar.x) {
            i10 = 24;
            g(24, rrVar.l0, sparseIntArray);
        }
        g(i10 + 1, rrVar.g0, sparseIntArray);
        g(i10 + 2, rrVar.B0, sparseIntArray);
        g(i10 + 3, rrVar.T0, sparseIntArray);
        g(i10 + 4, rrVar.W0, sparseIntArray);
        g(i10 + 5, rrVar.Z0, sparseIntArray);
        g(i10 + 6, rrVar.N0, sparseIntArray);
        g(i10 + 7, rrVar.O0, sparseIntArray);
        g(i10 + 8, rrVar.P0, sparseIntArray);
        g(i10 + 9, rrVar.Q0, sparseIntArray);
        g(i10 + 10, rrVar.S0, sparseIntArray);
        g(i10 + 11, rrVar.R0, sparseIntArray);
        g(i10 + 12, rrVar.a1, sparseIntArray);
        g(i10 + 13, rrVar.f1, sparseIntArray);
        g(i10 + 14, rrVar.g1, sparseIntArray);
        g(i10 + 15, rrVar.h1, sparseIntArray);
        g(i10 + 16, rrVar.i1, sparseIntArray);
        g(i10 + 17, rrVar.j1, sparseIntArray);
        g(i10 + 18, rrVar.n0, sparseIntArray);
        g(i10 + 19, rrVar.o0, sparseIntArray);
        g(i10 + 20, rrVar.p0, sparseIntArray);
        g(i10 + 21, rrVar.q0, sparseIntArray);
        g(i10 + 22, rrVar.r0, sparseIntArray);
    }
}
