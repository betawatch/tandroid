package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ks0 extends yh.p2 {
    public final /* synthetic */ uv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, uv0 uv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.U = uv0Var;
    }

    @Override // yh.p2
    public final void p(boolean z10) {
        uv0 uv0Var = this.U;
        TextView textView = uv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new b60(4, this, z10)).start();
        uv0Var.s1(true);
    }
}
