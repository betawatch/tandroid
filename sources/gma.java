// default package

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gma extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: fma
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                int i;
                gma gmaVar = gma.this;
                int i2 = gmaVar.a;
                if (i2 <= 0 || (i = gmaVar.b) <= 0) {
                    gmaVar.end();
                    return;
                }
                int i3 = i2 - 1;
                gmaVar.a = i3;
                if (gmaVar.c != null) {
                    float[] fArr = gmaVar.e;
                    if (fArr == null || fArr.length != 2) {
                        gmaVar.end();
                        return;
                    }
                    float interpolation = gmaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                    float[] fArr2 = gmaVar.e;
                    float f = fArr2[0];
                    gmaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                    gmaVar.c.onAnimationUpdate(gmaVar);
                }
            }
        });
        int duration = (int) (getDuration() / gl.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
