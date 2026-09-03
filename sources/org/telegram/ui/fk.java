package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fk extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ zn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, znVar2, null, true, f6Var);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = znVar;
                super(context, znVar2, null, false, f6Var);
                break;
            default:
                this.L0 = znVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                zn znVar = this.L0;
                znVar.J0.i(znVar.X1, i10 == 0, true);
                break;
            default:
                zn znVar2 = this.L0;
                znVar2.J0.i(znVar2.V1, i10 == 0, true);
                break;
        }
    }
}
