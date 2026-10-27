package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c9 extends FragmentContextView {
    public final /* synthetic */ int X0 = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(o9 o9Var, Context context, o9 o9Var2, a9 a9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, o9Var2, a9Var, false, u6Var);
        this.Y0 = o9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                o9 o9Var = (o9) this.Y0;
                o9Var.H.i(o9Var.I, i10 == 0, true);
                break;
            default:
                cf1 cf1Var = (cf1) this.Y0;
                cf1Var.U0.i(cf1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(cf1 cf1Var, Context context, cf1 cf1Var2) {
        super(context, cf1Var2, null, false, null);
        this.Y0 = cf1Var;
    }
}
