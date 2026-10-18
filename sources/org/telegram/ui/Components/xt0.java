package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
