package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ft0 extends FragmentContextView {
    public final /* synthetic */ tv0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, tv0 tv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, tv0Var2, false, d6Var);
        this.R0 = tv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        tv0 tv0Var = this.R0;
        tv0Var.P0.i(tv0Var.Q0, i10 == 0, true);
    }
}
