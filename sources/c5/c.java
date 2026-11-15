package c5;

import android.view.animation.Interpolator;
import org.telegram.messenger.i20;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
            case 4:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 1:
                return (float) Math.pow(f10, 2.0d);
            case 2:
                if (f10 < 0.33f) {
                    return (f10 / 0.33f) * 0.1f;
                }
                float f12 = f10 - 0.33f;
                return f12 < 0.33f ? i20.v(f12, 0.34f, 0.15f, 0.1f) : (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 3:
                return f10 * f10 * f10 * f10 * f10;
        }
    }
}
