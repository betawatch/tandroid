package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nr0 extends yh.q2 {
    public final /* synthetic */ xu0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, xu0 xu0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.U = xu0Var;
    }

    @Override // yh.q2
    public final void p(boolean z10) {
        xu0 xu0Var = this.U;
        TextView textView = xu0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new mr0(0, this, z10)).start();
        xu0Var.q1(true);
    }
}
