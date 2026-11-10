package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements oi.n, r0.m, r1 {
    public final /* synthetic */ w2 a;

    public /* synthetic */ l2(w2 w2Var) {
        this.a = w2Var;
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

    @Override // oi.n
    public int h() {
        w2 w2Var = this.a;
        w2Var.getClass();
        return m6.w0(m6.h5, w2Var.I0);
    }
}
