package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ tr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public mr(tr trVar) {
        this.n = trVar;
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
        tr trVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= trVar.X0 && i11 < trVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(trVar.G.get(i11 - trVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= trVar.U0 && i11 < trVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(trVar.H.get(i11 - trVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < trVar.E0 || i11 >= trVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(trVar.F.get(i11 - trVar.E0));
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
        tr trVar = this.n;
        g(1, trVar.v0, sparseIntArray);
        g(2, trVar.z0, sparseIntArray);
        g(3, trVar.A0, sparseIntArray);
        g(4, trVar.C0, sparseIntArray);
        g(5, trVar.D0, sparseIntArray);
        g(6, trVar.G0, sparseIntArray);
        g(7, trVar.H0, sparseIntArray);
        g(8, trVar.s0, sparseIntArray);
        g(9, trVar.t0, sparseIntArray);
        g(10, trVar.u0, sparseIntArray);
        g(11, trVar.b1, sparseIntArray);
        g(12, trVar.c1, sparseIntArray);
        g(13, trVar.S, sparseIntArray);
        g(14, trVar.T, sparseIntArray);
        g(15, trVar.U, sparseIntArray);
        g(16, trVar.e0, sparseIntArray);
        g(17, trVar.d0, sparseIntArray);
        g(18, trVar.f0, sparseIntArray);
        g(19, trVar.h0, sparseIntArray);
        g(20, trVar.m0, sparseIntArray);
        g(21, trVar.i0, sparseIntArray);
        g(22, trVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, trVar.k0, sparseIntArray);
        if (trVar.x) {
            i10 = 24;
            g(24, trVar.l0, sparseIntArray);
        }
        g(i10 + 1, trVar.g0, sparseIntArray);
        g(i10 + 2, trVar.B0, sparseIntArray);
        g(i10 + 3, trVar.T0, sparseIntArray);
        g(i10 + 4, trVar.W0, sparseIntArray);
        g(i10 + 5, trVar.Z0, sparseIntArray);
        g(i10 + 6, trVar.N0, sparseIntArray);
        g(i10 + 7, trVar.O0, sparseIntArray);
        g(i10 + 8, trVar.P0, sparseIntArray);
        g(i10 + 9, trVar.Q0, sparseIntArray);
        g(i10 + 10, trVar.S0, sparseIntArray);
        g(i10 + 11, trVar.R0, sparseIntArray);
        g(i10 + 12, trVar.a1, sparseIntArray);
        g(i10 + 13, trVar.f1, sparseIntArray);
        g(i10 + 14, trVar.g1, sparseIntArray);
        g(i10 + 15, trVar.h1, sparseIntArray);
        g(i10 + 16, trVar.i1, sparseIntArray);
        g(i10 + 17, trVar.j1, sparseIntArray);
        g(i10 + 18, trVar.n0, sparseIntArray);
        g(i10 + 19, trVar.o0, sparseIntArray);
        g(i10 + 20, trVar.p0, sparseIntArray);
        g(i10 + 21, trVar.q0, sparseIntArray);
        g(i10 + 22, trVar.r0, sparseIntArray);
    }
}
