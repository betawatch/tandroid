// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef3 implements Interpolator {
    public final /* synthetic */ byte a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        byte b = this.a;
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
