package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yr0 extends xh.s2 {
    public final /* synthetic */ jv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, jv0 jv0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.U = jv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        jv0 jv0Var = this.U;
        TextView textView = jv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new bi.f(29, this, z10)).start();
        jv0Var.q1(true);
    }
}
