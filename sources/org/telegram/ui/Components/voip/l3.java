package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ l3(n3 n3Var, int i9) {
        this.a = i9;
        this.b = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3 n3Var = this.b;
                n3Var.n = floatValue;
                n3Var.k.invalidate();
                if (n3Var.n > 1.0f && n3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    n3Var.r = ofInt;
                    ofInt.addUpdateListener(new l3(n3Var, 2));
                    n3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    n3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var2 = this.b;
                n3Var2.m = intValue;
                n3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var3 = this.b;
                if (n3Var3.i <= n3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                n3Var3.p = intValue2;
                n3Var3.k.invalidate();
                break;
        }
    }
}
