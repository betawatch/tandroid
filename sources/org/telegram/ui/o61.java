package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class o61 extends rg.b1 {
    public final /* synthetic */ p61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context) {
        super(context, 2, null);
        this.M = p61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        p61 p61Var = this.M;
        if (p61Var.getParent() instanceof View) {
            ((View) p61Var.getParent()).invalidate();
        }
    }
}
