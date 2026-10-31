package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bg0 extends s4.n {
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
    public final /* synthetic */ kg0 m;

    public bg0(kg0 kg0Var) {
        this.m = kg0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.c;
        kg0 kg0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = kg0Var.D) && i11 < kg0Var.E) || (i11 >= kg0Var.H && i11 < kg0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= kg0Var.E) ? (TLRPC.TL_chatInviteExported) kg0Var.j0.get(i11 - kg0Var.H) : (TLRPC.TL_chatInviteExported) kg0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = kg0Var.U) && i11 < kg0Var.V) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // s4.n
    public final int d() {
        return this.m.X;
    }

    @Override // s4.n
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kg0 kg0Var = this.m;
        g(1, kg0Var.r, sparseIntArray);
        g(2, kg0Var.s, sparseIntArray);
        g(3, kg0Var.w, sparseIntArray);
        g(4, kg0Var.x, sparseIntArray);
        g(5, kg0Var.y, sparseIntArray);
        g(6, kg0Var.L, sparseIntArray);
        g(7, kg0Var.N, sparseIntArray);
        g(8, kg0Var.O, sparseIntArray);
        g(9, kg0Var.Q, sparseIntArray);
        g(10, kg0Var.R, sparseIntArray);
        g(11, kg0Var.S, sparseIntArray);
        g(12, kg0Var.P, sparseIntArray);
        g(13, kg0Var.F, sparseIntArray);
    }
}
