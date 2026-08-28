package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ q(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.b;
                l4Var2.U0 = floatValue;
                l4Var2.m0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.l0);
                break;
        }
    }
}
