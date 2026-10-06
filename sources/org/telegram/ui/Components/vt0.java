package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class vt0 extends kv0 {
    public final /* synthetic */ qv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(qv0 qv0Var, Context context) {
        super(qv0Var, context);
        this.h = qv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        qv0 qv0Var = this.h;
        ju0 W = qv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        qv0Var.I.l();
    }
}
