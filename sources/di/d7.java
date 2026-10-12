package di;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d7 {
    public final a0 a;
    public boolean b;
    public c7 c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.g6 f;
    public final org.telegram.ui.Components.g6[] g;
    public final org.telegram.ui.Components.g6[] h;
    public final Paint i;
    public final Path j;

    public d7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.j = new Path();
        this.a = a0Var;
        es esVar = es.g;
        this.d = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 320L, esVar);
        this.e = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar);
        this.f = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar);
        this.g = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar)};
        this.h = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar)};
    }

    public final void a(c7 c7Var) {
        if (c7Var != null) {
            this.c = c7Var;
        }
        if (c7Var != null) {
            float f7 = c7Var.d;
            float f10 = c7Var.c;
            PointF[] pointFArr = c7Var.b;
            if (!this.b) {
                this.e.d(f10, true);
                this.f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.b = c7Var != null;
        this.a.run();
    }
}
