package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ g3(i3 i3Var, int i7) {
        this.a = i7;
        this.b = i3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3 i3Var = this.b;
                i3Var.n = floatValue;
                i3Var.k.invalidate();
                if (i3Var.n > 1.0f && i3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    i3Var.r = ofInt;
                    ofInt.addUpdateListener(new g3(i3Var, 2));
                    i3Var.r.setDuration(ks.V5 - valueAnimator.getCurrentPlayTime());
                    i3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var2 = this.b;
                i3Var2.m = intValue;
                i3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var3 = this.b;
                if (i3Var3.i <= i3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                i3Var3.p = intValue2;
                i3Var3.k.invalidate();
                break;
        }
    }
}
