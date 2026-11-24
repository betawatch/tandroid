// default package

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hoa extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: goa
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                int i;
                hoa hoaVar = hoa.this;
                int i2 = hoaVar.a;
                if (i2 <= 0 || (i = hoaVar.b) <= 0) {
                    hoaVar.end();
                    return;
                }
                int i3 = i2 - 1;
                hoaVar.a = i3;
                if (hoaVar.c != null) {
                    float[] fArr = hoaVar.e;
                    if (fArr == null || fArr.length != 2) {
                        hoaVar.end();
                        return;
                    }
                    float interpolation = hoaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                    float[] fArr2 = hoaVar.e;
                    float f = fArr2[0];
                    hoaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                    hoaVar.c.onAnimationUpdate(hoaVar);
                }
            }
        });
        int duration = (int) (getDuration() / gm.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
