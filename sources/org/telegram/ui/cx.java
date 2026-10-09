package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cx extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ ty S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(ty tyVar, Context context, ty tyVar2, int i10) {
        super(context, tyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = tyVar;
                super(context, tyVar2, false);
                break;
            default:
                this.S0 = tyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                ty tyVar = this.S0;
                tyVar.J1.i(tyVar.G1, i10 == 0, true);
                break;
            default:
                ty tyVar2 = this.S0;
                tyVar2.J1.i(tyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
