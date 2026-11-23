package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Components.fo {
    public final /* synthetic */ bn N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(bn bnVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, i7, document, i6Var);
        this.N = bnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.N;
        float y11 = bnVar.g1.getY() + y10;
        this.K = bnVar.m1.getBackgroundSizeY();
        this.J = y11;
    }
}
