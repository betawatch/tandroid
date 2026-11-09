package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;

    public /* synthetic */ l10(q10 q10Var, int i7) {
        this.a = i7;
        this.b = q10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q10 q10Var = this.b;
                q10Var.s.x = (int) floatValue;
                q10Var.i();
                n10 n10Var = q10Var.a;
                if (n10Var.getParent() != null) {
                    q10Var.n.updateViewLayout(n10Var, q10Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q10 q10Var2 = this.b;
                q10Var2.s.y = (int) floatValue2;
                n10 n10Var2 = q10Var2.a;
                if (n10Var2.getParent() != null) {
                    q10Var2.n.updateViewLayout(n10Var2, q10Var2.s);
                    break;
                }
                break;
        }
    }
}
