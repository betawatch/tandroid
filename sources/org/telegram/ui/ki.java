package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.Components.to {
    public final /* synthetic */ qn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(qn qnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = qnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        qn qnVar = this.M;
        float y10 = qnVar.R0.getY() + y3;
        this.J = qnVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
