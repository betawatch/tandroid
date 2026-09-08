package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z20 b;

    public /* synthetic */ v20(z20 z20Var, int i10) {
        this.a = i10;
        this.b = z20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var = this.b;
                z20Var.r.x = (int) floatValue;
                z20Var.h();
                x20 x20Var = z20Var.a;
                if (x20Var.getParent() != null) {
                    z20Var.n.updateViewLayout(x20Var, z20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var2 = this.b;
                z20Var2.r.y = (int) floatValue2;
                x20 x20Var2 = z20Var2.a;
                if (x20Var2.getParent() != null) {
                    z20Var2.n.updateViewLayout(x20Var2, z20Var2.r);
                    break;
                }
                break;
        }
    }
}
