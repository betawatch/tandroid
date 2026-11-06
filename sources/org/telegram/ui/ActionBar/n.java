package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.m, oi.n {
    public final /* synthetic */ f2 a;

    public /* synthetic */ n(f2 f2Var) {
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
        return f2Var.getThemedColor(k6.a7);
    }
}
