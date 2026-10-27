package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v91 b;

    public /* synthetic */ j91(v91 v91Var, int i10) {
        this.a = i10;
        this.b = v91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v91 v91Var = this.b;
                v91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (v91Var.y) {
                        v91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        v91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        v91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        v91Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    v91Var.c = floatValue;
                    v91Var.x(true);
                    l91 l91Var = v91Var.M;
                    if (l91Var != null) {
                        l91Var.v.invalidate();
                        v91Var.M.v.g1();
                        v91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                v91 v91Var2 = this.b;
                v91Var2.getClass();
                v91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                v91 v91Var3 = this.b;
                v91Var3.N.onAnimationUpdate(valueAnimator);
                v91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var3.M.v.g1();
                v91Var3.M.invalidate();
                break;
            default:
                v91 v91Var4 = this.b;
                v91Var4.getClass();
                v91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
