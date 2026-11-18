package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zq0 extends FragmentContextView {
    public final /* synthetic */ gt0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, gt0 gt0Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, gt0Var2, false, i6Var);
        this.Y0 = gt0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        gt0 gt0Var = this.Y0;
        gt0Var.S0.j(gt0Var.T0, i7 == 0, true);
    }
}
