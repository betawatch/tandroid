package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
