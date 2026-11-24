// default package

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac1 implements TimeInterpolator {
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
