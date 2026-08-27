package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p71 b;

    public /* synthetic */ c71(p71 p71Var, int i10) {
        this.a = i10;
        this.b = p71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p71 p71Var = this.b;
                p71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = p71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (p71Var.y) {
                        p71Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        p71Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        p71Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        p71Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    p71Var.c = floatValue;
                    p71Var.w(true);
                    e71 e71Var = p71Var.I;
                    if (e71Var != null) {
                        e71Var.v.invalidate();
                        p71Var.I.v.f1();
                        p71Var.I.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                p71 p71Var2 = this.b;
                p71Var2.getClass();
                p71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                p71 p71Var3 = this.b;
                p71Var3.J.onAnimationUpdate(valueAnimator);
                p71Var3.I.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p71Var3.I.v.f1();
                p71Var3.I.invalidate();
                break;
            default:
                p71 p71Var4 = this.b;
                p71Var4.getClass();
                p71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
