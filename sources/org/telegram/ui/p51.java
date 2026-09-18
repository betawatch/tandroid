package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p51(i71 i71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = i71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i71 i71Var = this.b;
                f61 f61Var = i71Var.h0;
                v51 v51Var = i71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                f61Var.setAlpha(f7);
                f61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                v51Var.setAlpha(floatValue);
                v51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                i71Var.j0.setAlpha(v51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                i71 i71Var2 = this.b;
                i71Var2.j0.setAlpha(i71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
