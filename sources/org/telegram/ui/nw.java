package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nw extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ ey Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ey eyVar, Context context, ey eyVar2, int i10) {
        super(context, eyVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = eyVar;
                super(context, eyVar2, false);
                break;
            default:
                this.Y0 = eyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                ey eyVar = this.Y0;
                eyVar.J1.i(eyVar.G1, i10 == 0, true);
                break;
            default:
                ey eyVar2 = this.Y0;
                eyVar2.J1.i(eyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
