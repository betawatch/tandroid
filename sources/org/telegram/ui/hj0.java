package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hj0 extends ph.d {
    public final /* synthetic */ jj0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(jj0 jj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.e0 = jj0Var;
    }

    @Override // ph.d
    public final float a(float f10, float f11) {
        jj0 jj0Var = this.e0;
        boolean z4 = jj0Var.k0 == 0.0f;
        jj0Var.k0 = f10;
        if (z4) {
            jj0Var.l0 = new gg.o2(jj0Var, 2);
            jj0Var.S(false);
        }
        return f10;
    }
}
