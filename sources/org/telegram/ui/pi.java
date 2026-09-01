package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Components.ho {
    public final /* synthetic */ xn J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(xn xnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, i10, document, g6Var);
        this.J = xnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        xn xnVar = this.J;
        float y11 = xnVar.O0.getY() + y10;
        this.G = xnVar.U0.getBackgroundSizeY();
        this.F = y11;
    }
}
