package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Components.to {
    public final /* synthetic */ sn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(sn snVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = snVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.M;
        float y10 = snVar.R0.getY() + y3;
        this.J = snVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
