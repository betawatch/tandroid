package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Components.ko {
    public final /* synthetic */ wn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(wn wnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = wnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.M;
        float y10 = wnVar.R0.getY() + y3;
        this.J = wnVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
