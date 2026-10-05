package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ek extends FragmentContextView {
    public final /* synthetic */ int Q0;
    public final /* synthetic */ yn R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(yn ynVar, Context context, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, ynVar2, null, true, d6Var);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = ynVar;
                super(context, ynVar2, null, false, d6Var);
                break;
            default:
                this.R0 = ynVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                yn ynVar = this.R0;
                ynVar.K0.i(ynVar.Y1, i10 == 0, true);
                break;
            default:
                yn ynVar2 = this.R0;
                ynVar2.K0.i(ynVar2.W1, i10 == 0, true);
                break;
        }
    }
}
