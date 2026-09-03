package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ v0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                a1Var.getClass();
                a1Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.invalidate();
                break;
            case 1:
                a1 a1Var2 = this.b;
                a1Var2.getClass();
                a1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = a1Var2.F + AndroidUtilities.dp(28.0f);
                float dp2 = a1Var2.G + AndroidUtilities.dp(52.0f);
                float f10 = a1Var2.y;
                a1Var2.D = dp - (dp * f10);
                a1Var2.E = dp2 - (f10 * dp2);
                a1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1 a1Var3 = this.b;
                a1Var3.B = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                y0 y0Var = a1Var3.c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * a1Var3.B));
                y0Var.requestLayout();
                break;
            default:
                a1 a1Var4 = this.b;
                a1Var4.getClass();
                a1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var4.e();
                break;
        }
    }
}
