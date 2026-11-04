package gi;

import android.graphics.Canvas;
import android.graphics.RectF;
import ci.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class e2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final gc g;
    public final org.telegram.ui.Components.u5 h;

    public e2(fc fcVar) {
        this.g = new gc(fcVar);
        this.h = new org.telegram.ui.Components.u5(fcVar, 350L, xq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
