package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j81 b;

    public /* synthetic */ x71(j81 j81Var, int i10) {
        this.a = i10;
        this.b = j81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j81 j81Var = this.b;
                j81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = j81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (j81Var.y) {
                        j81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        j81Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        j81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        j81Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    j81Var.c = floatValue;
                    j81Var.x(true);
                    z71 z71Var = j81Var.M;
                    if (z71Var != null) {
                        z71Var.v.invalidate();
                        j81Var.M.v.g1();
                        j81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                j81 j81Var2 = this.b;
                j81Var2.getClass();
                j81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                j81 j81Var3 = this.b;
                j81Var3.N.onAnimationUpdate(valueAnimator);
                j81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j81Var3.M.v.g1();
                j81Var3.M.invalidate();
                break;
            default:
                j81 j81Var4 = this.b;
                j81Var4.getClass();
                j81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
