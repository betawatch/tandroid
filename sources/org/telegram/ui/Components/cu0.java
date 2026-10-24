package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cu0 extends rv0 {
    public final /* synthetic */ xv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(xv0 xv0Var, Context context) {
        super(xv0Var, context);
        this.h = xv0Var;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        xv0 xv0Var = this.h;
        qu0 X = xv0Var.X(0);
        if (X == null || X.r.getVisibility() != 0) {
            return;
        }
        xv0Var.I.l();
    }
}
