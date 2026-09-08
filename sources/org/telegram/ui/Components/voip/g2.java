package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ g2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var = this.b;
                WindowManager.LayoutParams layoutParams = k2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(k2Var.c, k2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = k2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(k2Var2.c, k2Var2.a, layoutParams2);
                break;
        }
    }
}
