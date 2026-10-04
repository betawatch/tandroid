package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bt0 extends FragmentContextView {
    public final /* synthetic */ pv0 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(pv0 pv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, pv0 pv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, pv0Var2, false, d6Var);
        this.Q0 = pv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        pv0 pv0Var = this.Q0;
        pv0Var.P0.i(pv0Var.Q0, i10 == 0, true);
    }
}
