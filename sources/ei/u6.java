package ei;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class u6 {
    public final a0 a;
    public boolean b;
    public t6 c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.f6 f;
    public final org.telegram.ui.Components.f6[] g;
    public final org.telegram.ui.Components.f6[] h;
    public final Paint i;
    public final Path j;

    public u6(a0 a0Var) {
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
        bs bsVar = bs.g;
        this.d = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 320L, bsVar);
        this.e = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar);
        this.f = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar);
        this.g = new org.telegram.ui.Components.f6[]{new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar)};
        this.h = new org.telegram.ui.Components.f6[]{new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar)};
    }

    public final void a(t6 t6Var) {
        if (t6Var != null) {
            this.c = t6Var;
        }
        if (t6Var != null) {
            float f7 = t6Var.d;
            float f10 = t6Var.c;
            PointF[] pointFArr = t6Var.b;
            if (!this.b) {
                this.e.d(f10, true);
                this.f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.b = t6Var != null;
        this.a.run();
    }
}
