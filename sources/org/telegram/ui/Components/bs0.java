package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bs0 extends xh.s2 {
    public final /* synthetic */ lv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, lv0 lv0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.U = lv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        lv0 lv0Var = this.U;
        TextView textView = lv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new as0(0, this, z10)).start();
        lv0Var.q1(true);
    }
}
