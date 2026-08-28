package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class h2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.pc g;
    public final org.telegram.ui.Components.y5 h;

    public h2(l2 l2Var) {
        this.g = new org.telegram.ui.Components.pc(l2Var);
        this.h = new org.telegram.ui.Components.y5(l2Var, 350L, gr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
