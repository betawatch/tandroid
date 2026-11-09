package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rq0 extends FragmentContextView {
    public final /* synthetic */ zs0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, zs0 zs0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, zs0Var2, false, g6Var);
        this.X0 = zs0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        zs0 zs0Var = this.X0;
        zs0Var.R0.i(zs0Var.S0, i7 == 0, true);
    }
}
