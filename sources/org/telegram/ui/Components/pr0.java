package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pr0 extends lh.x3 {
    public final /* synthetic */ zu0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, zu0 zu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.R = zu0Var;
    }

    @Override // lh.x3
    public final void p(boolean z4) {
        zu0 zu0Var = this.R;
        TextView textView = zu0Var.n0;
        textView.setVisibility(0);
        textView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.4f).scaleY(z4 ? 1.0f : 0.4f).withEndAction(new kh.f(27, this, z4)).start();
        zu0Var.q1(true);
    }
}
