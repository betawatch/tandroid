package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.cw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                dw0 dw0Var = dw0.this;
                int i11 = dw0Var.a;
                if (i11 <= 0 || (i10 = dw0Var.b) <= 0) {
                    dw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                dw0Var.a = i12;
                if (dw0Var.c != null) {
                    float[] fArr = dw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        dw0Var.end();
                        return;
                    }
                    float interpolation = dw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = dw0Var.e;
                    float f7 = fArr2[0];
                    dw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    dw0Var.c.onAnimationUpdate(dw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
