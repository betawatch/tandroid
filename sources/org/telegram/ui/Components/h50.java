package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ d50 b;
    public final /* synthetic */ w50 c;

    public h50(w50 w50Var, boolean[] zArr, d50 d50Var) {
        this.c = w50Var;
        this.a = zArr;
        this.b = d50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w50 w50Var = this.c;
        w50Var.b.setRotationY(f7);
        w50Var.m0.setRotationY(f7);
    }
}
