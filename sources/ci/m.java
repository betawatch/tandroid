package ci;

import android.graphics.Canvas;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class m extends ek0 {
    public aa.k f3;
    public d0 g3;

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        if (this.g3 != null) {
            canvas2 = canvas;
            i7 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        aa.k kVar = this.f3;
        if (kVar != null) {
            kVar.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        d0 d0Var = this.g3;
        if (d0Var != null) {
            d0Var.x(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
