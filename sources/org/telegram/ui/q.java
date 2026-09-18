package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ q(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                h4Var.getClass();
                h4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4 h4Var2 = this.b;
                h4Var2.Y0 = floatValue;
                h4Var2.q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + h4Var2.p0);
                break;
        }
    }
}
