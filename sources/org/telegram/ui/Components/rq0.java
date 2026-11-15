package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rq0 extends FragmentContextView {
    public final /* synthetic */ ys0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, ys0 ys0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, ys0Var2, false, e6Var);
        this.Y0 = ys0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        ys0 ys0Var = this.Y0;
        ys0Var.S0.i(ys0Var.T0, i7 == 0, true);
    }
}
