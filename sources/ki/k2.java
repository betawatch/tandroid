package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k2 extends org.telegram.ui.web.v0 {
    public final /* synthetic */ int U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Context context, h6 h6Var, int i7, int i10) {
        super(i7, context, h6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override // org.telegram.ui.web.v0
    public void E(boolean z10, String str) {
        switch (this.U0) {
            case 0:
                s2 s2Var = (s2) this.V0;
                Paint paint = s2Var.R;
                if (z10) {
                    s2Var.m();
                    s2Var.Z0.a(s2Var.q() ? s2Var.x0.e : p10.q(np.u1(s2Var.I).c2(Long.valueOf(s2Var.J))), str);
                    s2Var.Z0.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    s2Var.Z0.setBackgroundColor(paint.getColor());
                    s2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                s2Var.X0 = z10;
                org.telegram.messenger.g0.X3(b3Var, z10, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public final void K(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                s2 s2Var = (s2) this.V0;
                s2Var.x.setWebView(s0Var);
                v0 v0Var = s2Var.D0;
                if (v0Var != null) {
                    v0Var.k = s0Var;
                }
                s2Var.o0.setWebView(s0Var);
                s2Var.K();
                break;
            default:
                ((s3) this.V0).K.setWebView(s0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                s2 s2Var = (s2) this.V0;
                v0 v0Var = s2Var.D0;
                if (v0Var != null && v0Var.k == s0Var) {
                    v0Var.k = null;
                    v0Var.b();
                }
                s2Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    s3 s3Var = (s3) this.V0;
                    if (!s3Var.Q) {
                        s3Var.Q = true;
                        s3Var.n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
