package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y5 {
    public final c0 a;
    public boolean b;
    public x5 c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f;
    public final org.telegram.ui.Components.d6[] g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint i;
    public final Path j;

    public y5(c0 c0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.j = new Path();
        this.a = c0Var;
        nr nrVar = nr.g;
        this.d = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 320L, nrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.f = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
    }

    public final void a(x5 x5Var) {
        if (x5Var != null) {
            this.c = x5Var;
        }
        if (x5Var != null) {
            float f10 = x5Var.d;
            float f11 = x5Var.c;
            PointF[] pointFArr = x5Var.b;
            if (!this.b) {
                this.e.e(true, f11);
                this.f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        this.b = x5Var != null;
        this.a.run();
    }
}
