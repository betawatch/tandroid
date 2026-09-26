package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ j2(n2 n2Var, int i10) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var = this.b;
                WindowManager.LayoutParams layoutParams = n2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(n2Var.c, n2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = n2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(n2Var2.c, n2Var2.a, layoutParams2);
                break;
        }
    }
}
