package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        this.h = new org.telegram.ui.Components.e6(q2Var, 350L, rr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
