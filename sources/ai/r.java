package ai;

import android.graphics.Canvas;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends nm0 {
    public r0 f3;
    public q0 g3;

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.g3 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        r0 r0Var = this.f3;
        if (r0Var != null) {
            r0Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        q0 q0Var = this.g3;
        if (q0Var != null) {
            q0Var.x(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
