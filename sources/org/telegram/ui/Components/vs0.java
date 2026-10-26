package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vs0 extends zh.r2 {
    public final /* synthetic */ aw0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, aw0 aw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.W = aw0Var;
    }

    @Override // zh.r2
    public final void q(boolean z10) {
        aw0 aw0Var = this.W;
        TextView textView = aw0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new d60(4, this, z10)).start();
        aw0Var.C1(true);
    }
}
