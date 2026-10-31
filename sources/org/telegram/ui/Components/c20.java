package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g20 b;

    public /* synthetic */ c20(g20 g20Var, int i10) {
        this.a = i10;
        this.b = g20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g20 g20Var = this.b;
                g20Var.r.x = (int) floatValue;
                g20Var.h();
                e20 e20Var = g20Var.a;
                if (e20Var.getParent() != null) {
                    g20Var.n.updateViewLayout(e20Var, g20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g20 g20Var2 = this.b;
                g20Var2.r.y = (int) floatValue2;
                e20 e20Var2 = g20Var2.a;
                if (e20Var2.getParent() != null) {
                    g20Var2.n.updateViewLayout(e20Var2, g20Var2.r);
                    break;
                }
                break;
        }
    }
}
