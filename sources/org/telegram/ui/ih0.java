package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ih0 extends f2.q {
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
    public final /* synthetic */ rh0 m;

    public ih0(rh0 rh0Var) {
        this.m = rh0Var;
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
        rh0 rh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = rh0Var.y) && i11 < rh0Var.B) || (i11 >= rh0Var.E && i11 < rh0Var.F))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= rh0Var.B) ? (TLRPC.TL_chatInviteExported) rh0Var.g0.get(i11 - rh0Var.E) : (TLRPC.TL_chatInviteExported) rh0Var.f0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = rh0Var.R) && i11 < rh0Var.S) {
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
        rh0 rh0Var = this.m;
        g(1, rh0Var.r, sparseIntArray);
        g(2, rh0Var.s, sparseIntArray);
        g(3, rh0Var.v, sparseIntArray);
        g(4, rh0Var.w, sparseIntArray);
        g(5, rh0Var.x, sparseIntArray);
        g(6, rh0Var.I, sparseIntArray);
        g(7, rh0Var.K, sparseIntArray);
        g(8, rh0Var.L, sparseIntArray);
        g(9, rh0Var.N, sparseIntArray);
        g(10, rh0Var.O, sparseIntArray);
        g(11, rh0Var.P, sparseIntArray);
        g(12, rh0Var.M, sparseIntArray);
        g(13, rh0Var.C, sparseIntArray);
    }
}
