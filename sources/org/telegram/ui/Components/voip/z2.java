package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ z2(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                b3Var.getClass();
                b3Var.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var.invalidate();
                b3Var.P.c();
                break;
            case 1:
                b3 b3Var2 = this.b;
                b3Var2.getClass();
                b3Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.invalidate();
                b3Var2.P.c();
                break;
            case 2:
                b3 b3Var3 = this.b;
                b3Var3.getClass();
                b3Var3.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var3.invalidate();
                b3Var3.P.c();
                break;
            case 3:
                b3 b3Var4 = this.b;
                b3Var4.getClass();
                b3Var4.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var4.invalidate();
                break;
            case 4:
                b3 b3Var5 = this.b;
                b3Var5.getClass();
                b3Var5.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var5.invalidate();
                break;
            default:
                b3 b3Var6 = this.b;
                b3Var6.getClass();
                b3Var6.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var6.invalidate();
                break;
        }
    }
}
