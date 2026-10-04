package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.yw0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                zw0 zw0Var = zw0.this;
                int i11 = zw0Var.a;
                if (i11 <= 0 || (i10 = zw0Var.b) <= 0) {
                    zw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                zw0Var.a = i12;
                if (zw0Var.c != null) {
                    float[] fArr = zw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        zw0Var.end();
                        return;
                    }
                    float interpolation = zw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = zw0Var.e;
                    float f7 = fArr2[0];
                    zw0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    zw0Var.c.onAnimationUpdate(zw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
