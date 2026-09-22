package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class c8 implements ah.j {
    public final /* synthetic */ g8 a;

    public c8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // ah.j
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        g8 g8Var = this.a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.l0.b(canvas, -3);
        }
    }

    @Override // ah.j
    public final void m(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
