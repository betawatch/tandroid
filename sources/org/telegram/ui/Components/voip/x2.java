package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ x2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.getClass();
                a3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                break;
            case 1:
                a3 a3Var2 = this.b;
                a3Var2.getClass();
                a3Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var2.invalidate();
                break;
            case 2:
                a3 a3Var3 = this.b;
                a3Var3.getClass();
                a3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                break;
            default:
                a3 a3Var4 = this.b;
                a3Var4.getClass();
                a3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                break;
        }
    }
}
