package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class uq0 extends v4.u0 {
    public final /* synthetic */ kq0 a;
    public final /* synthetic */ lq0 b;
    public final /* synthetic */ jt0 c;

    public uq0(jt0 jt0Var, kq0 kq0Var, lq0 lq0Var) {
        this.c = jt0Var;
        this.a = kq0Var;
        this.b = lq0Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.e1 = i7 != 0;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        jt0 jt0Var = this.c;
        ys0[] ys0VarArr = jt0Var.w1;
        lq0 lq0Var = this.b;
        kq0 kq0Var = this.a;
        jt0Var.O(kq0Var, (ek0) recyclerView, lq0Var);
        if (i10 != 0 && ((i12 = jt0Var.n0[0].F) == 0 || i12 == 5)) {
            ys0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = kq0Var.F) == 0 || jt0.z0(i11))) {
            jt0.s(kq0Var, ys0VarArr, true);
        }
        kq0Var.h.L0(true);
        if (kq0Var.G != null) {
            kq0Var.invalidate();
        }
    }
}
