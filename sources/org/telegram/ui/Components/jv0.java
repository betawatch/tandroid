package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jv0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.iv0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                jv0 jv0Var = jv0.this;
                int i11 = jv0Var.a;
                if (i11 <= 0 || (i10 = jv0Var.b) <= 0) {
                    jv0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                jv0Var.a = i12;
                if (jv0Var.c != null) {
                    float[] fArr = jv0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        jv0Var.end();
                        return;
                    }
                    float interpolation = jv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = jv0Var.e;
                    float f7 = fArr2[0];
                    jv0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    jv0Var.c.onAnimationUpdate(jv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.i0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
