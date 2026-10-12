package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cx0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.bx0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                cx0 cx0Var = cx0.this;
                int i11 = cx0Var.a;
                if (i11 <= 0 || (i10 = cx0Var.b) <= 0) {
                    cx0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                cx0Var.a = i12;
                if (cx0Var.c != null) {
                    float[] fArr = cx0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        cx0Var.end();
                        return;
                    }
                    float interpolation = cx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = cx0Var.e;
                    float f7 = fArr2[0];
                    cx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    cx0Var.c.onAnimationUpdate(cx0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
