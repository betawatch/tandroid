package og;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y0 {
    public final float a;
    public final float b;
    public final PointF c;
    public final PointF d;
    public final float e;
    public final PointF f;
    public final PointF g;

    public y0(t8.a aVar, Bitmap bitmap, tv0 tv0Var, boolean z10) {
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (t8.d dVar : aVar.b) {
            PointF pointF5 = dVar.a;
            int i10 = dVar.b;
            if (i10 == 4) {
                pointF = b(pointF5, bitmap, tv0Var, z10);
            } else if (i10 == 5) {
                pointF3 = b(pointF5, bitmap, tv0Var, z10);
            } else if (i10 == 10) {
                pointF2 = b(pointF5, bitmap, tv0Var, z10);
            } else if (i10 == 11) {
                pointF4 = b(pointF5, bitmap, tv0Var, z10);
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
            float f7 = hypot * 0.8f;
            double radians = (float) Math.toRadians(r0 - 90.0f);
            this.c = new PointF((((float) Math.cos(radians)) * f7) + pointF7.x, (f7 * ((float) Math.sin(radians))) + pointF7.y);
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
        float f10 = this.e * 0.7f;
        double radians2 = (float) Math.toRadians(this.b + 90.0f);
        this.g = new PointF((((float) Math.cos(radians2)) * f10) + pointF9.x, (f10 * ((float) Math.sin(radians2))) + pointF9.y);
    }

    public static PointF b(PointF pointF, Bitmap bitmap, tv0 tv0Var, boolean z10) {
        return new PointF((tv0Var.a * pointF.x) / (z10 ? bitmap.getHeight() : bitmap.getWidth()), (tv0Var.b * pointF.y) / (z10 ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public final PointF a(int i10) {
        if (i10 == 0) {
            return this.c;
        }
        if (i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.g;
    }
}
