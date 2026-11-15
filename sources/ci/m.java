package ci;

import android.graphics.Canvas;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m extends uj0 {
    public aa.k f3;
    public c0 g3;

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
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
        c0 c0Var = this.g3;
        if (c0Var != null) {
            c0Var.x(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
