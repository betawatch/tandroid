package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.ow0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                pw0 pw0Var = pw0.this;
                int i11 = pw0Var.a;
                if (i11 <= 0 || (i10 = pw0Var.b) <= 0) {
                    pw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                pw0Var.a = i12;
                if (pw0Var.c != null) {
                    float[] fArr = pw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        pw0Var.end();
                        return;
                    }
                    float interpolation = pw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = pw0Var.e;
                    float f7 = fArr2[0];
                    pw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    pw0Var.c.onAnimationUpdate(pw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
