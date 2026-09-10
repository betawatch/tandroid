package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ a3(c3 c3Var, int i10) {
        this.a = i10;
        this.b = c3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                c3Var.getClass();
                c3Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var.invalidate();
                c3Var.T.c();
                break;
            case 1:
                c3 c3Var2 = this.b;
                c3Var2.getClass();
                c3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var2.invalidate();
                c3Var2.T.c();
                break;
            case 2:
                c3 c3Var3 = this.b;
                c3Var3.getClass();
                c3Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var3.invalidate();
                c3Var3.T.c();
                break;
            case 3:
                c3 c3Var4 = this.b;
                c3Var4.getClass();
                c3Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var4.invalidate();
                break;
            case 4:
                c3 c3Var5 = this.b;
                c3Var5.getClass();
                c3Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var5.invalidate();
                break;
            default:
                c3 c3Var6 = this.b;
                c3Var6.getClass();
                c3Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c3Var6.invalidate();
                break;
        }
    }
}
