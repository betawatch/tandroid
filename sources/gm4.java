// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gm4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100.0d, -1.0d)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100.0d, -(1.0f - f)))) * this.a);
    }
}
