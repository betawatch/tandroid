package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qr0 extends FragmentContextView {
    public final /* synthetic */ au0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, au0 au0Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, au0Var2, false, p6Var);
        this.X0 = au0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        au0 au0Var = this.X0;
        au0Var.R0.i(au0Var.S0, i10 == 0, true);
    }
}
