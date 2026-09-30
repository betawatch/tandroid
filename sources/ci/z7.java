package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class z7 implements ah.j {
    public final /* synthetic */ d8 a;

    public z7(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // ah.j
    public final void U(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // ah.j
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        d8 d8Var = this.a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.l0.b(canvas, -3);
        }
    }
}
