package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ns0 extends yh.p2 {
    public final /* synthetic */ xv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, xv0 xv0Var) {
        super(i10, j10, context, o2Var, g6Var);
        this.V = xv0Var;
    }

    @Override // yh.p2
    public final void p(boolean z10) {
        xv0 xv0Var = this.V;
        TextView textView = xv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new b60(4, this, z10)).start();
        xv0Var.u1(true);
    }
}
