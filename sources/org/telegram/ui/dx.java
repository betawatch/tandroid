package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dx extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ uy Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(uy uyVar, Context context, uy uyVar2, int i10) {
        super(context, uyVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = uyVar;
                super(context, uyVar2, false);
                break;
            default:
                this.Q0 = uyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                uy uyVar = this.Q0;
                uyVar.J1.i(uyVar.G1, i10 == 0, true);
                break;
            default:
                uy uyVar2 = this.Q0;
                uyVar2.J1.i(uyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
