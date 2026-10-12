package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class x7 implements bh.h {
    public final /* synthetic */ c8 a;

    public x7(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // bh.h
    public final void m0(bh.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // bh.h
    public final void v(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        c8 c8Var = this.a;
        canvas.drawColor(c8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            c8Var.l0.b(canvas, -2);
        }
    }
}
