package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ r30 b;
    public final /* synthetic */ o40 c;

    public v30(o40 o40Var, boolean[] zArr, r30 r30Var) {
        this.c = o40Var;
        this.a = zArr;
        this.b = r30Var;
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
        float f10 = floatValue * 180.0f;
        o40 o40Var = this.c;
        o40Var.f.setRotationY(f10);
        o40Var.q0.setRotationY(f10);
    }
}
