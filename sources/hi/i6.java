package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i6 {
    public final j0 a;
    public boolean b;
    public h6 c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public final org.telegram.ui.Components.c6 f;
    public final org.telegram.ui.Components.c6[] g;
    public final org.telegram.ui.Components.c6[] h;
    public final Paint i;
    public final Path j;

    public i6(j0 j0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.j = new Path();
        this.a = j0Var;
        kr krVar = kr.g;
        this.d = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 320L, krVar);
        this.e = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar);
        this.f = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar);
        this.g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar)};
    }

    public final void a(h6 h6Var) {
        if (h6Var != null) {
            this.c = h6Var;
        }
        if (h6Var != null) {
            float f10 = h6Var.d;
            float f11 = h6Var.c;
            PointF[] pointFArr = h6Var.b;
            if (!this.b) {
                this.e.e(true, f11);
                this.f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        this.b = h6Var != null;
        this.a.run();
    }
}
