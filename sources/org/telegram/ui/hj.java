package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hj extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ wm Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(wm wmVar, Context context, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, wmVar2, null, true, e6Var);
        this.Y0 = i3;
        switch (i3) {
            case 1:
                this.Z0 = wmVar;
                super(context, wmVar2, null, false, e6Var);
                break;
            default:
                this.Z0 = wmVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i3) {
        switch (this.Y0) {
            case 0:
                wm wmVar = this.Z0;
                wmVar.b1.i(wmVar.p2, i3 == 0, true);
                break;
            default:
                wm wmVar2 = this.Z0;
                wmVar2.b1.i(wmVar2.n2, i3 == 0, true);
                break;
        }
    }
}
