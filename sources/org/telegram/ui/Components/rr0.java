package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rr0 extends FragmentContextView {
    public final /* synthetic */ hu0 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, hu0 hu0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n2Var, hu0Var2, false, c6Var);
        this.J0 = hu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        hu0 hu0Var = this.J0;
        hu0Var.L0.i(hu0Var.M0, i10 == 0, true);
    }
}
