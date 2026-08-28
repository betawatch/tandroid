package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i41(b61 b61Var, boolean z10, int i9) {
        this.a = i9;
        this.b = b61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b61 b61Var = this.b;
                y41 y41Var = b61Var.d0;
                o41 o41Var = b61Var.e0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                y41Var.setAlpha(f10);
                y41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                o41Var.setAlpha(floatValue);
                o41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                b61Var.f0.setAlpha(o41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                b61 b61Var2 = this.b;
                b61Var2.f0.setAlpha(b61Var2.e0.getAlpha() * floatValue2);
                break;
        }
    }
}
