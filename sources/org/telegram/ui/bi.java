package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class bi extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ an u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        super(activity, e6Var, false);
        this.u2 = anVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.u2;
        j0(anVar.g1.getY() + y10, anVar.m1.getBackgroundSizeY());
    }
}
