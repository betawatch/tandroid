package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n20 b;

    public /* synthetic */ i20(n20 n20Var, int i10) {
        this.a = i10;
        this.b = n20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var = this.b;
                n20Var.r.x = (int) floatValue;
                n20Var.h();
                k20 k20Var = n20Var.a;
                if (k20Var.getParent() != null) {
                    n20Var.n.updateViewLayout(k20Var, n20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var2 = this.b;
                n20Var2.r.y = (int) floatValue2;
                k20 k20Var2 = n20Var2.a;
                if (k20Var2.getParent() != null) {
                    n20Var2.n.updateViewLayout(k20Var2, n20Var2.r);
                    break;
                }
                break;
        }
    }
}
