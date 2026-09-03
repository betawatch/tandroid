package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l81 b;

    public /* synthetic */ z71(l81 l81Var, int i10) {
        this.a = i10;
        this.b = l81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l81 l81Var = this.b;
                l81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = l81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (l81Var.y) {
                        l81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        l81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        l81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        l81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    l81Var.c = floatValue;
                    l81Var.w(true);
                    b81 b81Var = l81Var.J;
                    if (b81Var != null) {
                        b81Var.v.invalidate();
                        l81Var.J.v.e1();
                        l81Var.J.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                l81 l81Var2 = this.b;
                l81Var2.getClass();
                l81Var2.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                l81 l81Var3 = this.b;
                l81Var3.K.onAnimationUpdate(valueAnimator);
                l81Var3.J.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l81Var3.J.v.e1();
                l81Var3.J.invalidate();
                break;
            default:
                l81 l81Var4 = this.b;
                l81Var4.getClass();
                l81Var4.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
