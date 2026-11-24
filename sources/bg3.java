// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bg3 implements Interpolator {
    public final /* synthetic */ byte a;

    public /* synthetic */ bg3(byte b) {
        this.a = b;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                if (f < 0.33f) {
                    return (f / 0.33f) * 0.1f;
                }
                float f2 = f - 0.33f;
                return f2 < 0.33f ? hg9.x(f2, 0.34f, 0.15f, 0.1f) : (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return f * f * f * f * f;
            case 2:
            case 3:
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            case 4:
                return (float) Math.pow(f, 2.0d);
        }
    }
}
