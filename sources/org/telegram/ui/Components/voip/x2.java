package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ x2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.d = intValue;
                y2Var.e = intValue;
                y2Var.f = intValue;
                y2Var.h = intValue;
                y2Var.n = intValue;
                y2Var.invalidate();
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.d = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(56.0f), floatValue);
                y2Var2.e = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.f = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(60.0f), floatValue);
                y2Var2.h = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.n = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(64.0f), floatValue);
                y2Var2.r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                y2Var2.s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                y2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                y2Var2.w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                y2Var2.x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                y2Var2.invalidate();
                break;
        }
    }
}
