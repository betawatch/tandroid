package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ f3(i3 i3Var, int i9) {
        this.a = i9;
        this.b = i3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i3 i3Var = this.b;
                i3Var.getClass();
                i3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                break;
            case 1:
                i3 i3Var2 = this.b;
                i3Var2.getClass();
                i3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                break;
            case 2:
                i3 i3Var3 = this.b;
                i3Var3.getClass();
                i3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                break;
            default:
                i3 i3Var4 = this.b;
                i3Var4.getClass();
                i3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                break;
        }
    }
}
