package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iv0 extends TimeAnimator {
    public int a;
    public int b;
    public ValueAnimator.AnimatorUpdateListener c;
    public Float d;
    public float[] e;

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void end() {
        this.c = null;
        super.end();
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override // android.animation.ValueAnimator
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.e = fArr;
    }

    @Override // android.animation.TimeAnimator, android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.hv0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                iv0 iv0Var = iv0.this;
                int i11 = iv0Var.a;
                if (i11 <= 0 || (i10 = iv0Var.b) <= 0) {
                    iv0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                iv0Var.a = i12;
                if (iv0Var.c != null) {
                    float[] fArr = iv0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        iv0Var.end();
                        return;
                    }
                    float interpolation = iv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = iv0Var.e;
                    float f7 = fArr2[0];
                    iv0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    iv0Var.c.onAnimationUpdate(iv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.i0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
