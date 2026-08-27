package lh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t6 {
    public final b0 a;
    public boolean b;
    public s6 c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 e;
    public final org.telegram.ui.Components.y5 f;
    public final org.telegram.ui.Components.y5[] g;
    public final org.telegram.ui.Components.y5[] h;
    public final Paint i;
    public final Path j;

    public t6(b0 b0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.j = new Path();
        this.a = b0Var;
        er erVar = er.g;
        this.d = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 320L, erVar);
        this.e = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar);
        this.f = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar);
        this.g = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar)};
        this.h = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar)};
    }

    public final void a(s6 s6Var) {
        if (s6Var != null) {
            this.c = s6Var;
        }
        if (s6Var != null) {
            float f10 = s6Var.d;
            float f11 = s6Var.c;
            PointF[] pointFArr = s6Var.b;
            if (!this.b) {
                this.e.d(f11, true);
                this.f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        this.b = s6Var != null;
        this.a.run();
    }
}
