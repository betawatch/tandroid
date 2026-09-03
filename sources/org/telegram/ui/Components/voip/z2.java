package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ z2(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.e = intValue;
                a3Var.f = intValue;
                a3Var.h = intValue;
                a3Var.n = intValue;
                a3Var.invalidate();
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.e = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.n = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                break;
        }
    }
}
