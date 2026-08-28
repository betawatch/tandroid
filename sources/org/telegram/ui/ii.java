package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ qn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Activity activity, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(activity, b6Var, false);
        this.g2 = qnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float y10 = getY();
        qn qnVar = this.g2;
        V(qnVar.N0.getY() + y10, qnVar.T0.getBackgroundSizeY());
    }
}
