package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements r0.m, r1 {
    public final /* synthetic */ v2 a;

    public /* synthetic */ k2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.a.b0(k1Var);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        this.a.dismiss();
        wg.f1.l1(0, null);
    }
}
