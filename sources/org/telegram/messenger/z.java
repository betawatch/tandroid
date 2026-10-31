package org.telegram.messenger;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public z(double d, double d10, double d11, double d12) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = d12;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        double exp;
        double d = this.a;
        double d10 = this.d;
        double d11 = this.b;
        if (d < 1.0d) {
            double exp2 = Math.exp((-f7) * d * d11);
            double d12 = this.c * f7;
            exp = 1.0d - (((Math.sin(d12) * d10) + (Math.cos(d12) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f7) * d11) * ((d10 * f7) + 1.0d));
        }
        return (float) exp;
    }
}
