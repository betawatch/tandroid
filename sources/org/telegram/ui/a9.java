package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a9 extends FragmentContextView {
    public final /* synthetic */ int Q0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m9Var2, y8Var, false, d6Var);
        this.R0 = m9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                m9 m9Var = (m9) this.R0;
                m9Var.L.i(m9Var.M, i10 == 0, true);
                break;
            default:
                wf1 wf1Var = (wf1) this.R0;
                wf1Var.U0.i(wf1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.R0 = wf1Var;
    }
}
