package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oq0 extends FragmentContextView {
    public final /* synthetic */ ws0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, ws0 ws0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, ws0Var2, false, e6Var);
        this.Y0 = ws0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i3) {
        ws0 ws0Var = this.Y0;
        ws0Var.S0.i(ws0Var.T0, i3 == 0, true);
    }
}
