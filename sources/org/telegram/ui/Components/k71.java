package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ k71(w71 w71Var, int i10) {
        this.a = i10;
        this.b = w71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w71 w71Var = this.b;
                w71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (w71Var.D) {
                        w71Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        w71Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        w71Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        w71Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    w71Var.c = floatValue;
                    w71Var.x(true);
                    m71 m71Var = w71Var.M;
                    if (m71Var != null) {
                        m71Var.w.invalidate();
                        w71Var.M.w.g1();
                        w71Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                w71 w71Var2 = this.b;
                w71Var2.getClass();
                w71Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                w71 w71Var3 = this.b;
                w71Var3.N.onAnimationUpdate(valueAnimator);
                w71Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var3.M.w.g1();
                w71Var3.M.invalidate();
                break;
            default:
                w71 w71Var4 = this.b;
                w71Var4.getClass();
                w71Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
