package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.getClass();
                d1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                break;
            case 1:
                d1 d1Var2 = this.b;
                d1Var2.getClass();
                d1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = d1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = d1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = d1Var2.y;
                d1Var2.G = dp - (dp * f7);
                d1Var2.H = dp2 - (f7 * dp2);
                d1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1 d1Var3 = this.b;
                d1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = d1Var3.c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * d1Var3.E));
                b1Var.requestLayout();
                break;
            default:
                d1 d1Var4 = this.b;
                d1Var4.getClass();
                d1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var4.e();
                break;
        }
    }
}
