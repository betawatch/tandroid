package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vp0 extends zh.d2 {
    public final /* synthetic */ zs0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(zs0 zs0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var, dh.c cVar) {
        super(f2Var, context, i7, j3, g6Var, cVar);
        this.V = zs0Var;
    }

    @Override // zh.d2
    public final void q(boolean z9) {
        zs0 zs0Var = this.V;
        TextView textView = zs0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.4f).scaleY(z9 ? 1.0f : 0.4f).withEndAction(new up0(0, this, z9)).start();
        zs0Var.I1(true);
        zs0Var.W0();
    }
}
