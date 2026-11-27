// default package

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dqa extends TimeAnimator {
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
        setTimeListener(new TimeAnimator.TimeListener() { // from class: cqa
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                int i;
                dqa dqaVar = dqa.this;
                int i2 = dqaVar.a;
                if (i2 <= 0 || (i = dqaVar.b) <= 0) {
                    dqaVar.end();
                    return;
                }
                int i3 = i2 - 1;
                dqaVar.a = i3;
                if (dqaVar.c != null) {
                    float[] fArr = dqaVar.e;
                    if (fArr == null || fArr.length != 2) {
                        dqaVar.end();
                        return;
                    }
                    float interpolation = dqaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                    float[] fArr2 = dqaVar.e;
                    float f = fArr2[0];
                    dqaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                    dqaVar.c.onAnimationUpdate(dqaVar);
                }
            }
        });
        int duration = (int) (getDuration() / hl.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
