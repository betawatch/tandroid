// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oe3 implements Interpolator {
    public final /* synthetic */ byte a;

    public /* synthetic */ oe3(byte b) {
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
                return f2 < 0.33f ? de9.x(f2, 0.34f, 0.15f, 0.1f) : (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
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
