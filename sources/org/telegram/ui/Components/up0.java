package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class up0 extends zh.d2 {
    public final /* synthetic */ ys0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(ys0 ys0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(f2Var, context, i7, j3, h6Var, cVar);
        this.V = ys0Var;
    }

    @Override // zh.d2
    public final void q(boolean z9) {
        ys0 ys0Var = this.V;
        TextView textView = ys0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.4f).scaleY(z9 ? 1.0f : 0.4f).withEndAction(new tp0(0, this, z9)).start();
        ys0Var.I1(true);
        ys0Var.W0();
    }
}
