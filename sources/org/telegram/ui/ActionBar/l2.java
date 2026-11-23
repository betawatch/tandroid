package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements ri.n, r0.m, q1 {
    public final /* synthetic */ w2 a;

    public /* synthetic */ l2(w2 w2Var) {
        this.a = w2Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
        this.a.dismiss();
        bi.f2.l1(false, null);
    }

    @Override // ri.n
    public int j() {
        w2 w2Var = this.a;
        w2Var.getClass();
        return n6.w0(n6.h5, w2Var.J0);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.a.b0(l1Var);
    }
}
