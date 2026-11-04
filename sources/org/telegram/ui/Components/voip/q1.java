package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ q1(u1 u1Var, int i3) {
        this.a = i3;
        this.b = u1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var = this.b;
                WindowManager.LayoutParams layoutParams = u1Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.T3(u1Var.c, u1Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = u1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.T3(u1Var2.c, u1Var2.a, layoutParams2);
                break;
        }
    }
}
