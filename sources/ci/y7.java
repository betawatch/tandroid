package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class y7 implements ah.j {
    public final /* synthetic */ d8 a;

    public y7(d8 d8Var) {
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
            d8Var.l0.b(canvas, -2);
        }
    }
}
