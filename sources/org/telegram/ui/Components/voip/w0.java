package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
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
                b1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                break;
            case 1:
                b1 b1Var2 = this.b;
                b1Var2.getClass();
                b1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = b1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = b1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = b1Var2.y;
                b1Var2.G = dp - (dp * f7);
                b1Var2.H = dp2 - (f7 * dp2);
                b1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1 b1Var3 = this.b;
                b1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = b1Var3.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * b1Var3.E));
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
