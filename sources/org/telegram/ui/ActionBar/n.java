package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, pi.n {
    public final /* synthetic */ d2 a;

    public /* synthetic */ n(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // pi.n
    public int e() {
        d2 d2Var = this.a;
        d2Var.getClass();
        return d2Var.getThemedColor(k6.a7);
    }
}
