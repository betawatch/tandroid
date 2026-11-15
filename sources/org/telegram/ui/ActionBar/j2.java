package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements ri.n, r0.m, q1 {
    public final /* synthetic */ u2 a;

    public /* synthetic */ j2(u2 u2Var) {
        this.a = u2Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.a.b0(k1Var);
    }

    @Override // ri.n
    public int e() {
        u2 u2Var = this.a;
        u2Var.getClass();
        return j6.w0(j6.h5, u2Var.J0);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        this.a.dismiss();
        wg.c1.l1(0, null);
    }
}
