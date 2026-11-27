// default package

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
