package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kx0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.jx0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                kx0 kx0Var = kx0.this;
                int i11 = kx0Var.a;
                if (i11 <= 0 || (i10 = kx0Var.b) <= 0) {
                    kx0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                kx0Var.a = i12;
                if (kx0Var.c != null) {
                    float[] fArr = kx0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        kx0Var.end();
                        return;
                    }
                    float interpolation = kx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = kx0Var.e;
                    float f7 = fArr2[0];
                    kx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    kx0Var.c.onAnimationUpdate(kx0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
