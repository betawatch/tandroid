package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vv0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.uv0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                vv0 vv0Var = vv0.this;
                int i11 = vv0Var.a;
                if (i11 <= 0 || (i10 = vv0Var.b) <= 0) {
                    vv0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                vv0Var.a = i12;
                if (vv0Var.c != null) {
                    float[] fArr = vv0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        vv0Var.end();
                        return;
                    }
                    float interpolation = vv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = vv0Var.e;
                    float f9 = fArr2[0];
                    vv0Var.d = Float.valueOf(((fArr2[1] - f9) * interpolation) + f9);
                    vv0Var.c.onAnimationUpdate(vv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
