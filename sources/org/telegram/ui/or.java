package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class or extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ ur n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public or(ur urVar) {
        this.n = urVar;
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
        ur urVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= urVar.X0 && i11 < urVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(urVar.G.get(i11 - urVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= urVar.U0 && i11 < urVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(urVar.H.get(i11 - urVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < urVar.E0 || i11 >= urVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(urVar.F.get(i11 - urVar.E0));
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
        ur urVar = this.n;
        g(1, urVar.v0, sparseIntArray);
        g(2, urVar.z0, sparseIntArray);
        g(3, urVar.A0, sparseIntArray);
        g(4, urVar.C0, sparseIntArray);
        g(5, urVar.D0, sparseIntArray);
        g(6, urVar.G0, sparseIntArray);
        g(7, urVar.H0, sparseIntArray);
        g(8, urVar.s0, sparseIntArray);
        g(9, urVar.t0, sparseIntArray);
        g(10, urVar.u0, sparseIntArray);
        g(11, urVar.b1, sparseIntArray);
        g(12, urVar.c1, sparseIntArray);
        g(13, urVar.S, sparseIntArray);
        g(14, urVar.T, sparseIntArray);
        g(15, urVar.U, sparseIntArray);
        g(16, urVar.e0, sparseIntArray);
        g(17, urVar.d0, sparseIntArray);
        g(18, urVar.f0, sparseIntArray);
        g(19, urVar.h0, sparseIntArray);
        g(20, urVar.m0, sparseIntArray);
        g(21, urVar.i0, sparseIntArray);
        g(22, urVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, urVar.k0, sparseIntArray);
        if (urVar.x) {
            i10 = 24;
            g(24, urVar.l0, sparseIntArray);
        }
        g(i10 + 1, urVar.g0, sparseIntArray);
        g(i10 + 2, urVar.B0, sparseIntArray);
        g(i10 + 3, urVar.T0, sparseIntArray);
        g(i10 + 4, urVar.W0, sparseIntArray);
        g(i10 + 5, urVar.Z0, sparseIntArray);
        g(i10 + 6, urVar.N0, sparseIntArray);
        g(i10 + 7, urVar.O0, sparseIntArray);
        g(i10 + 8, urVar.P0, sparseIntArray);
        g(i10 + 9, urVar.Q0, sparseIntArray);
        g(i10 + 10, urVar.S0, sparseIntArray);
        g(i10 + 11, urVar.R0, sparseIntArray);
        g(i10 + 12, urVar.a1, sparseIntArray);
        g(i10 + 13, urVar.f1, sparseIntArray);
        g(i10 + 14, urVar.g1, sparseIntArray);
        g(i10 + 15, urVar.h1, sparseIntArray);
        g(i10 + 16, urVar.i1, sparseIntArray);
        g(i10 + 17, urVar.j1, sparseIntArray);
        g(i10 + 18, urVar.n0, sparseIntArray);
        g(i10 + 19, urVar.o0, sparseIntArray);
        g(i10 + 20, urVar.p0, sparseIntArray);
        g(i10 + 21, urVar.q0, sparseIntArray);
        g(i10 + 22, urVar.r0, sparseIntArray);
    }
}
