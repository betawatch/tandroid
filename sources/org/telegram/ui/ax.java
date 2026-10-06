package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ax extends FragmentContextView {
    public final /* synthetic */ int Q0;
    public final /* synthetic */ uy R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(uy uyVar, Context context, uy uyVar2, int i10) {
        super(context, uyVar2, true);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = uyVar;
                super(context, uyVar2, false);
                break;
            default:
                this.R0 = uyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                uy uyVar = this.R0;
                uyVar.J1.i(uyVar.G1, i10 == 0, true);
                break;
            default:
                uy uyVar2 = this.R0;
                uyVar2.J1.i(uyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
