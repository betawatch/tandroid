package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rs0 extends xh.s2 {
    public final /* synthetic */ bw0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, bw0 bw0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.U = bw0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        bw0 bw0Var = this.U;
        TextView textView = bw0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new ds0(1, this, z10)).start();
        bw0Var.q1(true);
    }
}
