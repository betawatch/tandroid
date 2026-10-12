package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class l2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.ad g;
    public final org.telegram.ui.Components.g6 h;

    public l2(p2 p2Var) {
        this.g = new org.telegram.ui.Components.ad(p2Var);
        this.h = new org.telegram.ui.Components.g6(p2Var, 350L, es.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
