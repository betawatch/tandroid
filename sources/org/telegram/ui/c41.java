package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x51 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c41(x51 x51Var, boolean z10, int i10) {
        this.a = i10;
        this.b = x51Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x51 x51Var = this.b;
                u41 u41Var = x51Var.h0;
                k41 k41Var = x51Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                u41Var.setAlpha(f7);
                u41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                k41Var.setAlpha(floatValue);
                k41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                x51Var.j0.setAlpha(k41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                x51 x51Var2 = this.b;
                x51Var2.j0.setAlpha(x51Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
