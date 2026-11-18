package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pu0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.ou0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                pu0 pu0Var = pu0.this;
                int i10 = pu0Var.a;
                if (i10 <= 0 || (i7 = pu0Var.b) <= 0) {
                    pu0Var.end();
                    return;
                }
                int i11 = i10 - 1;
                pu0Var.a = i11;
                if (pu0Var.c != null) {
                    float[] fArr = pu0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        pu0Var.end();
                        return;
                    }
                    float interpolation = pu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                    float[] fArr2 = pu0Var.e;
                    float f10 = fArr2[0];
                    pu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    pu0Var.c.onAnimationUpdate(pu0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.g0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
