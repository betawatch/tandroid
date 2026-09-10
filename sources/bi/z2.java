package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class z2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.xc g;
    public final org.telegram.ui.Components.d6 h;

    public z2(d3 d3Var) {
        this.g = new org.telegram.ui.Components.xc(d3Var);
        this.h = new org.telegram.ui.Components.d6(d3Var, 350L, wr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
