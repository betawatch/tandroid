package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c91 b;

    public /* synthetic */ q81(c91 c91Var, int i10) {
        this.a = i10;
        this.b = c91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c91 c91Var = this.b;
                c91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = c91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (c91Var.y) {
                        c91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        c91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        c91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        c91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    c91Var.c = floatValue;
                    c91Var.w(true);
                    s81 s81Var = c91Var.M;
                    if (s81Var != null) {
                        s81Var.v.invalidate();
                        c91Var.M.v.f1();
                        c91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                c91 c91Var2 = this.b;
                c91Var2.getClass();
                c91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                c91 c91Var3 = this.b;
                c91Var3.N.onAnimationUpdate(valueAnimator);
                c91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var3.M.v.f1();
                c91Var3.M.invalidate();
                break;
            default:
                c91 c91Var4 = this.b;
                c91Var4.getClass();
                c91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
