package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
