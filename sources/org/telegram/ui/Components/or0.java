package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class or0 extends xh.r2 {
    public final /* synthetic */ zu0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(int i10, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var, zu0 zu0Var) {
        super(i10, j3, context, o2Var, f6Var);
        this.U = zu0Var;
    }

    @Override // xh.r2
    public final void p(boolean z10) {
        zu0 zu0Var = this.U;
        TextView textView = zu0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new bi.f(29, this, z10)).start();
        zu0Var.q1(true);
    }
}
