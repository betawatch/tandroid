package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cu0 extends rv0 {
    public final /* synthetic */ xv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(xv0 xv0Var, Context context) {
        super(xv0Var, context);
        this.h = xv0Var;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.h;
        qu0 W = xv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        xv0Var.I.l();
    }
}
