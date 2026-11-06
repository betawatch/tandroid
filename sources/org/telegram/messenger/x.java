package org.telegram.messenger;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class x implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public x(double d, double d2, double d10, double d11) {
        this.a = d;
        this.b = d2;
        this.c = d10;
        this.d = d11;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        double exp;
        double d = this.a;
        double d2 = this.d;
        double d10 = this.b;
        if (d < 1.0d) {
            double exp2 = Math.exp((-f10) * d * d10);
            double d11 = this.c * f10;
            exp = 1.0d - (((Math.sin(d11) * d2) + (Math.cos(d11) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f10) * d10) * ((d2 * f10) + 1.0d));
        }
        return (float) exp;
    }
}
