package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public abstract class n2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.yc g;
    public final org.telegram.ui.Components.d6 h;

    public n2(r2 r2Var) {
        this.g = new org.telegram.ui.Components.yc(r2Var);
        this.h = new org.telegram.ui.Components.d6(r2Var, 350L, qr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
