package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public abstract class n2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.wc g;
    public final org.telegram.ui.Components.c6 h;

    public n2(r2 r2Var) {
        this.g = new org.telegram.ui.Components.wc(r2Var);
        this.h = new org.telegram.ui.Components.c6(r2Var, 350L, qr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
