package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ vr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public pr(vr vrVar) {
        this.n = vrVar;
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
        vr vrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= vrVar.X0 && i11 < vrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(vrVar.G.get(i11 - vrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= vrVar.U0 && i11 < vrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(vrVar.H.get(i11 - vrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < vrVar.E0 || i11 >= vrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(vrVar.F.get(i11 - vrVar.E0));
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
        vr vrVar = this.n;
        g(1, vrVar.v0, sparseIntArray);
        g(2, vrVar.z0, sparseIntArray);
        g(3, vrVar.A0, sparseIntArray);
        g(4, vrVar.C0, sparseIntArray);
        g(5, vrVar.D0, sparseIntArray);
        g(6, vrVar.G0, sparseIntArray);
        g(7, vrVar.H0, sparseIntArray);
        g(8, vrVar.s0, sparseIntArray);
        g(9, vrVar.t0, sparseIntArray);
        g(10, vrVar.u0, sparseIntArray);
        g(11, vrVar.b1, sparseIntArray);
        g(12, vrVar.c1, sparseIntArray);
        g(13, vrVar.S, sparseIntArray);
        g(14, vrVar.T, sparseIntArray);
        g(15, vrVar.U, sparseIntArray);
        g(16, vrVar.e0, sparseIntArray);
        g(17, vrVar.d0, sparseIntArray);
        g(18, vrVar.f0, sparseIntArray);
        g(19, vrVar.h0, sparseIntArray);
        g(20, vrVar.m0, sparseIntArray);
        g(21, vrVar.i0, sparseIntArray);
        g(22, vrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, vrVar.k0, sparseIntArray);
        if (vrVar.x) {
            i10 = 24;
            g(24, vrVar.l0, sparseIntArray);
        }
        g(i10 + 1, vrVar.g0, sparseIntArray);
        g(i10 + 2, vrVar.B0, sparseIntArray);
        g(i10 + 3, vrVar.T0, sparseIntArray);
        g(i10 + 4, vrVar.W0, sparseIntArray);
        g(i10 + 5, vrVar.Z0, sparseIntArray);
        g(i10 + 6, vrVar.N0, sparseIntArray);
        g(i10 + 7, vrVar.O0, sparseIntArray);
        g(i10 + 8, vrVar.P0, sparseIntArray);
        g(i10 + 9, vrVar.Q0, sparseIntArray);
        g(i10 + 10, vrVar.S0, sparseIntArray);
        g(i10 + 11, vrVar.R0, sparseIntArray);
        g(i10 + 12, vrVar.a1, sparseIntArray);
        g(i10 + 13, vrVar.f1, sparseIntArray);
        g(i10 + 14, vrVar.g1, sparseIntArray);
        g(i10 + 15, vrVar.h1, sparseIntArray);
        g(i10 + 16, vrVar.i1, sparseIntArray);
        g(i10 + 17, vrVar.j1, sparseIntArray);
        g(i10 + 18, vrVar.n0, sparseIntArray);
        g(i10 + 19, vrVar.o0, sparseIntArray);
        g(i10 + 20, vrVar.p0, sparseIntArray);
        g(i10 + 21, vrVar.q0, sparseIntArray);
        g(i10 + 22, vrVar.r0, sparseIntArray);
    }
}
