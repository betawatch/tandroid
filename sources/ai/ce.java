package ai;

import android.view.animation.Interpolator;
import org.telegram.messenger.sl;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class ce implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ ce(int i10) {
        this.a = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
            case 0:
                return (float) Math.pow(f7, 2.0d);
            case 1:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f10 = f7 - 0.33f;
                return f10 < 0.33f ? sl.x(f10, 0.34f, 0.15f, 0.1f) : (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 2:
                return f7 * f7 * f7 * f7 * f7;
            case 3:
            case 4:
            default:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
