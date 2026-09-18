package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q61 extends rg.b1 {
    public final /* synthetic */ r61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(r61 r61Var, Context context) {
        super(context, 2, null);
        this.M = r61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        r61 r61Var = this.M;
        if (r61Var.getParent() instanceof View) {
            ((View) r61Var.getParent()).invalidate();
        }
    }
}
