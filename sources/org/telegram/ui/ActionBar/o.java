package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements r0.m, oi.n {
    public final /* synthetic */ f2 a;

    public /* synthetic */ o(f2 f2Var) {
        this.a = f2Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // oi.n
    public int h() {
        f2 f2Var = this.a;
        f2Var.getClass();
        return f2Var.getThemedColor(m6.a7);
    }
}
