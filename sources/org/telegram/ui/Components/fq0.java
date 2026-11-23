package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fq0 extends bi.v6 {
    public final /* synthetic */ it0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(it0 it0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(g2Var, context, i7, j3, i6Var, cVar);
        this.W = it0Var;
    }

    @Override // bi.v6
    public final void q(boolean z10) {
        it0 it0Var = this.W;
        TextView textView = it0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new qp0(1, this, z10)).start();
        it0Var.I1(true);
        it0Var.W0();
    }
}
