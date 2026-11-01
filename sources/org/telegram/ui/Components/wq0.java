package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wq0 extends ph.j2 {
    public final /* synthetic */ au0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(au0 au0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(k2Var, context, i10, j10, p6Var, bVar);
        this.V = au0Var;
    }

    @Override // ph.j2
    public final void q(boolean z10) {
        au0 au0Var = this.V;
        TextView textView = au0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new k2.v(20, this, z10)).start();
        au0Var.E1(true);
    }
}
