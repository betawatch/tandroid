package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fs0 extends xh.s2 {
    public final /* synthetic */ pv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, pv0 pv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.U = pv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        pv0 pv0Var = this.U;
        TextView textView = pv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new es0(0, this, z10)).start();
        pv0Var.q1(true);
    }
}
