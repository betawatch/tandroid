package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gh0 extends f2.q {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final SparseIntArray i = new SparseIntArray();
    public final SparseIntArray j = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final /* synthetic */ ph0 m;

    public gh0(ph0 ph0Var) {
        this.m = ph0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.c;
        ph0 ph0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = ph0Var.y) && i11 < ph0Var.B) || (i11 >= ph0Var.E && i11 < ph0Var.F))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= ph0Var.B) ? (TLRPC.TL_chatInviteExported) ph0Var.g0.get(i11 - ph0Var.E) : (TLRPC.TL_chatInviteExported) ph0Var.f0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ph0Var.R) && i11 < ph0Var.S) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // f2.q
    public final int d() {
        return this.m.U;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ph0 ph0Var = this.m;
        g(1, ph0Var.r, sparseIntArray);
        g(2, ph0Var.s, sparseIntArray);
        g(3, ph0Var.v, sparseIntArray);
        g(4, ph0Var.w, sparseIntArray);
        g(5, ph0Var.x, sparseIntArray);
        g(6, ph0Var.I, sparseIntArray);
        g(7, ph0Var.K, sparseIntArray);
        g(8, ph0Var.L, sparseIntArray);
        g(9, ph0Var.N, sparseIntArray);
        g(10, ph0Var.O, sparseIntArray);
        g(11, ph0Var.P, sparseIntArray);
        g(12, ph0Var.M, sparseIntArray);
        g(13, ph0Var.C, sparseIntArray);
    }
}
