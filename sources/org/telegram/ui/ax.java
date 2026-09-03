package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ax extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ qy L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(qy qyVar, Context context, qy qyVar2, int i10) {
        super(context, qyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = qyVar;
                super(context, qyVar2, false);
                break;
            default:
                this.L0 = qyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                qy qyVar = this.L0;
                qyVar.G1.i(qyVar.D1, i10 == 0, true);
                break;
            default:
                qy qyVar2 = this.L0;
                qyVar2.G1.i(qyVar2.F1, i10 == 0, true);
                break;
        }
    }
}
