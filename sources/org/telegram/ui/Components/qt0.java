package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qt0 extends FragmentContextView {
    public final /* synthetic */ bw0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, bw0 bw0Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, bw0Var2, false, u6Var);
        this.X0 = bw0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        bw0 bw0Var = this.X0;
        bw0Var.R0.i(bw0Var.S0, i10 == 0, true);
    }
}
