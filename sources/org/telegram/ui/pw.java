package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pw extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ fy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(fy fyVar, Context context, fy fyVar2, int i10) {
        super(context, fyVar2, true);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = fyVar;
                super(context, fyVar2, false);
                break;
            default:
                this.K0 = fyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                fy fyVar = this.K0;
                fyVar.F1.i(fyVar.C1, i10 == 0, true);
                break;
            default:
                fy fyVar2 = this.K0;
                fyVar2.F1.i(fyVar2.E1, i10 == 0, true);
                break;
        }
    }
}
