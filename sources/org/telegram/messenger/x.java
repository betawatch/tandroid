package org.telegram.messenger;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
