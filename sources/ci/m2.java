package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.sr;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public abstract class m2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.zc g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.g = new org.telegram.ui.Components.zc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, sr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
