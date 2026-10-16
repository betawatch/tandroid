package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bi0 implements org.telegram.ui.Components.v90 {
    public final /* synthetic */ org.telegram.ui.Components.w90 a;
    public final /* synthetic */ ci0 b;

    public bi0(ci0 ci0Var, org.telegram.ui.Components.w90 w90Var) {
        this.b = ci0Var;
        this.a = w90Var;
    }

    @Override // org.telegram.ui.Components.v90
    public final void d() {
        di0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.v90
    public final void i() {
        ci0 ci0Var = this.b;
        di0 di0Var = ci0Var.d;
        Context context = this.a.getContext();
        di0 di0Var2 = ci0Var.d;
        di0Var.l0 = new org.telegram.ui.Components.p70(context, di0Var2.e, di0Var2.d, di0Var2.k0, di0Var2, di0Var2.n, true, di0Var2.h);
        ci0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void j() {
    }
}
