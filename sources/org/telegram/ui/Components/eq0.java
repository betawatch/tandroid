package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class eq0 extends bi.p6 {
    public final /* synthetic */ gt0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(gt0 gt0Var, org.telegram.ui.ActionBar.h2 h2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(h2Var, context, i7, j3, i6Var, cVar);
        this.W = gt0Var;
    }

    @Override // bi.p6
    public final void q(boolean z10) {
        gt0 gt0Var = this.W;
        TextView textView = gt0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new pp0(1, this, z10)).start();
        gt0Var.I1(true);
        gt0Var.W0();
    }
}
