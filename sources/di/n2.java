package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public abstract class n2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.zc g;
    public final org.telegram.ui.Components.e6 h;

    public n2(r2 r2Var) {
        this.g = new org.telegram.ui.Components.zc(r2Var);
        this.h = new org.telegram.ui.Components.e6(r2Var, 350L, pr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
