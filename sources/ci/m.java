package ci;

import android.graphics.Canvas;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m extends ck0 {
    public aa.k f3;
    public d0 g3;

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
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
