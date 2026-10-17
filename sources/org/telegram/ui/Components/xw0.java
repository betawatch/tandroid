package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class xw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.ww0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                xw0 xw0Var = xw0.this;
                int i11 = xw0Var.a;
                if (i11 <= 0 || (i10 = xw0Var.b) <= 0) {
                    xw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                xw0Var.a = i12;
                if (xw0Var.c != null) {
                    float[] fArr = xw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        xw0Var.end();
                        return;
                    }
                    float interpolation = xw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = xw0Var.e;
                    float f7 = fArr2[0];
                    xw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    xw0Var.c.onAnimationUpdate(xw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
