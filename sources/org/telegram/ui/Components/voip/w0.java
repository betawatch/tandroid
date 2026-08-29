package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ w0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                b1Var.getClass();
                b1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                break;
            case 1:
                b1 b1Var2 = this.b;
                b1Var2.getClass();
                b1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = b1Var2.E + AndroidUtilities.dp(28.0f);
                float dp2 = b1Var2.F + AndroidUtilities.dp(52.0f);
                float f9 = b1Var2.y;
                b1Var2.C = dp - (dp * f9);
                b1Var2.D = dp2 - (f9 * dp2);
                b1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1 b1Var3 = this.b;
                b1Var3.A = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = b1Var3.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * b1Var3.A));
                z0Var.requestLayout();
                break;
            default:
                b1 b1Var4 = this.b;
                b1Var4.getClass();
                b1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var4.e();
                break;
        }
    }
}
