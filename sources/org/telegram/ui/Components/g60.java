package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ g60(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m60 m60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * m60Var.getMeasuredHeight() * 0.5f;
                m60Var.w0 = floatValue;
                m60Var.v.setTranslationY(floatValue + m60Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m60 m60Var2 = this.b;
                m60Var2.y0 = floatValue2;
                si.u0 u0Var = m60Var2.P;
                if (u0Var != null) {
                    u0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
