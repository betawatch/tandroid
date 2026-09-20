package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ zw0(cx0 cx0Var, int i10) {
        this.a = i10;
        this.b = cx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cx0 cx0Var = this.b;
                cx0Var.getClass();
                cx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                break;
            case 1:
                cx0 cx0Var2 = this.b;
                cx0Var2.getClass();
                cx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cx0 cx0Var3 = this.b;
                cx0Var3.getClass();
                cx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var3.invalidate();
                break;
        }
    }
}
