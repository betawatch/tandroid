package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class et0 extends FragmentContextView {
    public final /* synthetic */ sv0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(sv0 sv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, sv0 sv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, sv0Var2, false, d6Var);
        this.R0 = sv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        sv0 sv0Var = this.R0;
        sv0Var.P0.i(sv0Var.Q0, i10 == 0, true);
    }
}
