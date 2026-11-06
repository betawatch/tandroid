package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gu0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.fu0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i7;
                gu0 gu0Var = gu0.this;
                int i10 = gu0Var.a;
                if (i10 <= 0 || (i7 = gu0Var.b) <= 0) {
                    gu0Var.end();
                    return;
                }
                int i11 = i10 - 1;
                gu0Var.a = i11;
                if (gu0Var.c != null) {
                    float[] fArr = gu0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        gu0Var.end();
                        return;
                    }
                    float interpolation = gu0Var.getInterpolator().getInterpolation(1.0f - (i11 / i7));
                    float[] fArr2 = gu0Var.e;
                    float f10 = fArr2[0];
                    gu0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    gu0Var.c.onAnimationUpdate(gu0Var);
                }
            }
        });
        int duration = (int) (getDuration() / org.telegram.messenger.g0.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
