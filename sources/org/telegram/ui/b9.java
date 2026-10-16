package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                kg1 kg1Var = (kg1) this.S0;
                kg1Var.U0.i(kg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(kg1 kg1Var, Context context, kg1 kg1Var2) {
        super(context, kg1Var2, null, false, null);
        this.S0 = kg1Var;
    }
}
