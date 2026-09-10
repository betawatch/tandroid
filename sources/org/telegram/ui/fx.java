package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fx extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ wy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(wy wyVar, Context context, wy wyVar2, int i10) {
        super(context, wyVar2, true);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = wyVar;
                super(context, wyVar2, false);
                break;
            default:
                this.O0 = wyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.N0) {
            case 0:
                wy wyVar = this.O0;
                wyVar.J1.i(wyVar.G1, i10 == 0, true);
                break;
            default:
                wy wyVar2 = this.O0;
                wyVar2.J1.i(wyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
