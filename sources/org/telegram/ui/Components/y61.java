package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k71 b;

    public /* synthetic */ y61(k71 k71Var, int i7) {
        this.a = i7;
        this.b = k71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k71 k71Var = this.b;
                k71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = k71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (k71Var.E) {
                        k71Var.D(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        k71Var.D(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        k71Var.D(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        k71Var.D(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    k71Var.c = floatValue;
                    k71Var.u(true);
                    a71 a71Var = k71Var.N;
                    if (a71Var != null) {
                        a71Var.w.invalidate();
                        k71Var.N.w.g1();
                        k71Var.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                k71 k71Var2 = this.b;
                k71Var2.getClass();
                k71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                k71 k71Var3 = this.b;
                k71Var3.O.onAnimationUpdate(valueAnimator);
                k71Var3.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k71Var3.N.w.g1();
                k71Var3.N.invalidate();
                break;
            default:
                k71 k71Var4 = this.b;
                k71Var4.getClass();
                k71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
