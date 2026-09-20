package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class c8 implements ah.k {
    public final /* synthetic */ g8 a;

    public c8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // ah.k
    public final void K(ah.a aVar) {
        aVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // ah.k
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        g8 g8Var = this.a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.l0.b(canvas, -3);
        }
    }
}
