package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public /* synthetic */ o3(q3 q3Var, int i10) {
        this.a = i10;
        this.b = q3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3 q3Var = this.b;
                q3Var.n = floatValue;
                q3Var.k.invalidate();
                if (q3Var.n > 1.0f && q3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    q3Var.r = ofInt;
                    ofInt.addUpdateListener(new o3(q3Var, 2));
                    q3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    q3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q3 q3Var2 = this.b;
                q3Var2.m = intValue;
                q3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q3 q3Var3 = this.b;
                if (q3Var3.i <= q3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                q3Var3.p = intValue2;
                q3Var3.k.invalidate();
                break;
        }
    }
}
