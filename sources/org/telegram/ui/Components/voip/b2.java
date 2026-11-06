package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ b2(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var = this.b;
                WindowManager.LayoutParams layoutParams = e2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.T3(e2Var.c, e2Var.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var2 = this.b;
                WindowManager.LayoutParams layoutParams2 = e2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.T3(e2Var2.c, e2Var2.a, layoutParams2);
                break;
        }
    }
}
