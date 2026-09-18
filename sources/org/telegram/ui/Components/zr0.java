package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zr0 extends xh.s2 {
    public final /* synthetic */ kv0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, kv0 kv0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.U = kv0Var;
    }

    @Override // xh.s2
    public final void p(boolean z10) {
        kv0 kv0Var = this.U;
        TextView textView = kv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new bi.f(29, this, z10)).start();
        kv0Var.q1(true);
    }
}
