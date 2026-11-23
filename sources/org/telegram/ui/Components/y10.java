package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ y10(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c20 c20Var = this.b;
                c20Var.s.x = (int) floatValue;
                c20Var.i();
                a20 a20Var = c20Var.a;
                if (a20Var.getParent() != null) {
                    c20Var.n.updateViewLayout(a20Var, c20Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c20 c20Var2 = this.b;
                c20Var2.s.y = (int) floatValue2;
                a20 a20Var2 = c20Var2.a;
                if (a20Var2.getParent() != null) {
                    c20Var2.n.updateViewLayout(a20Var2, c20Var2.s);
                    break;
                }
                break;
        }
    }
}
