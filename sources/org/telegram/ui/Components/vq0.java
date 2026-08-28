package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vq0 extends fh.j4 {
    public final /* synthetic */ eu0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, eu0 eu0Var) {
        super(i9, j10, context, o2Var, b6Var);
        this.Q = eu0Var;
    }

    @Override // fh.j4
    public final void p(boolean z10) {
        eu0 eu0Var = this.Q;
        TextView textView = eu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new a50(4, this, z10)).start();
        eu0Var.q1(true);
    }
}
