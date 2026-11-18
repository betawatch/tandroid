package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;

    public /* synthetic */ u61(g71 g71Var, int i7) {
        this.a = i7;
        this.b = g71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g71 g71Var = this.b;
                g71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = g71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (g71Var.E) {
                        g71Var.B(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        g71Var.B(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        g71Var.B(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        g71Var.B(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    g71Var.c = floatValue;
                    g71Var.t(true);
                    w61 w61Var = g71Var.N;
                    if (w61Var != null) {
                        w61Var.w.invalidate();
                        g71Var.N.w.g1();
                        g71Var.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                g71 g71Var2 = this.b;
                g71Var2.getClass();
                g71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                g71 g71Var3 = this.b;
                g71Var3.O.onAnimationUpdate(valueAnimator);
                g71Var3.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var3.N.w.g1();
                g71Var3.N.invalidate();
                break;
            default:
                g71 g71Var4 = this.b;
                g71Var4.getClass();
                g71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
