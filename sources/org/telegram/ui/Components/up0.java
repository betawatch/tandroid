package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class up0 extends zh.d2 {
    public final /* synthetic */ xs0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(xs0 xs0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, dh.c cVar) {
        super(f2Var, context, i7, j3, f6Var, cVar);
        this.V = xs0Var;
    }

    @Override // zh.d2
    public final void q(boolean z9) {
        xs0 xs0Var = this.V;
        TextView textView = xs0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.4f).scaleY(z9 ? 1.0f : 0.4f).withEndAction(new tp0(0, this, z9)).start();
        xs0Var.G1(true);
    }
}
