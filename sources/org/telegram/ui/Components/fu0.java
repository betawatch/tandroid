package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fu0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.eu0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i3;
                fu0 fu0Var = fu0.this;
                int i10 = fu0Var.a;
                if (i10 <= 0 || (i3 = fu0Var.b) <= 0) {
                    fu0Var.end();
                    return;
                }
                int i11 = i10 - 1;
                fu0Var.a = i11;
                if (fu0Var.c != null) {
                    float[] fArr = fu0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        fu0Var.end();
                        return;
                    }
                    float interpolation = fu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i3));
                    float[] fArr2 = fu0Var.e;
                    float f10 = fArr2[0];
                    fu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    fu0Var.c.onAnimationUpdate(fu0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.g0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
