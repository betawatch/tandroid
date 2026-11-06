package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class iq extends v4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ oq n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public iq(oq oqVar) {
        this.n = oqVar;
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
        oq oqVar = this.n;
        if (i7 >= i11 && i7 < this.j && i10 >= oqVar.W0 && i10 < oqVar.X0) {
            return ((TLObject) this.l.get(i7 - i11)).equals(oqVar.F.get(i10 - oqVar.W0));
        }
        int i12 = this.g;
        if (i7 >= i12 && i7 < this.h && i10 >= oqVar.T0 && i10 < oqVar.U0) {
            return ((TLObject) this.m.get(i7 - i12)).equals(oqVar.G.get(i10 - oqVar.T0));
        }
        int i13 = this.e;
        return (i7 < i13 || i7 >= this.f || i10 < oqVar.D0 || i10 >= oqVar.E0) ? this.c.get(i7) == this.d.get(i10) : ((TLObject) this.k.get(i7 - i13)).equals(oqVar.E.get(i10 - oqVar.D0));
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
        oq oqVar = this.n;
        g(1, oqVar.u0, sparseIntArray);
        g(2, oqVar.y0, sparseIntArray);
        g(3, oqVar.z0, sparseIntArray);
        g(4, oqVar.B0, sparseIntArray);
        g(5, oqVar.C0, sparseIntArray);
        g(6, oqVar.F0, sparseIntArray);
        g(7, oqVar.G0, sparseIntArray);
        g(8, oqVar.r0, sparseIntArray);
        g(9, oqVar.s0, sparseIntArray);
        g(10, oqVar.t0, sparseIntArray);
        g(11, oqVar.a1, sparseIntArray);
        g(12, oqVar.b1, sparseIntArray);
        g(13, oqVar.R, sparseIntArray);
        g(14, oqVar.S, sparseIntArray);
        g(15, oqVar.T, sparseIntArray);
        g(16, oqVar.d0, sparseIntArray);
        g(17, oqVar.c0, sparseIntArray);
        g(18, oqVar.e0, sparseIntArray);
        g(19, oqVar.g0, sparseIntArray);
        g(20, oqVar.l0, sparseIntArray);
        g(21, oqVar.h0, sparseIntArray);
        g(22, oqVar.i0, sparseIntArray);
        int i7 = 23;
        g(23, oqVar.j0, sparseIntArray);
        if (oqVar.x) {
            i7 = 24;
            g(24, oqVar.k0, sparseIntArray);
        }
        g(i7 + 1, oqVar.f0, sparseIntArray);
        g(i7 + 2, oqVar.A0, sparseIntArray);
        g(i7 + 3, oqVar.S0, sparseIntArray);
        g(i7 + 4, oqVar.V0, sparseIntArray);
        g(i7 + 5, oqVar.Y0, sparseIntArray);
        g(i7 + 6, oqVar.M0, sparseIntArray);
        g(i7 + 7, oqVar.N0, sparseIntArray);
        g(i7 + 8, oqVar.O0, sparseIntArray);
        g(i7 + 9, oqVar.P0, sparseIntArray);
        g(i7 + 10, oqVar.R0, sparseIntArray);
        g(i7 + 11, oqVar.Q0, sparseIntArray);
        g(i7 + 12, oqVar.Z0, sparseIntArray);
        g(i7 + 13, oqVar.e1, sparseIntArray);
        g(i7 + 14, oqVar.f1, sparseIntArray);
        g(i7 + 15, oqVar.g1, sparseIntArray);
        g(i7 + 16, oqVar.h1, sparseIntArray);
        g(i7 + 17, oqVar.i1, sparseIntArray);
        g(i7 + 18, oqVar.m0, sparseIntArray);
        g(i7 + 19, oqVar.n0, sparseIntArray);
        g(i7 + 20, oqVar.o0, sparseIntArray);
        g(i7 + 21, oqVar.p0, sparseIntArray);
        g(i7 + 22, oqVar.q0, sparseIntArray);
    }
}
