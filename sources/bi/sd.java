package bi;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sd implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ sd(int i7) {
        this.a = i7;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
                return (float) Math.pow(f10, 2.0d);
            case 1:
            case 4:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 2:
                if (f10 < 0.33f) {
                    return (f10 / 0.33f) * 0.1f;
                }
                float f12 = f10 - 0.33f;
                return f12 < 0.33f ? org.telegram.messenger.camera.q.v(f12, 0.34f, 0.15f, 0.1f) : (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 3:
                return f10 * f10 * f10 * f10 * f10;
        }
    }
}
