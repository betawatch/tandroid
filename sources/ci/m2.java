package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.sr;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public abstract class m2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.yc g;
    public final org.telegram.ui.Components.e6 h;

    public m2(q2 q2Var) {
        this.g = new org.telegram.ui.Components.yc(q2Var);
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, sr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
