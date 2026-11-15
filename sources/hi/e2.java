package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.ub;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class e2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final dc g;
    public final org.telegram.ui.Components.u5 h;

    public e2(ub ubVar) {
        this.g = new dc(ubVar);
        this.h = new org.telegram.ui.Components.u5(ubVar, 350L, er.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
