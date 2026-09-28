package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y81 b;

    public /* synthetic */ l81(y81 y81Var, int i10) {
        this.a = i10;
        this.b = y81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y81 y81Var = this.b;
                y81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = y81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (y81Var.y) {
                        y81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        y81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        y81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        y81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    y81Var.c = floatValue;
                    y81Var.w(true);
                    n81 n81Var = y81Var.M;
                    if (n81Var != null) {
                        n81Var.v.invalidate();
                        y81Var.M.v.f1();
                        y81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                y81 y81Var2 = this.b;
                y81Var2.getClass();
                y81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                y81 y81Var3 = this.b;
                y81Var3.N.onAnimationUpdate(valueAnimator);
                y81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y81Var3.M.v.f1();
                y81Var3.M.invalidate();
                break;
            default:
                y81 y81Var4 = this.b;
                y81Var4.getClass();
                y81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
