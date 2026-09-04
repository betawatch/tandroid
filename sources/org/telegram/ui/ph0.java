package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ph0 extends s4.o {
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
    public final /* synthetic */ yh0 m;

    public ph0(yh0 yh0Var) {
        this.m = yh0Var;
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
        yh0 yh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = yh0Var.y) && i11 < yh0Var.E) || (i11 >= yh0Var.H && i11 < yh0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= yh0Var.E) ? (TLRPC.TL_chatInviteExported) yh0Var.j0.get(i11 - yh0Var.H) : (TLRPC.TL_chatInviteExported) yh0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = yh0Var.U) && i11 < yh0Var.V) {
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
        yh0 yh0Var = this.m;
        g(1, yh0Var.r, sparseIntArray);
        g(2, yh0Var.s, sparseIntArray);
        g(3, yh0Var.v, sparseIntArray);
        g(4, yh0Var.w, sparseIntArray);
        g(5, yh0Var.x, sparseIntArray);
        g(6, yh0Var.L, sparseIntArray);
        g(7, yh0Var.N, sparseIntArray);
        g(8, yh0Var.O, sparseIntArray);
        g(9, yh0Var.Q, sparseIntArray);
        g(10, yh0Var.R, sparseIntArray);
        g(11, yh0Var.S, sparseIntArray);
        g(12, yh0Var.P, sparseIntArray);
        g(13, yh0Var.F, sparseIntArray);
    }
}
