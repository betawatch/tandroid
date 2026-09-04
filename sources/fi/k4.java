package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k4 extends org.telegram.ui.web.d1 {
    public final /* synthetic */ r4 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(r4 r4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = r4Var;
    }

    @Override // org.telegram.ui.web.d1
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.J.setWebView(z0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r4 r4Var = this.S0;
            if (!r4Var.P) {
                r4Var.P = true;
                r4Var.n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
