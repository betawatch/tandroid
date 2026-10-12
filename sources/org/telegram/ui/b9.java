package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b9 extends FragmentContextView {
    public final /* synthetic */ int R0 = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(n9 n9Var, Context context, n9 n9Var2, z8 z8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n9Var2, z8Var, false, c6Var);
        this.S0 = n9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                n9 n9Var = (n9) this.S0;
                n9Var.M.i(n9Var.N, i10 == 0, true);
                break;
            default:
                lg1 lg1Var = (lg1) this.S0;
                lg1Var.U0.i(lg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(lg1 lg1Var, Context context, lg1 lg1Var2) {
        super(context, lg1Var2, null, false, null);
        this.S0 = lg1Var;
    }
}
