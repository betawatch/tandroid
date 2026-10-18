package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
