package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gq0 extends bi.t6 {
    public final /* synthetic */ jt0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(jt0 jt0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(g2Var, context, i7, j3, h6Var, cVar);
        this.W = jt0Var;
    }

    @Override // bi.t6
    public final void q(boolean z10) {
        jt0 jt0Var = this.W;
        TextView textView = jt0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new rp0(1, this, z10)).start();
        jt0Var.I1(true);
        jt0Var.W0();
    }
}
