package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ms0 extends ju0 {
    public final /* synthetic */ qv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(qv0 qv0Var, Context context) {
        super(context);
        this.M = qv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ju0 ju0Var;
        super.setTranslationX(f7);
        qv0 qv0Var = this.M;
        ju0[] ju0VarArr = qv0Var.k0;
        if (qv0Var.g1 && (ju0Var = ju0VarArr[0]) == this) {
            float abs = Math.abs(ju0Var.getTranslationX()) / ju0VarArr[0].getMeasuredWidth();
            qv0Var.Z0(abs, ju0VarArr[1].F);
            if (qv0Var.D()) {
                int i10 = qv0Var.x0;
                if (i10 == 2) {
                    qv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    qv0Var.o0 = abs;
                }
                qv0Var.s1(abs);
                float a02 = qv0Var.a0(abs);
                qv0Var.p0 = a02;
                qv0Var.r0.setVisibility((a02 == 0.0f || !qv0Var.D() || qv0Var.q0()) ? 4 : 0);
            } else {
                qv0Var.o0 = 0.0f;
            }
            qv0Var.q1(false);
        }
        qv0Var.I();
        qv0Var.K();
        qv0Var.o0();
    }
}
