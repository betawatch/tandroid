package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, ri.n {
    public final /* synthetic */ e2 a;

    public /* synthetic */ n(e2 e2Var) {
        this.a = e2Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // ri.n
    public int e() {
        e2 e2Var = this.a;
        e2Var.getClass();
        return e2Var.getThemedColor(j6.a7);
    }
}
