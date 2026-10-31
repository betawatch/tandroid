package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vq0 extends ph.j2 {
    public final /* synthetic */ zt0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(zt0 zt0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(k2Var, context, i10, j10, p6Var, bVar);
        this.V = zt0Var;
    }

    @Override // ph.j2
    public final void q(boolean z10) {
        zt0 zt0Var = this.V;
        TextView textView = zt0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new k2.v(20, this, z10)).start();
        zt0Var.D1(true);
    }
}
