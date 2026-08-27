package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wq0 extends gh.d4 {
    public final /* synthetic */ hu0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, hu0 hu0Var) {
        super(i10, j10, context, n2Var, c6Var);
        this.Q = hu0Var;
    }

    @Override // gh.d4
    public final void p(boolean z10) {
        hu0 hu0Var = this.Q;
        TextView textView = hu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new f50(4, this, z10)).start();
        hu0Var.q1(true);
    }
}
