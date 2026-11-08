package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hv extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ ww Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(ww wwVar, Context context, ww wwVar2, int i7) {
        super(context, wwVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = wwVar;
                super(context, wwVar2, false);
                break;
            default:
                this.Y0 = wwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                ww wwVar = this.Y0;
                wwVar.J1.i(wwVar.G1, i7 == 0, true);
                break;
            default:
                ww wwVar2 = this.Y0;
                wwVar2.J1.i(wwVar2.I1, i7 == 0, true);
                break;
        }
    }
}
