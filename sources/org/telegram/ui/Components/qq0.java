package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qq0 extends FragmentContextView {
    public final /* synthetic */ ys0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, ys0 ys0Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, ys0Var2, false, h6Var);
        this.X0 = ys0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        ys0 ys0Var = this.X0;
        ys0Var.R0.i(ys0Var.S0, i7 == 0, true);
    }
}
