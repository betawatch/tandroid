package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hh0 extends f2.q {
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
    public final /* synthetic */ qh0 m;

    public hh0(qh0 qh0Var) {
        this.m = qh0Var;
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
        qh0 qh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = qh0Var.y) && i11 < qh0Var.B) || (i11 >= qh0Var.E && i11 < qh0Var.F))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= qh0Var.B) ? (TLRPC.TL_chatInviteExported) qh0Var.g0.get(i11 - qh0Var.E) : (TLRPC.TL_chatInviteExported) qh0Var.f0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = qh0Var.R) && i11 < qh0Var.S) {
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
        qh0 qh0Var = this.m;
        g(1, qh0Var.r, sparseIntArray);
        g(2, qh0Var.s, sparseIntArray);
        g(3, qh0Var.v, sparseIntArray);
        g(4, qh0Var.w, sparseIntArray);
        g(5, qh0Var.x, sparseIntArray);
        g(6, qh0Var.I, sparseIntArray);
        g(7, qh0Var.K, sparseIntArray);
        g(8, qh0Var.L, sparseIntArray);
        g(9, qh0Var.N, sparseIntArray);
        g(10, qh0Var.O, sparseIntArray);
        g(11, qh0Var.P, sparseIntArray);
        g(12, qh0Var.M, sparseIntArray);
        g(13, qh0Var.C, sparseIntArray);
    }
}
