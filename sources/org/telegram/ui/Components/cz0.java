package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz0 b;

    public /* synthetic */ cz0(dz0 dz0Var, int i7) {
        this.a = i7;
        this.b = dz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dz0 dz0Var = this.b;
                dz0Var.getClass();
                dz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var.invalidate();
                break;
            case 1:
                dz0 dz0Var2 = this.b;
                dz0Var2.getClass();
                dz0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var2.invalidate();
                break;
            case 2:
                dz0 dz0Var3 = this.b;
                dz0Var3.getClass();
                dz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var3.invalidate();
                break;
            case 3:
                dz0 dz0Var4 = this.b;
                dz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var4.s = floatValue;
                dz0Var4.x = (int) ((dz0Var4.h * floatValue) + 0);
                dz0Var4.invalidate();
                break;
            default:
                dz0 dz0Var5 = this.b;
                dz0Var5.getClass();
                dz0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var5.y = dz0Var5.r + ((int) Math.ceil((dz0Var5.n - r1) * r5));
                dz0Var5.invalidate();
                break;
        }
    }
}
