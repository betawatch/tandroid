package a5;

import android.view.animation.Interpolator;
import org.telegram.messenger.wh;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
            case 0:
            case 4:
            default:
                float f10 = f7 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 1:
                return (float) Math.pow(f7, 2.0d);
            case 2:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f11 = f7 - 0.33f;
                return f11 < 0.33f ? wh.w(f11, 0.34f, 0.15f, 0.1f) : (((f11 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 3:
                return f7 * f7 * f7 * f7 * f7;
        }
    }
}
