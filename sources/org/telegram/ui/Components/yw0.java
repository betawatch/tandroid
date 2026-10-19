package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.xw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                yw0 yw0Var = yw0.this;
                int i11 = yw0Var.a;
                if (i11 <= 0 || (i10 = yw0Var.b) <= 0) {
                    yw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                yw0Var.a = i12;
                if (yw0Var.c != null) {
                    float[] fArr = yw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        yw0Var.end();
                        return;
                    }
                    float interpolation = yw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = yw0Var.e;
                    float f7 = fArr2[0];
                    yw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    yw0Var.c.onAnimationUpdate(yw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
