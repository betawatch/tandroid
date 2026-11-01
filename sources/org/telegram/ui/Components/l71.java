package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ l71(x71 x71Var, int i10) {
        this.a = i10;
        this.b = x71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.b;
                x71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = x71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (x71Var.D) {
                        x71Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        x71Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        x71Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        x71Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    x71Var.c = floatValue;
                    x71Var.x(true);
                    n71 n71Var = x71Var.M;
                    if (n71Var != null) {
                        n71Var.w.invalidate();
                        x71Var.M.w.g1();
                        x71Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                x71 x71Var2 = this.b;
                x71Var2.getClass();
                x71Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                x71 x71Var3 = this.b;
                x71Var3.N.onAnimationUpdate(valueAnimator);
                x71Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var3.M.w.g1();
                x71Var3.M.invalidate();
                break;
            default:
                x71 x71Var4 = this.b;
                x71Var4.getClass();
                x71Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
