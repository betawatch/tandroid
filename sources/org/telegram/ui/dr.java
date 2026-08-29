package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dr extends f2.q {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ jr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public dr(jr jrVar) {
        this.n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.z0 != i11;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        jr jrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= jrVar.T0 && i11 < jrVar.U0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(jrVar.C.get(i11 - jrVar.T0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.Q0 && i11 < jrVar.R0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(jrVar.D.get(i11 - jrVar.Q0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < jrVar.A0 || i11 >= jrVar.B0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(jrVar.B.get(i11 - jrVar.A0));
    }

    @Override // f2.q
    public final int d() {
        return this.n.Z0;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.n;
        g(1, jrVar.r0, sparseIntArray);
        g(2, jrVar.v0, sparseIntArray);
        g(3, jrVar.w0, sparseIntArray);
        g(4, jrVar.y0, sparseIntArray);
        g(5, jrVar.z0, sparseIntArray);
        g(6, jrVar.C0, sparseIntArray);
        g(7, jrVar.D0, sparseIntArray);
        g(8, jrVar.o0, sparseIntArray);
        g(9, jrVar.p0, sparseIntArray);
        g(10, jrVar.q0, sparseIntArray);
        g(11, jrVar.X0, sparseIntArray);
        g(12, jrVar.Y0, sparseIntArray);
        g(13, jrVar.O, sparseIntArray);
        g(14, jrVar.P, sparseIntArray);
        g(15, jrVar.Q, sparseIntArray);
        g(16, jrVar.a0, sparseIntArray);
        g(17, jrVar.Z, sparseIntArray);
        g(18, jrVar.b0, sparseIntArray);
        g(19, jrVar.d0, sparseIntArray);
        g(20, jrVar.i0, sparseIntArray);
        g(21, jrVar.e0, sparseIntArray);
        g(22, jrVar.f0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.g0, sparseIntArray);
        if (jrVar.x) {
            i10 = 24;
            g(24, jrVar.h0, sparseIntArray);
        }
        g(i10 + 1, jrVar.c0, sparseIntArray);
        g(i10 + 2, jrVar.x0, sparseIntArray);
        g(i10 + 3, jrVar.P0, sparseIntArray);
        g(i10 + 4, jrVar.S0, sparseIntArray);
        g(i10 + 5, jrVar.V0, sparseIntArray);
        g(i10 + 6, jrVar.J0, sparseIntArray);
        g(i10 + 7, jrVar.K0, sparseIntArray);
        g(i10 + 8, jrVar.L0, sparseIntArray);
        g(i10 + 9, jrVar.M0, sparseIntArray);
        g(i10 + 10, jrVar.O0, sparseIntArray);
        g(i10 + 11, jrVar.N0, sparseIntArray);
        g(i10 + 12, jrVar.W0, sparseIntArray);
        g(i10 + 13, jrVar.b1, sparseIntArray);
        g(i10 + 14, jrVar.c1, sparseIntArray);
        g(i10 + 15, jrVar.d1, sparseIntArray);
        g(i10 + 16, jrVar.e1, sparseIntArray);
        g(i10 + 17, jrVar.f1, sparseIntArray);
        g(i10 + 18, jrVar.j0, sparseIntArray);
        g(i10 + 19, jrVar.k0, sparseIntArray);
        g(i10 + 20, jrVar.l0, sparseIntArray);
        g(i10 + 21, jrVar.m0, sparseIntArray);
        g(i10 + 22, jrVar.n0, sparseIntArray);
    }
}
