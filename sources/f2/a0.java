package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.x3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i10) {
        this.a = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.a) {
            case 0:
                return f9 * f9 * f9 * f9 * f9;
            case 1:
            case 2:
            case 4:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 3:
                return (float) Math.pow(f9, 2.0d);
            default:
                if (f9 < 0.33f) {
                    return (f9 / 0.33f) * 0.1f;
                }
                float f11 = f9 - 0.33f;
                return f11 < 0.33f ? x3.A(f11, 0.34f, 0.15f, 0.1f) : (((f11 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }
}
