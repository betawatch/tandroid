package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lq extends v4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ rq n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public lq(rq rqVar) {
        this.n = rqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return b(i7, i10) && this.n.C0 != i10;
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        int i11 = this.i;
        rq rqVar = this.n;
        if (i7 >= i11 && i7 < this.j && i10 >= rqVar.W0 && i10 < rqVar.X0) {
            return ((TLObject) this.l.get(i7 - i11)).equals(rqVar.F.get(i10 - rqVar.W0));
        }
        int i12 = this.g;
        if (i7 >= i12 && i7 < this.h && i10 >= rqVar.T0 && i10 < rqVar.U0) {
            return ((TLObject) this.m.get(i7 - i12)).equals(rqVar.G.get(i10 - rqVar.T0));
        }
        int i13 = this.e;
        return (i7 < i13 || i7 >= this.f || i10 < rqVar.D0 || i10 >= rqVar.E0) ? this.c.get(i7) == this.d.get(i10) : ((TLObject) this.k.get(i7 - i13)).equals(rqVar.E.get(i10 - rqVar.D0));
    }

    @Override // v4.o
    public final int d() {
        return this.n.c1;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rq rqVar = this.n;
        g(1, rqVar.u0, sparseIntArray);
        g(2, rqVar.y0, sparseIntArray);
        g(3, rqVar.z0, sparseIntArray);
        g(4, rqVar.B0, sparseIntArray);
        g(5, rqVar.C0, sparseIntArray);
        g(6, rqVar.F0, sparseIntArray);
        g(7, rqVar.G0, sparseIntArray);
        g(8, rqVar.r0, sparseIntArray);
        g(9, rqVar.s0, sparseIntArray);
        g(10, rqVar.t0, sparseIntArray);
        g(11, rqVar.a1, sparseIntArray);
        g(12, rqVar.b1, sparseIntArray);
        g(13, rqVar.R, sparseIntArray);
        g(14, rqVar.S, sparseIntArray);
        g(15, rqVar.T, sparseIntArray);
        g(16, rqVar.d0, sparseIntArray);
        g(17, rqVar.c0, sparseIntArray);
        g(18, rqVar.e0, sparseIntArray);
        g(19, rqVar.g0, sparseIntArray);
        g(20, rqVar.l0, sparseIntArray);
        g(21, rqVar.h0, sparseIntArray);
        g(22, rqVar.i0, sparseIntArray);
        int i7 = 23;
        g(23, rqVar.j0, sparseIntArray);
        if (rqVar.x) {
            i7 = 24;
            g(24, rqVar.k0, sparseIntArray);
        }
        g(i7 + 1, rqVar.f0, sparseIntArray);
        g(i7 + 2, rqVar.A0, sparseIntArray);
        g(i7 + 3, rqVar.S0, sparseIntArray);
        g(i7 + 4, rqVar.V0, sparseIntArray);
        g(i7 + 5, rqVar.Y0, sparseIntArray);
        g(i7 + 6, rqVar.M0, sparseIntArray);
        g(i7 + 7, rqVar.N0, sparseIntArray);
        g(i7 + 8, rqVar.O0, sparseIntArray);
        g(i7 + 9, rqVar.P0, sparseIntArray);
        g(i7 + 10, rqVar.R0, sparseIntArray);
        g(i7 + 11, rqVar.Q0, sparseIntArray);
        g(i7 + 12, rqVar.Z0, sparseIntArray);
        g(i7 + 13, rqVar.e1, sparseIntArray);
        g(i7 + 14, rqVar.f1, sparseIntArray);
        g(i7 + 15, rqVar.g1, sparseIntArray);
        g(i7 + 16, rqVar.h1, sparseIntArray);
        g(i7 + 17, rqVar.i1, sparseIntArray);
        g(i7 + 18, rqVar.m0, sparseIntArray);
        g(i7 + 19, rqVar.n0, sparseIntArray);
        g(i7 + 20, rqVar.o0, sparseIntArray);
        g(i7 + 21, rqVar.p0, sparseIntArray);
        g(i7 + 22, rqVar.q0, sparseIntArray);
    }
}
