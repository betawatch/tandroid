package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Components.fo {
    public final /* synthetic */ xn J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(xn xnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
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
