package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ q1(u1 u1Var, int i10) {
        this.a = i10;
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
                org.telegram.messenger.i0.S3(u1Var.c, u1Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = u1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.i0.S3(u1Var2.c, u1Var2.a, layoutParams2);
                break;
        }
    }
}
