package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j51(c71 c71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = c71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c71 c71Var = this.b;
                z51 z51Var = c71Var.h0;
                p51 p51Var = c71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z51Var.setAlpha(f7);
                z51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p51Var.setAlpha(floatValue);
                p51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c71Var.j0.setAlpha(p51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c71 c71Var2 = this.b;
                c71Var2.j0.setAlpha(c71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
