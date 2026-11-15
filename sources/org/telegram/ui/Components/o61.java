package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o61(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v61 v61Var = (v61) this.b;
                v61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.setAnimationIdicatorProgress(floatValue);
                u61 u61Var = v61Var.E;
                if (u61Var != null) {
                    ((cf) u61Var).q(floatValue);
                    break;
                }
                break;
            default:
                m60 m60Var = (m60) this.b;
                m60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k60 k60Var = m60Var.x;
                if (k60Var != null) {
                    k60Var.setProgress(floatValue2);
                    break;
                }
                break;
        }
    }
}
