package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements ri.n, r0.m, r1 {
    public final /* synthetic */ x2 a;

    public /* synthetic */ m2(x2 x2Var) {
        this.a = x2Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.b0(l1Var);
    }

    @Override // ri.n
    public int e() {
        x2 x2Var = this.a;
        x2Var.getClass();
        return n6.w0(n6.h5, x2Var.J0);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        this.a.dismiss();
        bi.a2.l1(false, null);
    }
}
