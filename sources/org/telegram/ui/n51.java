package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n51(h71 h71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = h71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h71 h71Var = this.b;
                e61 e61Var = h71Var.h0;
                u51 u51Var = h71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                e61Var.setAlpha(f7);
                e61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                u51Var.setAlpha(floatValue);
                u51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                h71Var.j0.setAlpha(u51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                h71 h71Var2 = this.b;
                h71Var2.j0.setAlpha(h71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
