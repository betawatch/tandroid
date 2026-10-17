package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.Cells.x0 {
    public final /* synthetic */ sn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, sn snVar) {
        super(activity, d6Var, false);
        this.t2 = snVar;
    }

    @Override // org.telegram.ui.Cells.x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.t2;
        a0(snVar.R0.getY() + y3, snVar.X0.getBackgroundSizeY());
    }
}
