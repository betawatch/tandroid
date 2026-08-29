package nh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i6 {
    public final a0 a;
    public boolean b;
    public h6 c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f;
    public final org.telegram.ui.Components.d6[] g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint i;
    public final Path j;

    public i6(a0 a0Var) {
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
        jr jrVar = jr.g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, jrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar);
        this.f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar);
        this.g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar)};
    }

    public final void a(h6 h6Var) {
        if (h6Var != null) {
            this.c = h6Var;
        }
        if (h6Var != null) {
            float f9 = h6Var.d;
            float f10 = h6Var.c;
            PointF[] pointFArr = h6Var.b;
            if (!this.b) {
                this.e.d(f10, true);
                this.f.d(f9, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f9, true);
                }
            }
        }
        this.b = h6Var != null;
        this.a.run();
    }
}
