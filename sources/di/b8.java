package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class b8 implements bh.h {
    public final /* synthetic */ g8 a;

    public b8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // bh.h
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        g8 g8Var = this.a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.l0.b(canvas, -2);
        }
    }

    @Override // bh.h
    public final void v(bh.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
