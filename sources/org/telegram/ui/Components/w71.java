package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ w71(i81 i81Var, int i10) {
        this.a = i10;
        this.b = i81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i81 i81Var = this.b;
                i81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = i81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (i81Var.y) {
                        i81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        i81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        i81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        i81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    i81Var.c = floatValue;
                    i81Var.w(true);
                    y71 y71Var = i81Var.M;
                    if (y71Var != null) {
                        y71Var.v.invalidate();
                        i81Var.M.v.f1();
                        i81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                i81 i81Var2 = this.b;
                i81Var2.getClass();
                i81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                i81 i81Var3 = this.b;
                i81Var3.N.onAnimationUpdate(valueAnimator);
                i81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i81Var3.M.v.f1();
                i81Var3.M.invalidate();
                break;
            default:
                i81 i81Var4 = this.b;
                i81Var4.getClass();
                i81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
