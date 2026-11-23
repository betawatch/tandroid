package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
