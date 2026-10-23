package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ak extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ sn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(sn snVar, Context context, sn snVar2, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, snVar2, null, true, g6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = snVar;
                super(context, snVar2, null, false, g6Var);
                break;
            default:
                this.Y0 = snVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                sn snVar = this.Y0;
                snVar.Y0.i(snVar.m2, i10 == 0, true);
                break;
            default:
                sn snVar2 = this.Y0;
                snVar2.Y0.i(snVar2.k2, i10 == 0, true);
                break;
        }
    }
}
