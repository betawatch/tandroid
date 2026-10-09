package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ik extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ zn S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, znVar2, null, true, e6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = znVar;
                super(context, znVar2, null, false, e6Var);
                break;
            default:
                this.S0 = znVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                zn znVar = this.S0;
                znVar.M0.i(znVar.a2, i10 == 0, true);
                break;
            default:
                zn znVar2 = this.S0;
                znVar2.M0.i(znVar2.Y1, i10 == 0, true);
                break;
        }
    }
}
