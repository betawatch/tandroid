package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ h2(l2 l2Var, int i10) {
        this.a = i10;
        this.b = l2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var = this.b;
                WindowManager.LayoutParams layoutParams = l2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(l2Var.c, l2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = l2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(l2Var2.c, l2Var2.a, layoutParams2);
                break;
        }
    }
}
