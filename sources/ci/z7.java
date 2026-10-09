package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z7 implements ah.j {
    public final /* synthetic */ d8 a;

    public z7(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // ah.j
    public final void B0(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // ah.j
    public final void l(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        d8 d8Var = this.a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.l0.b(canvas, -3);
        }
    }
}
