package org.telegram.ui.Components;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nv0 extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: org.telegram.ui.Components.mv0
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
                int i10;
                nv0 nv0Var = nv0.this;
                int i11 = nv0Var.a;
                if (i11 <= 0 || (i10 = nv0Var.b) <= 0) {
                    nv0Var.end();
                    return;
                }
                int i12 = i11 - 1;
                nv0Var.a = i12;
                if (nv0Var.c != null) {
                    float[] fArr = nv0Var.e;
                    if (fArr == null || fArr.length != 2) {
                        nv0Var.end();
                        return;
                    }
                    float interpolation = nv0Var.getInterpolator().getInterpolation(1.0f - (i12 / i10));
                    float[] fArr2 = nv0Var.e;
                    float f10 = fArr2[0];
                    nv0Var.d = Float.valueOf(((fArr2[1] - f10) * interpolation) + f10);
                    nv0Var.c.onAnimationUpdate(nv0Var);
                }
            }
        });
        int duration = (int) (getDuration() / AndroidUtilities.screenRefreshTime);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
