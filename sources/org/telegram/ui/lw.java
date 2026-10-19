package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lw extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ cy S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(cy cyVar, Context context, cy cyVar2, int i10) {
        super(context, cyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = cyVar;
                super(context, cyVar2, false);
                break;
            default:
                this.S0 = cyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                cy cyVar = this.S0;
                cyVar.J1.i(cyVar.G1, i10 == 0, true);
                break;
            default:
                cy cyVar2 = this.S0;
                cyVar2.J1.i(cyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
