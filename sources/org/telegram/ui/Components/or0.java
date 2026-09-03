package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class or0 extends lh.x3 {
    public final /* synthetic */ yu0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, yu0 yu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.R = yu0Var;
    }

    @Override // lh.x3
    public final void p(boolean z4) {
        yu0 yu0Var = this.R;
        TextView textView = yu0Var.n0;
        textView.setVisibility(0);
        textView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.4f).scaleY(z4 ? 1.0f : 0.4f).withEndAction(new kh.f(27, this, z4)).start();
        yu0Var.q1(true);
    }
}
