package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class is0 extends yh.p2 {
    public final /* synthetic */ sv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, sv0 sv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.U = sv0Var;
    }

    @Override // yh.p2
    public final void p(boolean z10) {
        sv0 sv0Var = this.U;
        TextView textView = sv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new b60(4, this, z10)).start();
        sv0Var.s1(true);
    }
}
