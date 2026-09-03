package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lr extends f2.q {
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

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.A0 != i11;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        rr rrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= rrVar.U0 && i11 < rrVar.V0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(rrVar.D.get(i11 - rrVar.U0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= rrVar.R0 && i11 < rrVar.S0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(rrVar.E.get(i11 - rrVar.R0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < rrVar.B0 || i11 >= rrVar.C0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(rrVar.C.get(i11 - rrVar.B0));
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
        rr rrVar = this.n;
        g(1, rrVar.s0, sparseIntArray);
        g(2, rrVar.w0, sparseIntArray);
        g(3, rrVar.x0, sparseIntArray);
        g(4, rrVar.z0, sparseIntArray);
        g(5, rrVar.A0, sparseIntArray);
        g(6, rrVar.D0, sparseIntArray);
        g(7, rrVar.E0, sparseIntArray);
        g(8, rrVar.p0, sparseIntArray);
        g(9, rrVar.q0, sparseIntArray);
        g(10, rrVar.r0, sparseIntArray);
        g(11, rrVar.Y0, sparseIntArray);
        g(12, rrVar.Z0, sparseIntArray);
        g(13, rrVar.P, sparseIntArray);
        g(14, rrVar.Q, sparseIntArray);
        g(15, rrVar.R, sparseIntArray);
        g(16, rrVar.b0, sparseIntArray);
        g(17, rrVar.a0, sparseIntArray);
        g(18, rrVar.c0, sparseIntArray);
        g(19, rrVar.e0, sparseIntArray);
        g(20, rrVar.j0, sparseIntArray);
        g(21, rrVar.f0, sparseIntArray);
        g(22, rrVar.g0, sparseIntArray);
        int i10 = 23;
        g(23, rrVar.h0, sparseIntArray);
        if (rrVar.x) {
            i10 = 24;
            g(24, rrVar.i0, sparseIntArray);
        }
        g(i10 + 1, rrVar.d0, sparseIntArray);
        g(i10 + 2, rrVar.y0, sparseIntArray);
        g(i10 + 3, rrVar.Q0, sparseIntArray);
        g(i10 + 4, rrVar.T0, sparseIntArray);
        g(i10 + 5, rrVar.W0, sparseIntArray);
        g(i10 + 6, rrVar.K0, sparseIntArray);
        g(i10 + 7, rrVar.L0, sparseIntArray);
        g(i10 + 8, rrVar.M0, sparseIntArray);
        g(i10 + 9, rrVar.N0, sparseIntArray);
        g(i10 + 10, rrVar.P0, sparseIntArray);
        g(i10 + 11, rrVar.O0, sparseIntArray);
        g(i10 + 12, rrVar.X0, sparseIntArray);
        g(i10 + 13, rrVar.c1, sparseIntArray);
        g(i10 + 14, rrVar.d1, sparseIntArray);
        g(i10 + 15, rrVar.e1, sparseIntArray);
        g(i10 + 16, rrVar.f1, sparseIntArray);
        g(i10 + 17, rrVar.g1, sparseIntArray);
        g(i10 + 18, rrVar.k0, sparseIntArray);
        g(i10 + 19, rrVar.l0, sparseIntArray);
        g(i10 + 20, rrVar.m0, sparseIntArray);
        g(i10 + 21, rrVar.n0, sparseIntArray);
        g(i10 + 22, rrVar.o0, sparseIntArray);
    }
}
