package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fx extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ wy Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(wy wyVar, Context context, wy wyVar2, int i10) {
        super(context, wyVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = wyVar;
                super(context, wyVar2, false);
                break;
            default:
                this.Q0 = wyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                wy wyVar = this.Q0;
                wyVar.J1.i(wyVar.G1, i10 == 0, true);
                break;
            default:
                wy wyVar2 = this.Q0;
                wyVar2.J1.i(wyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
