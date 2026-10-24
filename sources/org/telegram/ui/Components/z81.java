package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l91 b;

    public /* synthetic */ z81(l91 l91Var, int i10) {
        this.a = i10;
        this.b = l91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l91 l91Var = this.b;
                l91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = l91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (l91Var.y) {
                        l91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        l91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        l91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        l91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    l91Var.c = floatValue;
                    l91Var.w(true);
                    b91 b91Var = l91Var.M;
                    if (b91Var != null) {
                        b91Var.v.invalidate();
                        l91Var.M.v.g1();
                        l91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                l91 l91Var2 = this.b;
                l91Var2.getClass();
                l91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                l91 l91Var3 = this.b;
                l91Var3.N.onAnimationUpdate(valueAnimator);
                l91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l91Var3.M.v.g1();
                l91Var3.M.invalidate();
                break;
            default:
                l91 l91Var4 = this.b;
                l91Var4.getClass();
                l91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
