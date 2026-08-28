package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lv0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.kv0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i9;
                lv0 lv0Var = lv0.this;
                int i10 = lv0Var.a;
                if (i10 <= 0 || (i9 = lv0Var.b) <= 0) {
                    lv0Var.end();
                    return;
                }
                int i11 = i10 - 1;
                lv0Var.a = i11;
                if (lv0Var.c != null) {
                    float[] fArr = lv0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        lv0Var.end();
                        return;
                    }
                    float interpolation = lv0Var.getInterpolator().getInterpolation(1.0f - (i11 / i9));
                    float[] fArr2 = lv0Var.e;
                    float f10 = fArr2[0];
                    lv0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    lv0Var.c.onAnimationUpdate(lv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
