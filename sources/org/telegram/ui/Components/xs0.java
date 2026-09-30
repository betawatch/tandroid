package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class xs0 extends FragmentContextView {
    public final /* synthetic */ lv0 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, lv0 lv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, lv0Var2, false, d6Var);
        this.Q0 = lv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        lv0 lv0Var = this.Q0;
        lv0Var.P0.i(lv0Var.Q0, i10 == 0, true);
    }
}
