package gi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b6 {
    public final a0 a;
    public boolean b;
    public a6 c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 e;
    public final org.telegram.ui.Components.u5 f;
    public final org.telegram.ui.Components.u5[] g;
    public final org.telegram.ui.Components.u5[] h;
    public final Paint i;
    public final Path j;

    public b6(a0 a0Var) {
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
        xq xqVar = xq.g;
        this.d = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 320L, xqVar);
        this.e = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar);
        this.f = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar);
        this.g = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar)};
        this.h = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar)};
    }

    public final void a(a6 a6Var) {
        if (a6Var != null) {
            this.c = a6Var;
        }
        if (a6Var != null) {
            float f10 = a6Var.d;
            float f11 = a6Var.c;
            PointF[] pointFArr = a6Var.b;
            if (!this.b) {
                this.e.e(true, f11);
                this.f.e(true, f10);
                for (int i3 = 0; i3 < Math.min(4, pointFArr.length); i3++) {
                    this.g[i3].e(true, pointFArr[i3].x - f11);
                    this.h[i3].e(true, pointFArr[i3].y - f10);
                }
            }
        }
        this.b = a6Var != null;
        this.a.run();
    }
}
