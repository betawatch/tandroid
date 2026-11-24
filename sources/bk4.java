// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bk4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100.0d, -1.0d)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100.0d, -(1.0f - f)))) * this.a);
    }
}
