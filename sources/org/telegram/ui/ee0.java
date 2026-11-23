package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ fe0 a;

    public /* synthetic */ ee0(fe0 fe0Var) {
        this.a = fe0Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        fe0.b0(this.a, i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.mp.u1(this.a.currentAccount).H3(1);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
