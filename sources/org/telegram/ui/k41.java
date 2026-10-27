package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k41(f61 f61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = f61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f61 f61Var = this.b;
                c51 c51Var = f61Var.h0;
                s41 s41Var = f61Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                c51Var.setAlpha(f7);
                c51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                s41Var.setAlpha(floatValue);
                s41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                f61Var.j0.setAlpha(s41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                f61 f61Var2 = this.b;
                f61Var2.j0.setAlpha(f61Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
