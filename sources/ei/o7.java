package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o7 implements bh.h {
    public final /* synthetic */ s7 a;

    public o7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // bh.h
    public final void H(bh.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // bh.h
    public final void r(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        s7 s7Var = this.a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.l0.b(canvas, -3);
        }
    }
}
