package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.Components.wn {
    public final /* synthetic */ rn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(rn rnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, i10, document, c6Var);
        this.I = rnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y10 = getY();
        rn rnVar = this.I;
        float y11 = rnVar.N0.getY() + y10;
        this.F = rnVar.T0.getBackgroundSizeY();
        this.E = y11;
    }
}
