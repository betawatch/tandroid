package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ m3(o3 o3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.b;
                o3Var.n = floatValue;
                o3Var.k.invalidate();
                if (o3Var.n > 1.0f && o3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.b;
                o3Var2.m = intValue;
                o3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.b;
                if (o3Var3.i <= o3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.p = intValue2;
                o3Var3.k.invalidate();
                break;
        }
    }
}
