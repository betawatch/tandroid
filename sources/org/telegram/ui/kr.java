package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kr extends f2.q {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ qr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public kr(qr qrVar) {
        this.n = qrVar;
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
        qr qrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= qrVar.U0 && i11 < qrVar.V0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(qrVar.D.get(i11 - qrVar.U0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= qrVar.R0 && i11 < qrVar.S0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(qrVar.E.get(i11 - qrVar.R0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < qrVar.B0 || i11 >= qrVar.C0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(qrVar.C.get(i11 - qrVar.B0));
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
        qr qrVar = this.n;
        g(1, qrVar.s0, sparseIntArray);
        g(2, qrVar.w0, sparseIntArray);
        g(3, qrVar.x0, sparseIntArray);
        g(4, qrVar.z0, sparseIntArray);
        g(5, qrVar.A0, sparseIntArray);
        g(6, qrVar.D0, sparseIntArray);
        g(7, qrVar.E0, sparseIntArray);
        g(8, qrVar.p0, sparseIntArray);
        g(9, qrVar.q0, sparseIntArray);
        g(10, qrVar.r0, sparseIntArray);
        g(11, qrVar.Y0, sparseIntArray);
        g(12, qrVar.Z0, sparseIntArray);
        g(13, qrVar.P, sparseIntArray);
        g(14, qrVar.Q, sparseIntArray);
        g(15, qrVar.R, sparseIntArray);
        g(16, qrVar.b0, sparseIntArray);
        g(17, qrVar.a0, sparseIntArray);
        g(18, qrVar.c0, sparseIntArray);
        g(19, qrVar.e0, sparseIntArray);
        g(20, qrVar.j0, sparseIntArray);
        g(21, qrVar.f0, sparseIntArray);
        g(22, qrVar.g0, sparseIntArray);
        int i10 = 23;
        g(23, qrVar.h0, sparseIntArray);
        if (qrVar.x) {
            i10 = 24;
            g(24, qrVar.i0, sparseIntArray);
        }
        g(i10 + 1, qrVar.d0, sparseIntArray);
        g(i10 + 2, qrVar.y0, sparseIntArray);
        g(i10 + 3, qrVar.Q0, sparseIntArray);
        g(i10 + 4, qrVar.T0, sparseIntArray);
        g(i10 + 5, qrVar.W0, sparseIntArray);
        g(i10 + 6, qrVar.K0, sparseIntArray);
        g(i10 + 7, qrVar.L0, sparseIntArray);
        g(i10 + 8, qrVar.M0, sparseIntArray);
        g(i10 + 9, qrVar.N0, sparseIntArray);
        g(i10 + 10, qrVar.P0, sparseIntArray);
        g(i10 + 11, qrVar.O0, sparseIntArray);
        g(i10 + 12, qrVar.X0, sparseIntArray);
        g(i10 + 13, qrVar.c1, sparseIntArray);
        g(i10 + 14, qrVar.d1, sparseIntArray);
        g(i10 + 15, qrVar.e1, sparseIntArray);
        g(i10 + 16, qrVar.f1, sparseIntArray);
        g(i10 + 17, qrVar.g1, sparseIntArray);
        g(i10 + 18, qrVar.k0, sparseIntArray);
        g(i10 + 19, qrVar.l0, sparseIntArray);
        g(i10 + 20, qrVar.m0, sparseIntArray);
        g(i10 + 21, qrVar.n0, sparseIntArray);
        g(i10 + 22, qrVar.o0, sparseIntArray);
    }
}
