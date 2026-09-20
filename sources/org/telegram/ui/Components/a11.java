package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class a11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b11 b;

    public /* synthetic */ a11(b11 b11Var, int i10) {
        this.a = i10;
        this.b = b11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b11 b11Var = this.b;
                b11Var.getClass();
                b11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.invalidate();
                break;
            case 1:
                b11 b11Var2 = this.b;
                b11Var2.getClass();
                b11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var2.invalidate();
                break;
            case 2:
                b11 b11Var3 = this.b;
                b11Var3.getClass();
                b11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var3.invalidate();
                break;
            case 3:
                b11 b11Var4 = this.b;
                b11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var4.s = floatValue;
                b11Var4.w = (int) ((b11Var4.h * floatValue) + 0);
                b11Var4.invalidate();
                break;
            default:
                b11 b11Var5 = this.b;
                b11Var5.getClass();
                b11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var5.x = b11Var5.r + ((int) Math.ceil((b11Var5.n - r1) * r5));
                b11Var5.invalidate();
                break;
        }
    }
}
