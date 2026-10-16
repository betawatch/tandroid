package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ j60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o60 o60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o60Var.getMeasuredHeight() * 0.5f;
                o60Var.w0 = floatValue;
                o60Var.v.setTranslationY(floatValue + o60Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o60 o60Var2 = this.b;
                o60Var2.y0 = floatValue2;
                ri.r0 r0Var = o60Var2.P;
                if (r0Var != null) {
                    r0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
