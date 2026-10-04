package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class t81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g91 b;

    public /* synthetic */ t81(g91 g91Var, int i10) {
        this.a = i10;
        this.b = g91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g91 g91Var = this.b;
                g91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = g91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (g91Var.y) {
                        g91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        g91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        g91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        g91Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    g91Var.c = floatValue;
                    g91Var.x(true);
                    v81 v81Var = g91Var.M;
                    if (v81Var != null) {
                        v81Var.v.invalidate();
                        g91Var.M.v.h1();
                        g91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                g91 g91Var2 = this.b;
                g91Var2.getClass();
                g91Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                g91 g91Var3 = this.b;
                g91Var3.N.onAnimationUpdate(valueAnimator);
                g91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var3.M.v.h1();
                g91Var3.M.invalidate();
                break;
            default:
                g91 g91Var4 = this.b;
                g91Var4.getClass();
                g91Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
