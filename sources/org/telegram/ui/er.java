package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class er extends f2.q {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ lr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public er(lr lrVar) {
        this.n = lrVar;
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
        lr lrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= lrVar.T0 && i11 < lrVar.U0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(lrVar.C.get(i11 - lrVar.T0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= lrVar.Q0 && i11 < lrVar.R0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(lrVar.D.get(i11 - lrVar.Q0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < lrVar.A0 || i11 >= lrVar.B0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(lrVar.B.get(i11 - lrVar.A0));
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
        lr lrVar = this.n;
        g(1, lrVar.r0, sparseIntArray);
        g(2, lrVar.v0, sparseIntArray);
        g(3, lrVar.w0, sparseIntArray);
        g(4, lrVar.y0, sparseIntArray);
        g(5, lrVar.z0, sparseIntArray);
        g(6, lrVar.C0, sparseIntArray);
        g(7, lrVar.D0, sparseIntArray);
        g(8, lrVar.o0, sparseIntArray);
        g(9, lrVar.p0, sparseIntArray);
        g(10, lrVar.q0, sparseIntArray);
        g(11, lrVar.X0, sparseIntArray);
        g(12, lrVar.Y0, sparseIntArray);
        g(13, lrVar.O, sparseIntArray);
        g(14, lrVar.P, sparseIntArray);
        g(15, lrVar.Q, sparseIntArray);
        g(16, lrVar.a0, sparseIntArray);
        g(17, lrVar.Z, sparseIntArray);
        g(18, lrVar.b0, sparseIntArray);
        g(19, lrVar.d0, sparseIntArray);
        g(20, lrVar.i0, sparseIntArray);
        g(21, lrVar.e0, sparseIntArray);
        g(22, lrVar.f0, sparseIntArray);
        int i10 = 23;
        g(23, lrVar.g0, sparseIntArray);
        if (lrVar.x) {
            i10 = 24;
            g(24, lrVar.h0, sparseIntArray);
        }
        g(i10 + 1, lrVar.c0, sparseIntArray);
        g(i10 + 2, lrVar.x0, sparseIntArray);
        g(i10 + 3, lrVar.P0, sparseIntArray);
        g(i10 + 4, lrVar.S0, sparseIntArray);
        g(i10 + 5, lrVar.V0, sparseIntArray);
        g(i10 + 6, lrVar.J0, sparseIntArray);
        g(i10 + 7, lrVar.K0, sparseIntArray);
        g(i10 + 8, lrVar.L0, sparseIntArray);
        g(i10 + 9, lrVar.M0, sparseIntArray);
        g(i10 + 10, lrVar.O0, sparseIntArray);
        g(i10 + 11, lrVar.N0, sparseIntArray);
        g(i10 + 12, lrVar.W0, sparseIntArray);
        g(i10 + 13, lrVar.b1, sparseIntArray);
        g(i10 + 14, lrVar.c1, sparseIntArray);
        g(i10 + 15, lrVar.d1, sparseIntArray);
        g(i10 + 16, lrVar.e1, sparseIntArray);
        g(i10 + 17, lrVar.f1, sparseIntArray);
        g(i10 + 18, lrVar.j0, sparseIntArray);
        g(i10 + 19, lrVar.k0, sparseIntArray);
        g(i10 + 20, lrVar.l0, sparseIntArray);
        g(i10 + 21, lrVar.m0, sparseIntArray);
        g(i10 + 22, lrVar.n0, sparseIntArray);
    }
}
