package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;

    public /* synthetic */ o10(s10 s10Var, int i7) {
        this.a = i7;
        this.b = s10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var = this.b;
                s10Var.s.x = (int) floatValue;
                s10Var.i();
                q10 q10Var = s10Var.a;
                if (q10Var.getParent() != null) {
                    s10Var.n.updateViewLayout(q10Var, s10Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var2 = this.b;
                s10Var2.s.y = (int) floatValue2;
                q10 q10Var2 = s10Var2.a;
                if (q10Var2.getParent() != null) {
                    s10Var2.n.updateViewLayout(q10Var2, s10Var2.s);
                    break;
                }
                break;
        }
    }
}
