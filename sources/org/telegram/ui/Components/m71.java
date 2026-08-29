package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ m71(z71 z71Var, int i10) {
        this.a = i10;
        this.b = z71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z71 z71Var = this.b;
                z71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = z71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (z71Var.y) {
                        z71Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        z71Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        z71Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        z71Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    z71Var.c = floatValue;
                    z71Var.w(true);
                    o71 o71Var = z71Var.I;
                    if (o71Var != null) {
                        o71Var.v.invalidate();
                        z71Var.I.v.f1();
                        z71Var.I.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                z71 z71Var2 = this.b;
                z71Var2.getClass();
                z71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                z71 z71Var3 = this.b;
                z71Var3.J.onAnimationUpdate(valueAnimator);
                z71Var3.I.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z71Var3.I.v.f1();
                z71Var3.I.invalidate();
                break;
            default:
                z71 z71Var4 = this.b;
                z71Var4.getClass();
                z71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
