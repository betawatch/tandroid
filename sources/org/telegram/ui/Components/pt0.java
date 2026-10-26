package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pt0 extends FragmentContextView {
    public final /* synthetic */ aw0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, aw0 aw0Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, aw0Var2, false, u6Var);
        this.X0 = aw0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        aw0 aw0Var = this.X0;
        aw0Var.R0.i(aw0Var.S0, i10 == 0, true);
    }
}
