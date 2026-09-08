package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.bw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                cw0 cw0Var = cw0.this;
                int i11 = cw0Var.a;
                if (i11 <= 0 || (i10 = cw0Var.b) <= 0) {
                    cw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                cw0Var.a = i12;
                if (cw0Var.c != null) {
                    float[] fArr = cw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        cw0Var.end();
                        return;
                    }
                    float interpolation = cw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = cw0Var.e;
                    float f7 = fArr2[0];
                    cw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    cw0Var.c.onAnimationUpdate(cw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
