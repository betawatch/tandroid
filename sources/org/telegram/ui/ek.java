package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ek extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ xn Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(xn xnVar, Context context, xn xnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, xnVar2, null, true, d6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = xnVar;
                super(context, xnVar2, null, false, d6Var);
                break;
            default:
                this.Q0 = xnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                xn xnVar = this.Q0;
                xnVar.M0.i(xnVar.a2, i10 == 0, true);
                break;
            default:
                xn xnVar2 = this.Q0;
                xnVar2.M0.i(xnVar2.Y1, i10 == 0, true);
                break;
        }
    }
}
