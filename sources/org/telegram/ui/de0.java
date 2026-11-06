package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ee0 a;

    public /* synthetic */ de0(ee0 ee0Var) {
        this.a = ee0Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        ee0.b0(this.a, i7);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.qp.s1(this.a.currentAccount).A3(1);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
