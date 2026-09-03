package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b51(w61 w61Var, boolean z4, int i10) {
        this.a = i10;
        this.b = w61Var;
        this.c = z4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w61 w61Var = this.b;
                t51 t51Var = w61Var.e0;
                i51 i51Var = w61Var.f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                t51Var.setAlpha(f10);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                i51Var.setAlpha(floatValue);
                i51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                w61Var.g0.setAlpha(i51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                w61 w61Var2 = this.b;
                w61Var2.g0.setAlpha(w61Var2.f0.getAlpha() * floatValue2);
                break;
        }
    }
}
