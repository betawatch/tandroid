package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ pc0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                dg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.c.setAlpha(floatValue);
                dg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                dg0 dg0Var2 = this.b;
                dg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                dg0Var2.V.setScaleX(f7);
                dg0Var2.V.setScaleY(f7);
                dg0Var2.V.setAlpha(floatValue2);
                break;
            default:
                dg0 dg0Var3 = this.b;
                dg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var3.c.setAlpha(floatValue3);
                dg0Var3.c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                break;
        }
    }
}
