package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class nh0 extends s4.o {
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
    public final /* synthetic */ wh0 m;

    public nh0(wh0 wh0Var) {
        this.m = wh0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.c;
        wh0 wh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = wh0Var.y) && i11 < wh0Var.E) || (i11 >= wh0Var.H && i11 < wh0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= wh0Var.E) ? (TLRPC.TL_chatInviteExported) wh0Var.j0.get(i11 - wh0Var.H) : (TLRPC.TL_chatInviteExported) wh0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = wh0Var.U) && i11 < wh0Var.V) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // s4.o
    public final int d() {
        return this.m.X;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wh0 wh0Var = this.m;
        g(1, wh0Var.r, sparseIntArray);
        g(2, wh0Var.s, sparseIntArray);
        g(3, wh0Var.v, sparseIntArray);
        g(4, wh0Var.w, sparseIntArray);
        g(5, wh0Var.x, sparseIntArray);
        g(6, wh0Var.L, sparseIntArray);
        g(7, wh0Var.N, sparseIntArray);
        g(8, wh0Var.O, sparseIntArray);
        g(9, wh0Var.Q, sparseIntArray);
        g(10, wh0Var.R, sparseIntArray);
        g(11, wh0Var.S, sparseIntArray);
        g(12, wh0Var.P, sparseIntArray);
        g(13, wh0Var.F, sparseIntArray);
    }
}
