package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mi extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ un t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, un unVar) {
        super(activity, u6Var, false);
        this.t2 = unVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.t2;
        Y(unVar.d1.getY() + y3, unVar.j1.getBackgroundSizeY());
    }
}
