package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nr0 extends xh.s2 {
    public final /* synthetic */ yu0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, yu0 yu0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.U = yu0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        yu0 yu0Var = this.U;
        TextView textView = yu0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new bi.f(29, this, z10)).start();
        yu0Var.q1(true);
    }
}
