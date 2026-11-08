package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
