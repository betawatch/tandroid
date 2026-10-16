package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ nd0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b;
                ah0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.c.setAlpha(floatValue);
                ah0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                ah0 ah0Var2 = this.b;
                ah0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                ah0Var2.V.setScaleX(f7);
                ah0Var2.V.setScaleY(f7);
                ah0Var2.V.setAlpha(floatValue2);
                break;
            default:
                ah0 ah0Var3 = this.b;
                ah0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var3.c.setAlpha(floatValue3);
                ah0Var3.c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                break;
        }
    }
}
