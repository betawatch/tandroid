package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ j40 b;
    public final /* synthetic */ e50 c;

    public n40(e50 e50Var, boolean[] zArr, j40 j40Var) {
        this.c = e50Var;
        this.a = zArr;
        this.b = j40Var;
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
        e50 e50Var = this.c;
        e50Var.f.setRotationY(f7);
        e50Var.q0.setRotationY(f7);
    }
}
