package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ bn z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity, i6Var, false);
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
