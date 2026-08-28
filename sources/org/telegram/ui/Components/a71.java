package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;

    public /* synthetic */ a71(n71 n71Var, int i9) {
        this.a = i9;
        this.b = n71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n71 n71Var = this.b;
                n71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = n71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (n71Var.y) {
                        n71Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        n71Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        n71Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        n71Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    n71Var.c = floatValue;
                    n71Var.w(true);
                    c71 c71Var = n71Var.I;
                    if (c71Var != null) {
                        c71Var.v.invalidate();
                        n71Var.I.v.f1();
                        n71Var.I.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                n71 n71Var2 = this.b;
                n71Var2.getClass();
                n71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                n71 n71Var3 = this.b;
                n71Var3.J.onAnimationUpdate(valueAnimator);
                n71Var3.I.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var3.I.v.f1();
                n71Var3.I.invalidate();
                break;
            default:
                n71 n71Var4 = this.b;
                n71Var4.getClass();
                n71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
