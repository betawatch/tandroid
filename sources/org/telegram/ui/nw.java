package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nw extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ ey S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ey eyVar, Context context, ey eyVar2, int i10) {
        super(context, eyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = eyVar;
                super(context, eyVar2, false);
                break;
            default:
                this.S0 = eyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                ey eyVar = this.S0;
                eyVar.J1.i(eyVar.G1, i10 == 0, true);
                break;
            default:
                ey eyVar2 = this.S0;
                eyVar2.J1.i(eyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
