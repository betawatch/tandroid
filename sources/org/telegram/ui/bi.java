package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bi extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ bn z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, bn bnVar) {
        super(activity, h6Var, false);
        this.z2 = bnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.z2;
        k0(bnVar.g1.getY() + y10, bnVar.m1.getBackgroundSizeY());
    }
}
