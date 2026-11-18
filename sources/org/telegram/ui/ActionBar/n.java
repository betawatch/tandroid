package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, ri.n {
    public final /* synthetic */ h2 a;

    public /* synthetic */ n(h2 h2Var) {
        this.a = h2Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // ri.n
    public int e() {
        h2 h2Var = this.a;
        h2Var.getClass();
        return h2Var.getThemedColor(n6.a7);
    }
}
