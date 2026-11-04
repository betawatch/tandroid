package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vp0 extends ai.u4 {
    public final /* synthetic */ ws0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(ws0 ws0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(d2Var, context, i3, j10, e6Var, cVar);
        this.W = ws0Var;
    }

    @Override // ai.u4
    public final void q(boolean z10) {
        ws0 ws0Var = this.W;
        TextView textView = ws0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new up0(0, this, z10)).start();
        ws0Var.G1(true);
    }
}
