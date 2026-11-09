package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ge0 a;

    public /* synthetic */ fe0(ge0 ge0Var) {
        this.a = ge0Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        ge0.b0(this.a, i7);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.qp.s1(this.a.currentAccount).A3(1);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
