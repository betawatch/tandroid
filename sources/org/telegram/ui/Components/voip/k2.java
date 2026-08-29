package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ k2(o2 o2Var, int i10) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2 o2Var = this.b;
                WindowManager.LayoutParams layoutParams = o2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(o2Var.c, o2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2 o2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = o2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(o2Var2.c, o2Var2.a, layoutParams2);
                break;
        }
    }
}
