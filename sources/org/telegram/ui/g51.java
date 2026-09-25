package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g51(a71 a71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = a71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a71 a71Var = this.b;
                x51 x51Var = a71Var.h0;
                n51 n51Var = a71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x51Var.setAlpha(f7);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n51Var.setAlpha(floatValue);
                n51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a71Var.j0.setAlpha(n51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a71 a71Var2 = this.b;
                a71Var2.j0.setAlpha(a71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
