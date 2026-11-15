package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ f2(i2 i2Var, int i7) {
        this.a = i7;
        this.b = i2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var = this.b;
                WindowManager.LayoutParams layoutParams = i2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.S3(i2Var.c, i2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = i2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.S3(i2Var2.c, i2Var2.a, layoutParams2);
                break;
        }
    }
}
