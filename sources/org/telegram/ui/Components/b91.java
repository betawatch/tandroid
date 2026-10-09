package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ b91(o91 o91Var, int i10) {
        this.a = i10;
        this.b = o91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o91 o91Var = this.b;
                o91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = o91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (o91Var.y) {
                        o91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        o91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        o91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        o91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    o91Var.c = floatValue;
                    o91Var.w(true);
                    d91 d91Var = o91Var.M;
                    if (d91Var != null) {
                        d91Var.v.invalidate();
                        o91Var.M.v.f1();
                        o91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                o91 o91Var2 = this.b;
                o91Var2.getClass();
                o91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                o91 o91Var3 = this.b;
                o91Var3.N.onAnimationUpdate(valueAnimator);
                o91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o91Var3.M.v.f1();
                o91Var3.M.invalidate();
                break;
            default:
                o91 o91Var4 = this.b;
                o91Var4.getClass();
                o91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
