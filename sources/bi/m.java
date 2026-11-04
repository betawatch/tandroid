package bi;

import android.graphics.Canvas;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m extends tj0 {
    public d0 f3;
    public c0 g3;

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        if (this.g3 != null) {
            canvas2 = canvas;
            i3 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i3 = -1;
        }
        d0 d0Var = this.f3;
        if (d0Var != null) {
            d0Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        c0 c0Var = this.g3;
        if (c0Var != null) {
            c0Var.x(canvas2);
            canvas2.restoreToCount(i3);
        }
    }
}
