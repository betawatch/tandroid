package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ a3(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                b3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var.d = intValue;
                b3Var.e = intValue;
                b3Var.f = intValue;
                b3Var.h = intValue;
                b3Var.n = intValue;
                b3Var.invalidate();
                break;
            default:
                b3 b3Var2 = this.b;
                b3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.d = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(56.0f), floatValue);
                b3Var2.e = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                b3Var2.f = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(60.0f), floatValue);
                b3Var2.h = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                b3Var2.n = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(64.0f), floatValue);
                b3Var2.r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                b3Var2.s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                b3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                b3Var2.w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                b3Var2.x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                b3Var2.invalidate();
                break;
        }
    }
}
