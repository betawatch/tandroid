package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;

    public /* synthetic */ w20(a30 a30Var, int i10) {
        this.a = i10;
        this.b = a30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var = this.b;
                a30Var.r.x = (int) floatValue;
                a30Var.h();
                y20 y20Var = a30Var.a;
                if (y20Var.getParent() != null) {
                    a30Var.n.updateViewLayout(y20Var, a30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var2 = this.b;
                a30Var2.r.y = (int) floatValue2;
                y20 y20Var2 = a30Var2.a;
                if (y20Var2.getParent() != null) {
                    a30Var2.n.updateViewLayout(y20Var2, a30Var2.r);
                    break;
                }
                break;
        }
    }
}
