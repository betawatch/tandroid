package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import di.yb;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public abstract class f2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final mc g;
    public final org.telegram.ui.Components.c6 h;

    public f2(yb ybVar) {
        this.g = new mc(ybVar);
        this.h = new org.telegram.ui.Components.c6(ybVar, 350L, lr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
