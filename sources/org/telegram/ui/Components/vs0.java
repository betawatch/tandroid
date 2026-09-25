package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vs0 extends FragmentContextView {
    public final /* synthetic */ jv0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, jv0 jv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, jv0Var2, false, d6Var);
        this.P0 = jv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        jv0 jv0Var = this.P0;
        jv0Var.P0.i(jv0Var.Q0, i10 == 0, true);
    }
}
