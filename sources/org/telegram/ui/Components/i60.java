package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ i60(o60 o60Var, int i10) {
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
                o60Var.s.setTranslationY(floatValue + o60Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o60 o60Var2 = this.b;
                o60Var2.y0 = floatValue2;
                vi.u0 u0Var = o60Var2.O;
                if (u0Var != null) {
                    u0Var.x(floatValue2);
                    break;
                }
                break;
        }
    }
}
