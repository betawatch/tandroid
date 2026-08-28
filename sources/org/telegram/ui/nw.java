package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nw extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ dy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(dy dyVar, Context context, dy dyVar2, int i9) {
        super(context, dyVar2, true);
        this.J0 = i9;
        switch (i9) {
            case 1:
                this.K0 = dyVar;
                super(context, dyVar2, false);
                break;
            default:
                this.K0 = dyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i9) {
        switch (this.J0) {
            case 0:
                dy dyVar = this.K0;
                dyVar.F1.i(dyVar.C1, i9 == 0, true);
                break;
            default:
                dy dyVar2 = this.K0;
                dyVar2.F1.i(dyVar2.E1, i9 == 0, true);
                break;
        }
    }
}
