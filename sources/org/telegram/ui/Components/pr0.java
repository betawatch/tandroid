package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pr0 extends FragmentContextView {
    public final /* synthetic */ zt0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, zt0 zt0Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, zt0Var2, false, p6Var);
        this.X0 = zt0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        zt0 zt0Var = this.X0;
        zt0Var.R0.i(zt0Var.S0, i10 == 0, true);
    }
}
