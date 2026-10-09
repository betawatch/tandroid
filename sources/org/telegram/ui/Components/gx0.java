package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gx0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.fx0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j3, long j10) {
                int i10;
                gx0 gx0Var = gx0.this;
                int i11 = gx0Var.a;
                if (i11 <= 0 || (i10 = gx0Var.b) <= 0) {
                    gx0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                gx0Var.a = i12;
                if (gx0Var.c != null) {
                    float[] fArr = gx0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        gx0Var.end();
                        return;
                    }
                    float interpolation = gx0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = gx0Var.e;
                    float f7 = fArr2[0];
                    gx0Var.d = Float.valueOf(((fArr2[1] - f7) * interpolation) + f7);
                    gx0Var.c.onAnimationUpdate(gx0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
