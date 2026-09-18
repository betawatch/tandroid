package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x81 b;

    public /* synthetic */ k81(x81 x81Var, int i10) {
        this.a = i10;
        this.b = x81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x81 x81Var = this.b;
                x81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = x81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (x81Var.y) {
                        x81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        x81Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        x81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        x81Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    x81Var.c = floatValue;
                    x81Var.x(true);
                    m81 m81Var = x81Var.M;
                    if (m81Var != null) {
                        m81Var.v.invalidate();
                        x81Var.M.v.g1();
                        x81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                x81 x81Var2 = this.b;
                x81Var2.getClass();
                x81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                x81 x81Var3 = this.b;
                x81Var3.N.onAnimationUpdate(valueAnimator);
                x81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var3.M.v.g1();
                x81Var3.M.invalidate();
                break;
            default:
                x81 x81Var4 = this.b;
                x81Var4.getClass();
                x81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
