package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ e50 b;
    public final /* synthetic */ c60 c;

    public i50(c60 c60Var, boolean[] zArr, e50 e50Var) {
        this.c = c60Var;
        this.a = zArr;
        this.b = e50Var;
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
        c60 c60Var = this.c;
        c60Var.h.setRotationY(f7);
        c60Var.r0.setRotationY(f7);
    }
}
