package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class i2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final yc g;
    public final org.telegram.ui.Components.f6 h;

    public i2(l2 l2Var) {
        this.g = new yc(l2Var);
        this.h = new org.telegram.ui.Components.f6(l2Var, 350L, bs.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
