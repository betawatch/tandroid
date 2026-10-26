package ai;

import android.graphics.Canvas;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r extends mm0 {
    public r0 f3;
    public q0 g3;

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
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
