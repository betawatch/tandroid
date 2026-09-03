package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ cd0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                og0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var.c.setAlpha(floatValue);
                og0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                og0 og0Var2 = this.b;
                og0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var2.c.setAlpha(floatValue2);
                og0Var2.c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                og0 og0Var3 = this.b;
                og0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                og0Var3.S.setScaleX(f10);
                og0Var3.S.setScaleY(f10);
                og0Var3.S.setAlpha(floatValue3);
                break;
        }
    }
}
