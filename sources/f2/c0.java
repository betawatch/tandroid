package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.ll;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i9) {
        this.a = i9;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
                return f10 * f10 * f10 * f10 * f10;
            case 1:
            case 2:
            case 4:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 3:
                return (float) Math.pow(f10, 2.0d);
            default:
                if (f10 < 0.33f) {
                    return (f10 / 0.33f) * 0.1f;
                }
                float f12 = f10 - 0.33f;
                return f12 < 0.33f ? ll.c(f12, 0.34f, 0.15f, 0.1f) : (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }
}
