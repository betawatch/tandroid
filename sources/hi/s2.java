package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class s2 extends org.telegram.ui.web.x0 {
    public final /* synthetic */ int T0;
    public final /* synthetic */ Object U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(Object obj, Context context, h6 h6Var, int i7, int i10) {
        super(i7, context, h6Var, true);
        this.T0 = i10;
        this.U0 = obj;
    }

    @Override // org.telegram.ui.web.x0
    public void E(boolean z9, String str) {
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                Paint paint = a3Var.Q;
                if (z9) {
                    a3Var.m();
                    a3Var.Y0.a(a3Var.q() ? a3Var.w0.e : t10.p(qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I))), str);
                    a3Var.Y0.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    a3Var.Y0.setBackgroundColor(paint.getColor());
                    a3Var.X0 = str;
                }
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                a3Var.W0 = z9;
                org.telegram.messenger.g0.Z3(b3Var, z9, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.x0
    public final void K(org.telegram.ui.web.u0 u0Var) {
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                a3Var.x.setWebView(u0Var);
                v0 v0Var = a3Var.C0;
                if (v0Var != null) {
                    v0Var.k = u0Var;
                }
                a3Var.n0.setWebView(u0Var);
                a3Var.K();
                break;
            default:
                ((c4) this.U0).J.setWebView(u0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.x0
    public void L(org.telegram.ui.web.u0 u0Var) {
        switch (this.T0) {
            case 0:
                a3 a3Var = (a3) this.U0;
                v0 v0Var = a3Var.C0;
                if (v0Var != null && v0Var.k == u0Var) {
                    v0Var.k = null;
                    v0Var.b();
                }
                a3Var.n0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    c4 c4Var = (c4) this.U0;
                    if (!c4Var.P) {
                        c4Var.P = true;
                        c4Var.n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
