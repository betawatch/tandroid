package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tr0 extends qt0 {
    public final /* synthetic */ xu0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(xu0 xu0Var, Context context) {
        super(context);
        this.M = xu0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        qt0 qt0Var;
        super.setTranslationX(f7);
        xu0 xu0Var = this.M;
        qt0[] qt0VarArr = xu0Var.k0;
        if (xu0Var.g1 && (qt0Var = qt0VarArr[0]) == this) {
            float abs = Math.abs(qt0Var.getTranslationX()) / qt0VarArr[0].getMeasuredWidth();
            xu0Var.Z0(abs, qt0VarArr[1].F);
            if (xu0Var.D()) {
                int i10 = xu0Var.x0;
                if (i10 == 2) {
                    xu0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    xu0Var.o0 = abs;
                }
                xu0Var.s1(abs);
                float a02 = xu0Var.a0(abs);
                xu0Var.p0 = a02;
                xu0Var.r0.setVisibility((a02 == 0.0f || !xu0Var.D() || xu0Var.q0()) ? 4 : 0);
            } else {
                xu0Var.o0 = 0.0f;
            }
            xu0Var.q1(false);
        }
        xu0Var.I();
        xu0Var.K();
        xu0Var.o0();
    }
}
