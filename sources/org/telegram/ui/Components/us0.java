package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class us0 extends ku0 {
    public final /* synthetic */ qu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(qu0 qu0Var, Context context) {
        super(qu0Var, context);
        this.h = qu0Var;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        qu0 qu0Var = this.h;
        it0 W = qu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        qu0Var.E.l();
    }
}
