package ai;

import android.graphics.Canvas;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r extends pj0 {
    public aa.k e3;
    public k0 f3;

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        if (this.f3 != null) {
            canvas2 = canvas;
            i7 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        aa.k kVar = this.e3;
        if (kVar != null) {
            kVar.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        k0 k0Var = this.f3;
        if (k0Var != null) {
            k0Var.x(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
