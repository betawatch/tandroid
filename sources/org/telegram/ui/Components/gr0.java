package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gr0 extends ih.x3 {
    public final /* synthetic */ qu0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, qu0 qu0Var) {
        super(i10, j10, context, o2Var, c6Var);
        this.Q = qu0Var;
    }

    @Override // ih.x3
    public final void p(boolean z10) {
        qu0 qu0Var = this.Q;
        TextView textView = qu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new p90(3, this, z10)).start();
        qu0Var.q1(true);
    }
}
