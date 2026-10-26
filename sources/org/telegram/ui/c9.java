package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                af1 af1Var = (af1) this.Y0;
                af1Var.U0.i(af1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(af1 af1Var, Context context, af1 af1Var2) {
        super(context, af1Var2, null, false, null);
        this.Y0 = af1Var;
    }
}
