package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dj0 extends ei.d {
    public final /* synthetic */ fj0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(fj0 fj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true);
        this.k0 = fj0Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        fj0 fj0Var = this.k0;
        boolean z10 = fj0Var.n0 == 0.0f;
        fj0Var.n0 = f7;
        if (z10) {
            fj0Var.o0 = new org.telegram.ui.Components.nb0(fj0Var, 1);
            fj0Var.S(false);
        }
        return f7;
    }
}
