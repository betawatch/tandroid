package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ p1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1 t1Var = this.b;
                WindowManager.LayoutParams layoutParams = t1Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.i0.S3(t1Var.c, t1Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1 t1Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = t1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.i0.S3(t1Var2.c, t1Var2.a, layoutParams2);
                break;
        }
    }
}
