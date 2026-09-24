package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ j81(w81 w81Var, int i10) {
        this.a = i10;
        this.b = w81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w81 w81Var = this.b;
                w81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (w81Var.y) {
                        w81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        w81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        w81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        w81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    w81Var.c = floatValue;
                    w81Var.w(true);
                    l81 l81Var = w81Var.M;
                    if (l81Var != null) {
                        l81Var.v.invalidate();
                        w81Var.M.v.f1();
                        w81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                w81 w81Var2 = this.b;
                w81Var2.getClass();
                w81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                w81 w81Var3 = this.b;
                w81Var3.N.onAnimationUpdate(valueAnimator);
                w81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var3.M.v.f1();
                w81Var3.M.invalidate();
                break;
            default:
                w81 w81Var4 = this.b;
                w81Var4.getClass();
                w81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
