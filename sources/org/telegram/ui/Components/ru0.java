package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ru0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.qu0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                ru0 ru0Var = ru0.this;
                int i10 = ru0Var.a;
                if (i10 <= 0 || (i7 = ru0Var.b) <= 0) {
                    ru0Var.end();
                    return;
                }
                int i11 = i10 - 1;
                ru0Var.a = i11;
                if (ru0Var.c != null) {
                    float[] fArr = ru0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        ru0Var.end();
                        return;
                    }
                    float interpolation = ru0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                    float[] fArr2 = ru0Var.e;
                    float f10 = fArr2[0];
                    ru0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    ru0Var.c.onAnimationUpdate(ru0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.g0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
