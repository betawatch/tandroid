package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class f2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final mc g;
    public final org.telegram.ui.Components.c6 h;

    public f2(yb ybVar) {
        this.g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.c6(ybVar, 350L, lr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
