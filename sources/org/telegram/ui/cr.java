package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cr extends f2.s {
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

    public cr(jr jrVar) {
        this.n = jrVar;
    }

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return b(i9, i10) && this.n.z0 != i10;
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        int i11 = this.i;
        jr jrVar = this.n;
        if (i9 >= i11 && i9 < this.j && i10 >= jrVar.T0 && i10 < jrVar.U0) {
            return ((TLObject) this.l.get(i9 - i11)).equals(jrVar.C.get(i10 - jrVar.T0));
        }
        int i12 = this.g;
        if (i9 >= i12 && i9 < this.h && i10 >= jrVar.Q0 && i10 < jrVar.R0) {
            return ((TLObject) this.m.get(i9 - i12)).equals(jrVar.D.get(i10 - jrVar.Q0));
        }
        int i13 = this.e;
        return (i9 < i13 || i9 >= this.f || i10 < jrVar.A0 || i10 >= jrVar.B0) ? this.c.get(i9) == this.d.get(i10) : ((TLObject) this.k.get(i9 - i13)).equals(jrVar.B.get(i10 - jrVar.A0));
    }

    @Override // f2.s
    public final int d() {
        return this.n.Z0;
    }

    @Override // f2.s
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
        int i9 = 23;
        g(23, jrVar.g0, sparseIntArray);
        if (jrVar.x) {
            i9 = 24;
            g(24, jrVar.h0, sparseIntArray);
        }
        g(i9 + 1, jrVar.c0, sparseIntArray);
        g(i9 + 2, jrVar.x0, sparseIntArray);
        g(i9 + 3, jrVar.P0, sparseIntArray);
        g(i9 + 4, jrVar.S0, sparseIntArray);
        g(i9 + 5, jrVar.V0, sparseIntArray);
        g(i9 + 6, jrVar.J0, sparseIntArray);
        g(i9 + 7, jrVar.K0, sparseIntArray);
        g(i9 + 8, jrVar.L0, sparseIntArray);
        g(i9 + 9, jrVar.M0, sparseIntArray);
        g(i9 + 10, jrVar.O0, sparseIntArray);
        g(i9 + 11, jrVar.N0, sparseIntArray);
        g(i9 + 12, jrVar.W0, sparseIntArray);
        g(i9 + 13, jrVar.b1, sparseIntArray);
        g(i9 + 14, jrVar.c1, sparseIntArray);
        g(i9 + 15, jrVar.d1, sparseIntArray);
        g(i9 + 16, jrVar.e1, sparseIntArray);
        g(i9 + 17, jrVar.f1, sparseIntArray);
        g(i9 + 18, jrVar.j0, sparseIntArray);
        g(i9 + 19, jrVar.k0, sparseIntArray);
        g(i9 + 20, jrVar.l0, sparseIntArray);
        g(i9 + 21, jrVar.m0, sparseIntArray);
        g(i9 + 22, jrVar.n0, sparseIntArray);
    }
}
