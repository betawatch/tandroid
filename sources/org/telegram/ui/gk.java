package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gk extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ zn Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, znVar2, null, true, e6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = znVar;
                super(context, znVar2, null, false, e6Var);
                break;
            default:
                this.Q0 = znVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                zn znVar = this.Q0;
                znVar.M0.i(znVar.a2, i10 == 0, true);
                break;
            default:
                zn znVar2 = this.Q0;
                znVar2.M0.i(znVar2.Y1, i10 == 0, true);
                break;
        }
    }
}
