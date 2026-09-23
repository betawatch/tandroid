package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class y7 implements ah.j {
    public final /* synthetic */ d8 a;

    public y7(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // ah.j
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        d8 d8Var = this.a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.l0.b(canvas, -2);
        }
    }

    @Override // ah.j
    public final void m(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
