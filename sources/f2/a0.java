package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.y3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a0 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i10) {
        this.a = i10;
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
                return f12 < 0.33f ? y3.A(f12, 0.34f, 0.15f, 0.1f) : (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }
}
