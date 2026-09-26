package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
