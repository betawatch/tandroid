package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.pw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                qw0 qw0Var = qw0.this;
                int i11 = qw0Var.a;
                if (i11 <= 0 || (i10 = qw0Var.b) <= 0) {
                    qw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                qw0Var.a = i12;
                if (qw0Var.c != null) {
                    float[] fArr = qw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        qw0Var.end();
                        return;
                    }
                    float interpolation = qw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = qw0Var.e;
                    float f7 = fArr2[0];
                    qw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    qw0Var.c.onAnimationUpdate(qw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
