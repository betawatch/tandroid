package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ sn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, sn snVar) {
        super(activity, d6Var, false);
        this.t2 = snVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.t2;
        a0(snVar.R0.getY() + y3, snVar.X0.getBackgroundSizeY());
    }
}
