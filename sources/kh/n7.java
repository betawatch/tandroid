package kh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n7 implements ig.g {
    public final /* synthetic */ s7 a;

    public n7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // ig.g
    public final void k(Canvas canvas) {
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        s7 s7Var = this.a;
        canvas.drawColor(s7Var.getThemedColor(i9));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.h0.b(canvas, -2);
        }
    }

    @Override // ig.g
    public final void x0(g.x xVar) {
        xVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
