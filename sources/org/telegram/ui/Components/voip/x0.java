package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                c1Var.getClass();
                c1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                break;
            case 1:
                c1 c1Var2 = this.b;
                c1Var2.getClass();
                c1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = c1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = c1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = c1Var2.y;
                c1Var2.G = dp - (dp * f7);
                c1Var2.H = dp2 - (f7 * dp2);
                c1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1 c1Var3 = this.b;
                c1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                a1 a1Var = c1Var3.c;
                a1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * c1Var3.E));
                a1Var.requestLayout();
                break;
            default:
                c1 c1Var4 = this.b;
                c1Var4.getClass();
                c1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var4.e();
                break;
        }
    }
}
