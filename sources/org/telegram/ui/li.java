package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ tn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(activity, c6Var, false);
        this.g2 = tnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y8 = getY();
        tn tnVar = this.g2;
        W(tnVar.N0.getY() + y8, tnVar.T0.getBackgroundSizeY());
    }
}
