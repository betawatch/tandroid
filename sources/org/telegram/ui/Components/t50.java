package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ p50 b;
    public final /* synthetic */ o60 c;

    public t50(o60 o60Var, boolean[] zArr, p50 p50Var) {
        this.c = o60Var;
        this.a = zArr;
        this.b = p50Var;
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
        o60 o60Var = this.c;
        o60Var.h.setRotationY(f7);
        o60Var.r0.setRotationY(f7);
    }
}
