package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gs0 extends du0 {
    public final /* synthetic */ kv0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(kv0 kv0Var, Context context) {
        super(context);
        this.M = kv0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        du0 du0Var;
        super.setTranslationX(f7);
        kv0 kv0Var = this.M;
        du0[] du0VarArr = kv0Var.k0;
        if (kv0Var.g1 && (du0Var = du0VarArr[0]) == this) {
            float abs = Math.abs(du0Var.getTranslationX()) / du0VarArr[0].getMeasuredWidth();
            kv0Var.Z0(abs, du0VarArr[1].F);
            if (kv0Var.D()) {
                int i10 = kv0Var.x0;
                if (i10 == 2) {
                    kv0Var.o0 = 1.0f - abs;
                } else if (i10 == 1) {
                    kv0Var.o0 = abs;
                }
                kv0Var.s1(abs);
                float a02 = kv0Var.a0(abs);
                kv0Var.p0 = a02;
                kv0Var.r0.setVisibility((a02 == 0.0f || !kv0Var.D() || kv0Var.q0()) ? 4 : 0);
            } else {
                kv0Var.o0 = 0.0f;
            }
            kv0Var.q1(false);
        }
        kv0Var.I();
        kv0Var.K();
        kv0Var.o0();
    }
}
