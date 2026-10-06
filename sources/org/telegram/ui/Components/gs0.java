package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class gs0 extends xh.s2 {
    public final /* synthetic */ qv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, qv0 qv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.U = qv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        qv0 qv0Var = this.U;
        TextView textView = qv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new fs0(0, this, z10)).start();
        qv0Var.q1(true);
    }
}
