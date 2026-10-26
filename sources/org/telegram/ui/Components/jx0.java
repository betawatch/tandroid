package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jx0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.ix0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                jx0 jx0Var = jx0.this;
                int i11 = jx0Var.a;
                if (i11 <= 0 || (i10 = jx0Var.b) <= 0) {
                    jx0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                jx0Var.a = i12;
                if (jx0Var.c != null) {
                    float[] fArr = jx0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        jx0Var.end();
                        return;
                    }
                    float interpolation = jx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = jx0Var.e;
                    float f7 = fArr2[0];
                    jx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    jx0Var.c.onAnimationUpdate(jx0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
