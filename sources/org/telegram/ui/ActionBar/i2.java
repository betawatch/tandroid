package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements r0.m, p1 {
    public final /* synthetic */ t2 a;

    public /* synthetic */ i2(t2 t2Var) {
        this.a = t2Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.a.b0(k1Var);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        this.a.dismiss();
        xg.e1.l1(0, null);
    }
}
