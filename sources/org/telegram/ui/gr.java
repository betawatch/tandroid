package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gr extends s4.p {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ mr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public gr(mr mrVar) {
        this.n = mrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.C0 != i11;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        mr mrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= mrVar.W0 && i11 < mrVar.X0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(mrVar.F.get(i11 - mrVar.W0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= mrVar.T0 && i11 < mrVar.U0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(mrVar.G.get(i11 - mrVar.T0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < mrVar.D0 || i11 >= mrVar.E0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(mrVar.E.get(i11 - mrVar.D0));
    }

    @Override // s4.p
    public final int d() {
        return this.n.c1;
    }

    @Override // s4.p
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        mr mrVar = this.n;
        g(1, mrVar.u0, sparseIntArray);
        g(2, mrVar.y0, sparseIntArray);
        g(3, mrVar.z0, sparseIntArray);
        g(4, mrVar.B0, sparseIntArray);
        g(5, mrVar.C0, sparseIntArray);
        g(6, mrVar.F0, sparseIntArray);
        g(7, mrVar.G0, sparseIntArray);
        g(8, mrVar.r0, sparseIntArray);
        g(9, mrVar.s0, sparseIntArray);
        g(10, mrVar.t0, sparseIntArray);
        g(11, mrVar.a1, sparseIntArray);
        g(12, mrVar.b1, sparseIntArray);
        g(13, mrVar.R, sparseIntArray);
        g(14, mrVar.S, sparseIntArray);
        g(15, mrVar.T, sparseIntArray);
        g(16, mrVar.d0, sparseIntArray);
        g(17, mrVar.c0, sparseIntArray);
        g(18, mrVar.e0, sparseIntArray);
        g(19, mrVar.g0, sparseIntArray);
        g(20, mrVar.l0, sparseIntArray);
        g(21, mrVar.h0, sparseIntArray);
        g(22, mrVar.i0, sparseIntArray);
        int i10 = 23;
        g(23, mrVar.j0, sparseIntArray);
        if (mrVar.w) {
            i10 = 24;
            g(24, mrVar.k0, sparseIntArray);
        }
        g(i10 + 1, mrVar.f0, sparseIntArray);
        g(i10 + 2, mrVar.A0, sparseIntArray);
        g(i10 + 3, mrVar.S0, sparseIntArray);
        g(i10 + 4, mrVar.V0, sparseIntArray);
        g(i10 + 5, mrVar.Y0, sparseIntArray);
        g(i10 + 6, mrVar.M0, sparseIntArray);
        g(i10 + 7, mrVar.N0, sparseIntArray);
        g(i10 + 8, mrVar.O0, sparseIntArray);
        g(i10 + 9, mrVar.P0, sparseIntArray);
        g(i10 + 10, mrVar.R0, sparseIntArray);
        g(i10 + 11, mrVar.Q0, sparseIntArray);
        g(i10 + 12, mrVar.Z0, sparseIntArray);
        g(i10 + 13, mrVar.e1, sparseIntArray);
        g(i10 + 14, mrVar.f1, sparseIntArray);
        g(i10 + 15, mrVar.g1, sparseIntArray);
        g(i10 + 16, mrVar.h1, sparseIntArray);
        g(i10 + 17, mrVar.i1, sparseIntArray);
        g(i10 + 18, mrVar.m0, sparseIntArray);
        g(i10 + 19, mrVar.n0, sparseIntArray);
        g(i10 + 20, mrVar.o0, sparseIntArray);
        g(i10 + 21, mrVar.p0, sparseIntArray);
        g(i10 + 22, mrVar.q0, sparseIntArray);
    }
}
