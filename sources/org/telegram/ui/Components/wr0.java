package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wr0 extends wh.q2 {
    public final /* synthetic */ iv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, iv0 iv0Var) {
        super(i10, j3, context, p2Var, f6Var);
        this.U = iv0Var;
    }

    @Override // wh.q2
    public final void p(boolean z10) {
        iv0 iv0Var = this.U;
        TextView textView = iv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new ai.j(29, this, z10)).start();
        iv0Var.q1(true);
    }
}
