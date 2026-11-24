// default package

import android.graphics.Bitmap;
import android.graphics.PointF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c78 {
    public final float a;
    public final float b;
    public final PointF c;
    public final PointF d;
    public final float e;
    public final PointF f;
    public final PointF g;

    public c78(w84 w84Var, Bitmap bitmap, xka xkaVar, boolean z) {
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (wy5 wy5Var : w84Var.b) {
            PointF pointF5 = wy5Var.a;
            int i = wy5Var.b;
            if (i == 4) {
                pointF = b(pointF5, bitmap, xkaVar, z);
            } else if (i == 5) {
                pointF3 = b(pointF5, bitmap, xkaVar, z);
            } else if (i == 10) {
                pointF2 = b(pointF5, bitmap, xkaVar, z);
            } else if (i == 11) {
                pointF4 = b(pointF5, bitmap, xkaVar, z);
            }
        }
        if (pointF != null && pointF2 != null) {
            if (pointF.x < pointF2.x) {
                PointF pointF6 = pointF2;
                pointF2 = pointF;
                pointF = pointF6;
            }
            PointF pointF7 = new PointF((pointF2.x * 0.5f) + (pointF.x * 0.5f), (pointF2.y * 0.5f) + (pointF.y * 0.5f));
            this.d = pointF7;
            float hypot = (float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.e = hypot;
            this.b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.a = 2.35f * hypot;
            float f = hypot * 0.8f;
            double radians = (float) Math.toRadians(r0 - 90.0f);
            this.c = new PointF((((float) Math.cos(radians)) * f) + pointF7.x, (f * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 == null || pointF4 == null) {
            return;
        }
        if (pointF3.x < pointF4.x) {
            PointF pointF8 = pointF4;
            pointF4 = pointF3;
            pointF3 = pointF8;
        }
        PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
        this.f = pointF9;
        float f2 = this.e * 0.7f;
        double radians2 = (float) Math.toRadians(this.b + 90.0f);
        this.g = new PointF((((float) Math.cos(radians2)) * f2) + pointF9.x, (f2 * ((float) Math.sin(radians2))) + pointF9.y);
    }

    public static PointF b(PointF pointF, Bitmap bitmap, xka xkaVar, boolean z) {
        float width;
        int height;
        if (z) {
            width = bitmap.getHeight();
            height = bitmap.getWidth();
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        return new PointF((xkaVar.a * pointF.x) / width, (xkaVar.b * pointF.y) / height);
    }

    public final PointF a(int i) {
        if (i == 0) {
            return this.c;
        }
        if (i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.f;
        }
        if (i != 3) {
            return null;
        }
        return this.g;
    }
}
