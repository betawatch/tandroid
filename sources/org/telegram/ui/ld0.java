package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ ld0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yg0 yg0Var = this.b;
                yg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var.c.setAlpha(floatValue);
                yg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                yg0 yg0Var2 = this.b;
                yg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var2.c.setAlpha(floatValue2);
                yg0Var2.c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                yg0 yg0Var3 = this.b;
                yg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                yg0Var3.V.setScaleX(f7);
                yg0Var3.V.setScaleY(f7);
                yg0Var3.V.setAlpha(floatValue3);
                break;
        }
    }
}
