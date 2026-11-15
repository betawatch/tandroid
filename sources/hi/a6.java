package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a6 {
    public final a0 a;
    public boolean b;
    public z5 c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 e;
    public final org.telegram.ui.Components.u5 f;
    public final org.telegram.ui.Components.u5[] g;
    public final org.telegram.ui.Components.u5[] h;
    public final Paint i;
    public final Path j;

    public a6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.j = new Path();
        this.a = a0Var;
        er erVar = er.g;
        this.d = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 320L, erVar);
        this.e = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar);
        this.f = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar);
        this.g = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar)};
        this.h = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar)};
    }

    public final void a(z5 z5Var) {
        if (z5Var != null) {
            this.c = z5Var;
        }
        if (z5Var != null) {
            float f10 = z5Var.d;
            float f11 = z5Var.c;
            PointF[] pointFArr = z5Var.b;
            if (!this.b) {
                this.e.e(true, f11);
                this.f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        this.b = z5Var != null;
        this.a.run();
    }
}
