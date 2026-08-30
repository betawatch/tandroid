package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fj0 extends ph.d {
    public final /* synthetic */ hj0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.e0 = hj0Var;
    }

    @Override // ph.d
    public final float a(float f10, float f11) {
        hj0 hj0Var = this.e0;
        boolean z4 = hj0Var.k0 == 0.0f;
        hj0Var.k0 = f10;
        if (z4) {
            hj0Var.l0 = new gg.o2(hj0Var, 2);
            hj0Var.S(false);
        }
        return f10;
    }
}
