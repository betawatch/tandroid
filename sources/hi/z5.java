package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z5 {
    public final b0 a;
    public boolean b;
    public y5 c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public final org.telegram.ui.Components.c6 f;
    public final org.telegram.ui.Components.c6[] g;
    public final org.telegram.ui.Components.c6[] h;
    public final Paint i;
    public final Path j;

    public z5(b0 b0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.j = new Path();
        this.a = b0Var;
        lr lrVar = lr.g;
        this.d = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 320L, lrVar);
        this.e = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar);
        this.f = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar);
        this.g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar)};
    }

    public final void a(y5 y5Var) {
        if (y5Var != null) {
            this.c = y5Var;
        }
        if (y5Var != null) {
            float f10 = y5Var.d;
            float f11 = y5Var.c;
            PointF[] pointFArr = y5Var.b;
            if (!this.b) {
                this.e.e(true, f11);
                this.f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        this.b = y5Var != null;
        this.a.run();
    }
}
