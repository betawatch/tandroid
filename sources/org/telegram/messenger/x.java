package org.telegram.messenger;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public x(double d, double d10, double d11, double d12) {
        this.a = d;
        this.b = d10;
        this.c = d11;
        this.d = d12;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        double exp;
        double d = this.a;
        double d10 = this.d;
        double d11 = this.b;
        if (d < 1.0d) {
            double exp2 = Math.exp((-f10) * d * d11);
            double d12 = this.c * f10;
            exp = 1.0d - (((Math.sin(d12) * d10) + (Math.cos(d12) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f10) * d11) * ((d10 * f10) + 1.0d));
        }
        return (float) exp;
    }
}
