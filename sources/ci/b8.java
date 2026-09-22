package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class b8 implements ah.k {
    public final /* synthetic */ g8 a;

    public b8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // ah.k
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        g8 g8Var = this.a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.l0.b(canvas, -2);
        }
    }

    @Override // ah.k
    public final void y(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
