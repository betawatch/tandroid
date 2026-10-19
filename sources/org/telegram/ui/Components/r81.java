package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d91 b;

    public /* synthetic */ r81(d91 d91Var, int i10) {
        this.a = i10;
        this.b = d91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d91 d91Var = this.b;
                d91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = d91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (d91Var.y) {
                        d91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        d91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        d91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        d91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    d91Var.c = floatValue;
                    d91Var.w(true);
                    t81 t81Var = d91Var.M;
                    if (t81Var != null) {
                        t81Var.v.invalidate();
                        d91Var.M.v.f1();
                        d91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                d91 d91Var2 = this.b;
                d91Var2.getClass();
                d91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                d91 d91Var3 = this.b;
                d91Var3.N.onAnimationUpdate(valueAnimator);
                d91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var3.M.v.f1();
                d91Var3.M.invalidate();
                break;
            default:
                d91 d91Var4 = this.b;
                d91Var4.getClass();
                d91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
