package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
