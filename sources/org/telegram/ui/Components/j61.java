package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;

    public /* synthetic */ j61(w61 w61Var, int i7) {
        this.a = i7;
        this.b = w61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w61 w61Var = this.b;
                w61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w61Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (w61Var.E) {
                        w61Var.D(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        w61Var.D(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        w61Var.D(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        w61Var.D(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    w61Var.c = floatValue;
                    w61Var.u(true);
                    l61 l61Var = w61Var.N;
                    if (l61Var != null) {
                        l61Var.w.invalidate();
                        w61Var.N.w.g1();
                        w61Var.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                w61 w61Var2 = this.b;
                w61Var2.getClass();
                w61Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                w61 w61Var3 = this.b;
                w61Var3.O.onAnimationUpdate(valueAnimator);
                w61Var3.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var3.N.w.g1();
                w61Var3.N.invalidate();
                break;
            default:
                w61 w61Var4 = this.b;
                w61Var4.getClass();
                w61Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
