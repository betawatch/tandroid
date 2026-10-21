package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e91 b;

    public /* synthetic */ s81(e91 e91Var, int i10) {
        this.a = i10;
        this.b = e91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e91 e91Var = this.b;
                e91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = e91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (e91Var.y) {
                        e91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        e91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        e91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        e91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    e91Var.c = floatValue;
                    e91Var.w(true);
                    u81 u81Var = e91Var.M;
                    if (u81Var != null) {
                        u81Var.v.invalidate();
                        e91Var.M.v.f1();
                        e91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                e91 e91Var2 = this.b;
                e91Var2.getClass();
                e91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                e91 e91Var3 = this.b;
                e91Var3.N.onAnimationUpdate(valueAnimator);
                e91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e91Var3.M.v.f1();
                e91Var3.M.invalidate();
                break;
            default:
                e91 e91Var4 = this.b;
                e91Var4.getClass();
                e91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
