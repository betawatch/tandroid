package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tq0 extends v4.u0 {
    public final /* synthetic */ jq0 a;
    public final /* synthetic */ kq0 b;
    public final /* synthetic */ it0 c;

    public tq0(it0 it0Var, jq0 jq0Var, kq0 kq0Var) {
        this.c = it0Var;
        this.a = jq0Var;
        this.b = kq0Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.e1 = i7 != 0;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        it0 it0Var = this.c;
        xs0[] xs0VarArr = it0Var.w1;
        kq0 kq0Var = this.b;
        jq0 jq0Var = this.a;
        it0Var.O(jq0Var, (ek0) recyclerView, kq0Var);
        if (i10 != 0 && ((i12 = it0Var.n0[0].F) == 0 || i12 == 5)) {
            xs0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = jq0Var.F) == 0 || it0.z0(i11))) {
            it0.s(jq0Var, xs0VarArr, true);
        }
        jq0Var.h.L0(true);
        if (jq0Var.G != null) {
            jq0Var.invalidate();
        }
    }
}
