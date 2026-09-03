package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ y2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.d = intValue;
                z2Var.e = intValue;
                z2Var.f = intValue;
                z2Var.h = intValue;
                z2Var.n = intValue;
                z2Var.invalidate();
                break;
            default:
                z2 z2Var2 = this.b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.d = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(56.0f), floatValue);
                z2Var2.e = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(60.0f), floatValue);
                z2Var2.h = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.n = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(64.0f), floatValue);
                z2Var2.r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                z2Var2.s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                z2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                z2Var2.w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                z2Var2.x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                z2Var2.invalidate();
                break;
        }
    }
}
