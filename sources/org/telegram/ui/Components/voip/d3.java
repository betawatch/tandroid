package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ d3(f3 f3Var, int i7) {
        this.a = i7;
        this.b = f3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.b;
                f3Var.n = floatValue;
                f3Var.k.invalidate();
                if (f3Var.n > 1.0f && f3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.b;
                f3Var2.m = intValue;
                f3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.b;
                if (f3Var3.i <= f3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.p = intValue2;
                f3Var3.k.invalidate();
                break;
        }
    }
}
