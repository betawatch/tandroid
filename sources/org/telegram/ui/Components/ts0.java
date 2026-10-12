package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
            xv0Var.Z0(abs, qu0VarArr[1].F);
            if (xv0Var.D()) {
                int i10 = xv0Var.x0;
                if (i10 == 2) {
                    xv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    xv0Var.o0 = abs;
                }
                xv0Var.s1(abs);
                float a02 = xv0Var.a0(abs);
                xv0Var.p0 = a02;
                xv0Var.r0.setVisibility((a02 == 0.0f || !xv0Var.D() || xv0Var.q0()) ? 4 : 0);
            } else {
                xv0Var.o0 = 0.0f;
            }
            xv0Var.q1(false);
        }
        xv0Var.I();
        xv0Var.K();
        xv0Var.o0();
    }
}
