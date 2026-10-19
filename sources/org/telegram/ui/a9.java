package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class a9 extends FragmentContextView {
    public final /* synthetic */ int R0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m9Var2, y8Var, false, d6Var);
        this.S0 = m9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                m9 m9Var = (m9) this.S0;
                m9Var.M.i(m9Var.N, i10 == 0, true);
                break;
            default:
                re1 re1Var = (re1) this.S0;
                re1Var.U0.i(re1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(re1 re1Var, Context context, re1 re1Var2) {
        super(context, re1Var2, null, false, null);
        this.S0 = re1Var;
    }
}
