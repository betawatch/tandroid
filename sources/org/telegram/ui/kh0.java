package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kh0 extends s4.o {
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
    public final /* synthetic */ th0 m;

    public kh0(th0 th0Var) {
        this.m = th0Var;
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
        th0 th0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = th0Var.y) && i11 < th0Var.E) || (i11 >= th0Var.H && i11 < th0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= th0Var.E) ? (TLRPC.TL_chatInviteExported) th0Var.j0.get(i11 - th0Var.H) : (TLRPC.TL_chatInviteExported) th0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = th0Var.U) && i11 < th0Var.V) {
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
        th0 th0Var = this.m;
        g(1, th0Var.r, sparseIntArray);
        g(2, th0Var.s, sparseIntArray);
        g(3, th0Var.v, sparseIntArray);
        g(4, th0Var.w, sparseIntArray);
        g(5, th0Var.x, sparseIntArray);
        g(6, th0Var.L, sparseIntArray);
        g(7, th0Var.N, sparseIntArray);
        g(8, th0Var.O, sparseIntArray);
        g(9, th0Var.Q, sparseIntArray);
        g(10, th0Var.R, sparseIntArray);
        g(11, th0Var.S, sparseIntArray);
        g(12, th0Var.P, sparseIntArray);
        g(13, th0Var.F, sparseIntArray);
    }
}
