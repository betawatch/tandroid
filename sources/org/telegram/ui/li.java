package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ qn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, qn qnVar) {
        super(activity, d6Var, false);
        this.t2 = qnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        qn qnVar = this.t2;
        a0(qnVar.R0.getY() + y3, qnVar.X0.getBackgroundSizeY());
    }
}
