package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xt0 extends mv0 {
    public final /* synthetic */ sv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(sv0 sv0Var, Context context) {
        super(sv0Var, context);
        this.h = sv0Var;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        sv0 sv0Var = this.h;
        lu0 W = sv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        sv0Var.I.l();
    }
}
