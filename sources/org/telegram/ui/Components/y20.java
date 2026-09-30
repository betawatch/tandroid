package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c30 b;

    public /* synthetic */ y20(c30 c30Var, int i10) {
        this.a = i10;
        this.b = c30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.b;
                c30Var.r.x = (int) floatValue;
                c30Var.h();
                a30 a30Var = c30Var.a;
                if (a30Var.getParent() != null) {
                    c30Var.n.updateViewLayout(a30Var, c30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.b;
                c30Var2.r.y = (int) floatValue2;
                a30 a30Var2 = c30Var2.a;
                if (a30Var2.getParent() != null) {
                    c30Var2.n.updateViewLayout(a30Var2, c30Var2.r);
                    break;
                }
                break;
        }
    }
}
