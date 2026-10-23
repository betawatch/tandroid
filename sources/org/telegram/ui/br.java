package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class br extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ hr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public br(hr hrVar) {
        this.n = hrVar;
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
        hr hrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= hrVar.X0 && i11 < hrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(hrVar.G.get(i11 - hrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= hrVar.U0 && i11 < hrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(hrVar.H.get(i11 - hrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < hrVar.E0 || i11 >= hrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(hrVar.F.get(i11 - hrVar.E0));
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
        hr hrVar = this.n;
        g(1, hrVar.v0, sparseIntArray);
        g(2, hrVar.z0, sparseIntArray);
        g(3, hrVar.A0, sparseIntArray);
        g(4, hrVar.C0, sparseIntArray);
        g(5, hrVar.D0, sparseIntArray);
        g(6, hrVar.G0, sparseIntArray);
        g(7, hrVar.H0, sparseIntArray);
        g(8, hrVar.s0, sparseIntArray);
        g(9, hrVar.t0, sparseIntArray);
        g(10, hrVar.u0, sparseIntArray);
        g(11, hrVar.b1, sparseIntArray);
        g(12, hrVar.c1, sparseIntArray);
        g(13, hrVar.S, sparseIntArray);
        g(14, hrVar.T, sparseIntArray);
        g(15, hrVar.U, sparseIntArray);
        g(16, hrVar.e0, sparseIntArray);
        g(17, hrVar.d0, sparseIntArray);
        g(18, hrVar.f0, sparseIntArray);
        g(19, hrVar.h0, sparseIntArray);
        g(20, hrVar.m0, sparseIntArray);
        g(21, hrVar.i0, sparseIntArray);
        g(22, hrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, hrVar.k0, sparseIntArray);
        if (hrVar.x) {
            i10 = 24;
            g(24, hrVar.l0, sparseIntArray);
        }
        g(i10 + 1, hrVar.g0, sparseIntArray);
        g(i10 + 2, hrVar.B0, sparseIntArray);
        g(i10 + 3, hrVar.T0, sparseIntArray);
        g(i10 + 4, hrVar.W0, sparseIntArray);
        g(i10 + 5, hrVar.Z0, sparseIntArray);
        g(i10 + 6, hrVar.N0, sparseIntArray);
        g(i10 + 7, hrVar.O0, sparseIntArray);
        g(i10 + 8, hrVar.P0, sparseIntArray);
        g(i10 + 9, hrVar.Q0, sparseIntArray);
        g(i10 + 10, hrVar.S0, sparseIntArray);
        g(i10 + 11, hrVar.R0, sparseIntArray);
        g(i10 + 12, hrVar.a1, sparseIntArray);
        g(i10 + 13, hrVar.f1, sparseIntArray);
        g(i10 + 14, hrVar.g1, sparseIntArray);
        g(i10 + 15, hrVar.h1, sparseIntArray);
        g(i10 + 16, hrVar.i1, sparseIntArray);
        g(i10 + 17, hrVar.j1, sparseIntArray);
        g(i10 + 18, hrVar.n0, sparseIntArray);
        g(i10 + 19, hrVar.o0, sparseIntArray);
        g(i10 + 20, hrVar.p0, sparseIntArray);
        g(i10 + 21, hrVar.q0, sparseIntArray);
        g(i10 + 22, hrVar.r0, sparseIntArray);
    }
}
