package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fw0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.ew0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                fw0 fw0Var = fw0.this;
                int i11 = fw0Var.a;
                if (i11 <= 0 || (i10 = fw0Var.b) <= 0) {
                    fw0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                fw0Var.a = i12;
                if (fw0Var.c != null) {
                    float[] fArr = fw0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        fw0Var.end();
                        return;
                    }
                    float interpolation = fw0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = fw0Var.e;
                    float f10 = fArr2[0];
                    fw0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    fw0Var.c.onAnimationUpdate(fw0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
