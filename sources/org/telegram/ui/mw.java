package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mw extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ ay Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ay ayVar, Context context, ay ayVar2, int i10) {
        super(context, ayVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = ayVar;
                super(context, ayVar2, false);
                break;
            default:
                this.Y0 = ayVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                ay ayVar = this.Y0;
                ayVar.J1.i(ayVar.G1, i10 == 0, true);
                break;
            default:
                ay ayVar2 = this.Y0;
                ayVar2.J1.i(ayVar2.I1, i10 == 0, true);
                break;
        }
    }
}
