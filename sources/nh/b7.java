package nh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b7 implements lg.g {
    public final /* synthetic */ g7 a;

    public b7(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // lg.g
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        g7 g7Var = this.a;
        canvas.drawColor(g7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g7Var.h0.b(canvas, -2);
        }
    }

    @Override // lg.g
    public final void q(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
