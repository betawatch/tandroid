package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k41(d61 d61Var, boolean z10, int i10) {
        this.a = i10;
        this.b = d61Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d61 d61Var = this.b;
                a51 a51Var = d61Var.d0;
                q41 q41Var = d61Var.e0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f9 = 1.0f - floatValue;
                a51Var.setAlpha(f9);
                a51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                q41Var.setAlpha(floatValue);
                q41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f9);
                d61Var.f0.setAlpha(q41Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                d61 d61Var2 = this.b;
                d61Var2.f0.setAlpha(d61Var2.e0.getAlpha() * floatValue2);
                break;
        }
    }
}
