package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p61 extends rg.b1 {
    public final /* synthetic */ q61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(q61 q61Var, Context context) {
        super(context, 2, null);
        this.M = q61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        q61 q61Var = this.M;
        if (q61Var.getParent() instanceof View) {
            ((View) q61Var.getParent()).invalidate();
        }
    }
}
