package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dk extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ xn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(xn xnVar, Context context, xn xnVar2, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, xnVar2, null, true, g6Var);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = xnVar;
                super(context, xnVar2, null, false, g6Var);
                break;
            default:
                this.L0 = xnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                xn xnVar = this.L0;
                xnVar.J0.i(xnVar.X1, i10 == 0, true);
                break;
            default:
                xn xnVar2 = this.L0;
                xnVar2.J0.i(xnVar2.V1, i10 == 0, true);
                break;
        }
    }
}
