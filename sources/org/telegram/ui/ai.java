package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Cells.u0 {
    public final /* synthetic */ bn C2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity, i6Var, false);
        this.C2 = bnVar;
    }

    @Override // org.telegram.ui.Cells.u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.C2;
        l0(bnVar.g1.getY() + y10, bnVar.m1.getBackgroundSizeY());
    }
}
