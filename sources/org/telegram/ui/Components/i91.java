package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;

    public /* synthetic */ i91(u91 u91Var, int i10) {
        this.a = i10;
        this.b = u91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u91 u91Var = this.b;
                u91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = u91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (u91Var.y) {
                        u91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        u91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        u91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        u91Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    u91Var.c = floatValue;
                    u91Var.x(true);
                    k91 k91Var = u91Var.M;
                    if (k91Var != null) {
                        k91Var.v.invalidate();
                        u91Var.M.v.g1();
                        u91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                u91 u91Var2 = this.b;
                u91Var2.getClass();
                u91Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                u91 u91Var3 = this.b;
                u91Var3.N.onAnimationUpdate(valueAnimator);
                u91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u91Var3.M.v.g1();
                u91Var3.M.invalidate();
                break;
            default:
                u91 u91Var4 = this.b;
                u91Var4.getClass();
                u91Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
