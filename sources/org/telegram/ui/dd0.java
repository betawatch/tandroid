package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ dd0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                qg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.c.setAlpha(floatValue);
                qg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                qg0 qg0Var2 = this.b;
                qg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.c.setAlpha(floatValue2);
                qg0Var2.c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                qg0 qg0Var3 = this.b;
                qg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                qg0Var3.V.setScaleX(f7);
                qg0Var3.V.setScaleY(f7);
                qg0Var3.V.setAlpha(floatValue3);
                break;
        }
    }
}
