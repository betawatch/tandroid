package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ c40 b;
    public final /* synthetic */ z40 c;

    public g40(z40 z40Var, boolean[] zArr, c40 c40Var) {
        this.c = z40Var;
        this.a = zArr;
        this.b = c40Var;
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
        z40 z40Var = this.c;
        z40Var.f.setRotationY(f10);
        z40Var.r0.setRotationY(f10);
    }
}
