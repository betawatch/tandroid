package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m81 b;

    public /* synthetic */ a81(m81 m81Var, int i10) {
        this.a = i10;
        this.b = m81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m81 m81Var = this.b;
                m81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = m81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (m81Var.y) {
                        m81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        m81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        m81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        m81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    m81Var.c = floatValue;
                    m81Var.w(true);
                    c81 c81Var = m81Var.J;
                    if (c81Var != null) {
                        c81Var.v.invalidate();
                        m81Var.J.v.f1();
                        m81Var.J.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                m81 m81Var2 = this.b;
                m81Var2.getClass();
                m81Var2.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                m81 m81Var3 = this.b;
                m81Var3.K.onAnimationUpdate(valueAnimator);
                m81Var3.J.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m81Var3.J.v.f1();
                m81Var3.J.invalidate();
                break;
            default:
                m81 m81Var4 = this.b;
                m81Var4.getClass();
                m81Var4.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
