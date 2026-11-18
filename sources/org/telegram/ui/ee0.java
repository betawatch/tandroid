package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ fe0 a;

    public /* synthetic */ ee0(fe0 fe0Var) {
        this.a = fe0Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        fe0.b0(this.a, i7);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.mp.u1(this.a.currentAccount).H3(1);
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
