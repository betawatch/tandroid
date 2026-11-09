package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class di extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ cn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, cn cnVar) {
        super(activity, g6Var, false);
        this.t2 = cnVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        cn cnVar = this.t2;
        i0(cnVar.f1.getY() + y10, cnVar.l1.getBackgroundSizeY());
    }
}
