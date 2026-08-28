package mh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z3 extends org.telegram.ui.web.y0 {
    public final /* synthetic */ g4 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(g4 g4Var, Context context, b6 b6Var, int i9) {
        super(i9, context, b6Var, true);
        this.L0 = g4Var;
    }

    @Override // org.telegram.ui.web.y0
    public final void G(org.telegram.ui.web.v0 v0Var) {
        this.L0.F.setWebView(v0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g4 g4Var = this.L0;
            if (!g4Var.L) {
                g4Var.L = true;
                g4Var.n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
