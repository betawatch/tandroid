package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class n7 implements bh.h {
    public final /* synthetic */ s7 a;

    public n7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // bh.h
    public final void J(bh.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // bh.h
    public final void z(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        s7 s7Var = this.a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.l0.b(canvas, -2);
        }
    }
}
