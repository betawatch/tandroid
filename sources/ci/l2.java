package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class l2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.bd g;
    public final org.telegram.ui.Components.g6 h;

    public l2(p2 p2Var) {
        this.g = new org.telegram.ui.Components.bd(p2Var);
        this.h = new org.telegram.ui.Components.g6(p2Var, 350L, hs.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
