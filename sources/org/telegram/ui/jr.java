package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jr extends f2.q {
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

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.A0 != i11;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        pr prVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= prVar.U0 && i11 < prVar.V0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(prVar.D.get(i11 - prVar.U0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.R0 && i11 < prVar.S0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(prVar.E.get(i11 - prVar.R0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < prVar.B0 || i11 >= prVar.C0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(prVar.C.get(i11 - prVar.B0));
    }

    @Override // f2.q
    public final int d() {
        return this.n.a1;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.n;
        g(1, prVar.s0, sparseIntArray);
        g(2, prVar.w0, sparseIntArray);
        g(3, prVar.x0, sparseIntArray);
        g(4, prVar.z0, sparseIntArray);
        g(5, prVar.A0, sparseIntArray);
        g(6, prVar.D0, sparseIntArray);
        g(7, prVar.E0, sparseIntArray);
        g(8, prVar.p0, sparseIntArray);
        g(9, prVar.q0, sparseIntArray);
        g(10, prVar.r0, sparseIntArray);
        g(11, prVar.Y0, sparseIntArray);
        g(12, prVar.Z0, sparseIntArray);
        g(13, prVar.P, sparseIntArray);
        g(14, prVar.Q, sparseIntArray);
        g(15, prVar.R, sparseIntArray);
        g(16, prVar.b0, sparseIntArray);
        g(17, prVar.a0, sparseIntArray);
        g(18, prVar.c0, sparseIntArray);
        g(19, prVar.e0, sparseIntArray);
        g(20, prVar.j0, sparseIntArray);
        g(21, prVar.f0, sparseIntArray);
        g(22, prVar.g0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.h0, sparseIntArray);
        if (prVar.x) {
            i10 = 24;
            g(24, prVar.i0, sparseIntArray);
        }
        g(i10 + 1, prVar.d0, sparseIntArray);
        g(i10 + 2, prVar.y0, sparseIntArray);
        g(i10 + 3, prVar.Q0, sparseIntArray);
        g(i10 + 4, prVar.T0, sparseIntArray);
        g(i10 + 5, prVar.W0, sparseIntArray);
        g(i10 + 6, prVar.K0, sparseIntArray);
        g(i10 + 7, prVar.L0, sparseIntArray);
        g(i10 + 8, prVar.M0, sparseIntArray);
        g(i10 + 9, prVar.N0, sparseIntArray);
        g(i10 + 10, prVar.P0, sparseIntArray);
        g(i10 + 11, prVar.O0, sparseIntArray);
        g(i10 + 12, prVar.X0, sparseIntArray);
        g(i10 + 13, prVar.c1, sparseIntArray);
        g(i10 + 14, prVar.d1, sparseIntArray);
        g(i10 + 15, prVar.e1, sparseIntArray);
        g(i10 + 16, prVar.f1, sparseIntArray);
        g(i10 + 17, prVar.g1, sparseIntArray);
        g(i10 + 18, prVar.k0, sparseIntArray);
        g(i10 + 19, prVar.l0, sparseIntArray);
        g(i10 + 20, prVar.m0, sparseIntArray);
        g(i10 + 21, prVar.n0, sparseIntArray);
        g(i10 + 22, prVar.o0, sparseIntArray);
    }
}
