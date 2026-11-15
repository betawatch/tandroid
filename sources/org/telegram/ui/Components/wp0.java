package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wp0 extends bi.i4 {
    public final /* synthetic */ ys0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(ys0 ys0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(e2Var, context, i7, j3, e6Var, cVar);
        this.W = ys0Var;
    }

    @Override // bi.i4
    public final void q(boolean z10) {
        ys0 ys0Var = this.W;
        TextView textView = ys0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new fp0(1, this, z10)).start();
        ys0Var.I1(true);
        ys0Var.W0();
    }
}
