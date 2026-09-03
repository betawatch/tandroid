package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.y3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            case 3:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 4:
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
