package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class p2 extends org.telegram.ui.web.v0 {
    public final /* synthetic */ int U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(Object obj, Context context, e6 e6Var, int i7, int i10) {
        super(i7, context, e6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override // org.telegram.ui.web.v0
    public void E(boolean z10, String str) {
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                Paint paint = x2Var.R;
                if (z10) {
                    x2Var.m();
                    x2Var.Z0.a(x2Var.q() ? x2Var.x0.e : q10.p(np.s1(x2Var.I).a2(Long.valueOf(x2Var.J))), str);
                    x2Var.Z0.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    x2Var.Z0.setBackgroundColor(paint.getColor());
                    x2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                x2Var.X0 = z10;
                org.telegram.messenger.g0.Y3(b3Var, z10, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public final void K(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                x2Var.x.setWebView(s0Var);
                w0 w0Var = x2Var.D0;
                if (w0Var != null) {
                    w0Var.k = s0Var;
                }
                x2Var.o0.setWebView(s0Var);
                x2Var.K();
                break;
            default:
                ((y3) this.V0).K.setWebView(s0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                x2 x2Var = (x2) this.V0;
                w0 w0Var = x2Var.D0;
                if (w0Var != null && w0Var.k == s0Var) {
                    w0Var.k = null;
                    w0Var.b();
                }
                x2Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    y3 y3Var = (y3) this.V0;
                    if (!y3Var.Q) {
                        y3Var.Q = true;
                        y3Var.n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
