// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gm4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100.0d, -1.0d)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100.0d, -(1.0f - f)))) * this.a);
    }
}
