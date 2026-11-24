// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cm4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100.0d, -1.0d)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100.0d, -(1.0f - f)))) * this.a);
    }
}
