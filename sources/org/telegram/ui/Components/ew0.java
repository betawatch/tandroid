package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ew0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.dw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                ew0 ew0Var = ew0.this;
                int i11 = ew0Var.a;
                if (i11 <= 0 || (i10 = ew0Var.b) <= 0) {
                    ew0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                ew0Var.a = i12;
                if (ew0Var.c != null) {
                    float[] fArr = ew0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        ew0Var.end();
                        return;
                    }
                    float interpolation = ew0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = ew0Var.e;
                    float f7 = fArr2[0];
                    ew0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    ew0Var.c.onAnimationUpdate(ew0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
