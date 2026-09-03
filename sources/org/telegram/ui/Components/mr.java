package org.telegram.ui.Components;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mr implements Interpolator {
    public static final mr f = new mr(0.25d, 0.1d, 0.25d, 1.0d);
    public static final mr g = new mr(0.0d, 0.0d, 0.58d, 1.0d);
    public static final mr h = new mr(0.23d, 1.0d, 0.32d, 1.0d);
    public static final mr i = new mr(0.42d, 0.0d, 1.0d, 1.0d);
    public static final mr j = new mr(0.42d, 0.0d, 0.58d, 1.0d);
    public static final mr k = new mr(0.34d, 1.56d, 0.64d, 1.0d);
    public static final PathInterpolator l;
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;

    static {
        new PathInterpolator(j7.z7.d("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public mr(float f10, float f11, float f12, float f13) {
        PointF pointF = new PointF(f10, f11);
        PointF pointF2 = new PointF(f12, f13);
        this.c = new PointF();
        this.d = new PointF();
        this.e = new PointF();
        float f14 = pointF.x;
        if (f14 < 0.0f || f14 > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f15 = pointF2.x;
        if (f15 < 0.0f || f15 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.a = pointF;
        this.b = pointF2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i10 = 1;
        float f11 = f10;
        while (true) {
            pointF = this.b;
            pointF2 = this.a;
            pointF3 = this.c;
            pointF4 = this.d;
            pointF5 = this.e;
            if (i10 >= 14) {
                break;
            }
            float f12 = pointF2.x * 3.0f;
            pointF5.x = f12;
            float f13 = ((pointF.x - pointF2.x) * 3.0f) - f12;
            pointF4.x = f13;
            float f14 = (1.0f - pointF5.x) - f13;
            pointF3.x = f14;
            float f15 = (((((f14 * f11) + pointF4.x) * f11) + pointF5.x) * f11) - f10;
            if (Math.abs(f15) < 0.001d) {
                break;
            }
            f11 -= f15 / (((((pointF3.x * 3.0f) * f11) + (pointF4.x * 2.0f)) * f11) + pointF5.x);
            i10++;
        }
        float f16 = pointF2.y * 3.0f;
        pointF5.y = f16;
        float f17 = ((pointF.y - pointF2.y) * 3.0f) - f16;
        pointF4.y = f17;
        float f18 = (1.0f - pointF5.y) - f17;
        pointF3.y = f18;
        return ((((f18 * f11) + pointF4.y) * f11) + pointF5.y) * f11;
    }

    public mr(double d, double d10, double d11, double d12) {
        this((float) d, (float) d10, (float) d11, (float) d12);
    }
}
