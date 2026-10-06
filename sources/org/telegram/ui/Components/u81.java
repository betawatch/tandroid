package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class u81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h91 b;

    public /* synthetic */ u81(h91 h91Var, int i10) {
        this.a = i10;
        this.b = h91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h91 h91Var = this.b;
                h91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = h91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (h91Var.y) {
                        h91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        h91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        h91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        h91Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    h91Var.c = floatValue;
                    h91Var.x(true);
                    w81 w81Var = h91Var.M;
                    if (w81Var != null) {
                        w81Var.v.invalidate();
                        h91Var.M.v.g1();
                        h91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                h91 h91Var2 = this.b;
                h91Var2.getClass();
                h91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                h91 h91Var3 = this.b;
                h91Var3.N.onAnimationUpdate(valueAnimator);
                h91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h91Var3.M.v.g1();
                h91Var3.M.invalidate();
                break;
            default:
                h91 h91Var4 = this.b;
                h91Var4.getClass();
                h91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
