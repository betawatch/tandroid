package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ f20(j20 j20Var, int i9) {
        this.a = i9;
        this.b = j20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j20 j20Var = this.b;
                j20Var.r.x = (int) floatValue;
                j20Var.h();
                h20 h20Var = j20Var.a;
                if (h20Var.getParent() != null) {
                    j20Var.n.updateViewLayout(h20Var, j20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j20 j20Var2 = this.b;
                j20Var2.r.y = (int) floatValue2;
                h20 h20Var2 = j20Var2.a;
                if (h20Var2.getParent() != null) {
                    j20Var2.n.updateViewLayout(h20Var2, j20Var2.r);
                    break;
                }
                break;
        }
    }
}
