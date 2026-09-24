package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class zr0 extends xh.s2 {
    public final /* synthetic */ jv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, jv0 jv0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.U = jv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        jv0 jv0Var = this.U;
        TextView textView = jv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new yr0(0, this, z10)).start();
        jv0Var.q1(true);
    }
}
