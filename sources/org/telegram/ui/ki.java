package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ rn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(activity, c6Var, false);
        this.g2 = rnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y10 = getY();
        rn rnVar = this.g2;
        W(rnVar.N0.getY() + y10, rnVar.T0.getBackgroundSizeY());
    }
}
