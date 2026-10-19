package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class js0 extends yh.p2 {
    public final /* synthetic */ tv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, tv0 tv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.U = tv0Var;
    }

    @Override // yh.p2
    public final void p(boolean z10) {
        tv0 tv0Var = this.U;
        TextView textView = tv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new b60(4, this, z10)).start();
        tv0Var.s1(true);
    }
}
