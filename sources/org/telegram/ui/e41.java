package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z51 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e41(z51 z51Var, boolean z10, int i10) {
        this.a = i10;
        this.b = z51Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z51 z51Var = this.b;
                w41 w41Var = z51Var.h0;
                m41 m41Var = z51Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w41Var.setAlpha(f7);
                w41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m41Var.setAlpha(floatValue);
                m41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z51Var.j0.setAlpha(m41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z51 z51Var2 = this.b;
                z51Var2.j0.setAlpha(z51Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
