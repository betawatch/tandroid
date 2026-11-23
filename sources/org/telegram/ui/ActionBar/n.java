package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, ri.n {
    public final /* synthetic */ g2 a;

    public /* synthetic */ n(g2 g2Var) {
        this.a = g2Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // ri.n
    public int e() {
        g2 g2Var = this.a;
        g2Var.getClass();
        return g2Var.getThemedColor(m6.a7);
    }
}
