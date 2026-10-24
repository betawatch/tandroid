package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ts0 extends qu0 {
    public final /* synthetic */ xv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(xv0 xv0Var, Context context) {
        super(context);
        this.M = xv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        qu0 qu0Var;
        super.setTranslationX(f7);
        xv0 xv0Var = this.M;
        qu0[] qu0VarArr = xv0Var.k0;
        if (xv0Var.g1 && (qu0Var = qu0VarArr[0]) == this) {
            float abs = Math.abs(qu0Var.getTranslationX()) / qu0VarArr[0].getMeasuredWidth();
            xv0Var.c1(abs, qu0VarArr[1].F);
            if (xv0Var.E()) {
                int i10 = xv0Var.x0;
                if (i10 == 2) {
                    xv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    xv0Var.o0 = abs;
                }
                xv0Var.x1(abs);
                float b02 = xv0Var.b0(abs);
                xv0Var.p0 = b02;
                xv0Var.r0.setVisibility((b02 == 0.0f || !xv0Var.E() || xv0Var.s0()) ? 4 : 0);
            } else {
                xv0Var.o0 = 0.0f;
            }
            xv0Var.u1(false);
        }
        xv0Var.J();
        xv0Var.L();
        xv0Var.q0();
    }
}
