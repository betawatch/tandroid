package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ws0 extends zh.r2 {
    public final /* synthetic */ bw0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, bw0 bw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.W = bw0Var;
    }

    @Override // zh.r2
    public final void q(boolean z10) {
        bw0 bw0Var = this.W;
        TextView textView = bw0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new d60(4, this, z10)).start();
        bw0Var.C1(true);
    }
}
