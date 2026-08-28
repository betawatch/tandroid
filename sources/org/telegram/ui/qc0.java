package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ qc0(fg0 fg0Var, int i9) {
        this.a = i9;
        this.b = fg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.c.setAlpha(floatValue);
                fg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                fg0 fg0Var2 = this.b;
                fg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.c.setAlpha(floatValue2);
                fg0Var2.c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                fg0 fg0Var3 = this.b;
                fg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                fg0Var3.R.setScaleX(f10);
                fg0Var3.R.setScaleY(f10);
                fg0Var3.R.setAlpha(floatValue3);
                break;
        }
    }
}
