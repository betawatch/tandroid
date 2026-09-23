package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h61 extends rg.b1 {
    public final /* synthetic */ i61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(i61 i61Var, Context context) {
        super(context, 2, null);
        this.M = i61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        i61 i61Var = this.M;
        if (i61Var.getParent() instanceof View) {
            ((View) i61Var.getParent()).invalidate();
        }
    }
}
