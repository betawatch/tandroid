package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v61 b;

    public /* synthetic */ i61(v61 v61Var, int i7) {
        this.a = i7;
        this.b = v61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v61 v61Var = this.b;
                v61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v61Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (v61Var.D) {
                        v61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        v61Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        v61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        v61Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    v61Var.c = floatValue;
                    v61Var.x(true);
                    k61 k61Var = v61Var.M;
                    if (k61Var != null) {
                        k61Var.w.invalidate();
                        v61Var.M.w.g1();
                        v61Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                v61 v61Var2 = this.b;
                v61Var2.getClass();
                v61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                v61 v61Var3 = this.b;
                v61Var3.N.onAnimationUpdate(valueAnimator);
                v61Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var3.M.w.g1();
                v61Var3.M.invalidate();
                break;
            default:
                v61 v61Var4 = this.b;
                v61Var4.getClass();
                v61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
