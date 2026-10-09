package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p51(k71 k71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = k71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k71 k71Var = this.b;
                h61 h61Var = k71Var.h0;
                x51 x51Var = k71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                h61Var.setAlpha(f7);
                h61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                x51Var.setAlpha(floatValue);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                k71Var.j0.setAlpha(x51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                k71 k71Var2 = this.b;
                k71Var2.j0.setAlpha(k71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
