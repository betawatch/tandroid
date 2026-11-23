package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, ri.n {
    public final /* synthetic */ g2 a;

    public /* synthetic */ n(g2 g2Var) {
        this.a = g2Var;
    }

    @Override // ri.n
    public int j() {
        g2 g2Var = this.a;
        g2Var.getClass();
        return g2Var.getThemedColor(n6.a7);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }
}
