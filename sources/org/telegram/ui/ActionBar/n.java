package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.n, oi.n {
    public final /* synthetic */ r2 a;

    public /* synthetic */ n(r2 r2Var) {
        this.a = r2Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // oi.n
    public int f() {
        r2 r2Var = this.a;
        r2Var.getClass();
        return r2Var.getThemedColor(y6.a7);
    }
}
