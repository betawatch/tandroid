package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kq extends v4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ qq n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public kq(qq qqVar) {
        this.n = qqVar;
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
        qq qqVar = this.n;
        if (i7 >= i11 && i7 < this.j && i10 >= qqVar.W0 && i10 < qqVar.X0) {
            return ((TLObject) this.l.get(i7 - i11)).equals(qqVar.F.get(i10 - qqVar.W0));
        }
        int i12 = this.g;
        if (i7 >= i12 && i7 < this.h && i10 >= qqVar.T0 && i10 < qqVar.U0) {
            return ((TLObject) this.m.get(i7 - i12)).equals(qqVar.G.get(i10 - qqVar.T0));
        }
        int i13 = this.e;
        return (i7 < i13 || i7 >= this.f || i10 < qqVar.D0 || i10 >= qqVar.E0) ? this.c.get(i7) == this.d.get(i10) : ((TLObject) this.k.get(i7 - i13)).equals(qqVar.E.get(i10 - qqVar.D0));
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
        qq qqVar = this.n;
        g(1, qqVar.u0, sparseIntArray);
        g(2, qqVar.y0, sparseIntArray);
        g(3, qqVar.z0, sparseIntArray);
        g(4, qqVar.B0, sparseIntArray);
        g(5, qqVar.C0, sparseIntArray);
        g(6, qqVar.F0, sparseIntArray);
        g(7, qqVar.G0, sparseIntArray);
        g(8, qqVar.r0, sparseIntArray);
        g(9, qqVar.s0, sparseIntArray);
        g(10, qqVar.t0, sparseIntArray);
        g(11, qqVar.a1, sparseIntArray);
        g(12, qqVar.b1, sparseIntArray);
        g(13, qqVar.R, sparseIntArray);
        g(14, qqVar.S, sparseIntArray);
        g(15, qqVar.T, sparseIntArray);
        g(16, qqVar.d0, sparseIntArray);
        g(17, qqVar.c0, sparseIntArray);
        g(18, qqVar.e0, sparseIntArray);
        g(19, qqVar.g0, sparseIntArray);
        g(20, qqVar.l0, sparseIntArray);
        g(21, qqVar.h0, sparseIntArray);
        g(22, qqVar.i0, sparseIntArray);
        int i7 = 23;
        g(23, qqVar.j0, sparseIntArray);
        if (qqVar.x) {
            i7 = 24;
            g(24, qqVar.k0, sparseIntArray);
        }
        g(i7 + 1, qqVar.f0, sparseIntArray);
        g(i7 + 2, qqVar.A0, sparseIntArray);
        g(i7 + 3, qqVar.S0, sparseIntArray);
        g(i7 + 4, qqVar.V0, sparseIntArray);
        g(i7 + 5, qqVar.Y0, sparseIntArray);
        g(i7 + 6, qqVar.M0, sparseIntArray);
        g(i7 + 7, qqVar.N0, sparseIntArray);
        g(i7 + 8, qqVar.O0, sparseIntArray);
        g(i7 + 9, qqVar.P0, sparseIntArray);
        g(i7 + 10, qqVar.R0, sparseIntArray);
        g(i7 + 11, qqVar.Q0, sparseIntArray);
        g(i7 + 12, qqVar.Z0, sparseIntArray);
        g(i7 + 13, qqVar.e1, sparseIntArray);
        g(i7 + 14, qqVar.f1, sparseIntArray);
        g(i7 + 15, qqVar.g1, sparseIntArray);
        g(i7 + 16, qqVar.h1, sparseIntArray);
        g(i7 + 17, qqVar.i1, sparseIntArray);
        g(i7 + 18, qqVar.m0, sparseIntArray);
        g(i7 + 19, qqVar.n0, sparseIntArray);
        g(i7 + 20, qqVar.o0, sparseIntArray);
        g(i7 + 21, qqVar.p0, sparseIntArray);
        g(i7 + 22, qqVar.q0, sparseIntArray);
    }
}
