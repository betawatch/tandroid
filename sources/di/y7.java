package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y7 implements bh.h {
    public final /* synthetic */ c8 a;

    public y7(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // bh.h
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        c8 c8Var = this.a;
        canvas.drawColor(c8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            c8Var.l0.b(canvas, -3);
        }
    }

    @Override // bh.h
    public final void m0(bh.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
