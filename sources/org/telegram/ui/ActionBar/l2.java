package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements ri.n, r0.m, q1 {
    public final /* synthetic */ w2 a;

    public /* synthetic */ l2(w2 w2Var) {
        this.a = w2Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.b0(l1Var);
    }

    @Override // ri.n
    public int e() {
        w2 w2Var = this.a;
        w2Var.getClass();
        return m6.w0(m6.h5, w2Var.J0);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        this.a.dismiss();
        bi.e2.l1(false, null);
    }
}
