package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ow0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.nw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                ow0 ow0Var = ow0.this;
                int i11 = ow0Var.a;
                if (i11 <= 0 || (i10 = ow0Var.b) <= 0) {
                    ow0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                ow0Var.a = i12;
                if (ow0Var.c != null) {
                    float[] fArr = ow0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        ow0Var.end();
                        return;
                    }
                    float interpolation = ow0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = ow0Var.e;
                    float f7 = fArr2[0];
                    ow0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    ow0Var.c.onAnimationUpdate(ow0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
