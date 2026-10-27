package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r6 {
    public final a0 a;
    public boolean b;
    public q6 c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.h6 f;
    public final org.telegram.ui.Components.h6[] g;
    public final org.telegram.ui.Components.h6[] h;
    public final Paint i;
    public final Path j;

    public r6(a0 a0Var) {
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
        ds dsVar = ds.g;
        this.d = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 320L, dsVar);
        this.e = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar);
        this.f = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar);
        this.g = new org.telegram.ui.Components.h6[]{new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar)};
        this.h = new org.telegram.ui.Components.h6[]{new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar)};
    }

    public final void a(q6 q6Var) {
        if (q6Var != null) {
            this.c = q6Var;
        }
        if (q6Var != null) {
            float f7 = q6Var.d;
            float f10 = q6Var.c;
            PointF[] pointFArr = q6Var.b;
            if (!this.b) {
                this.e.d(f10, true);
                this.f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.b = q6Var != null;
        this.a.run();
    }
}
