// default package

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab1 implements TimeInterpolator {
    public final /* synthetic */ byte a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                return ((((6.0f * f) - 15.0f) * f) + 10.0f) * f * f * f;
            default:
                return f;
        }
    }
}
