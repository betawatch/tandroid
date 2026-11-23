package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class e2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final mc g;
    public final org.telegram.ui.Components.d6 h;

    public e2(yb ybVar) {
        this.g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.d6(ybVar, 350L, nr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
