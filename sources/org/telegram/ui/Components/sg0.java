package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ sg0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                vg0Var.getClass();
                vg0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.c(true);
                break;
            default:
                vg0 vg0Var2 = this.b;
                vg0Var2.getClass();
                vg0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.c(true);
                break;
        }
    }
}
