package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l2 extends org.telegram.ui.web.v0 {
    public final /* synthetic */ int U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Context context, i6 i6Var, int i7, int i10) {
        super(i7, context, i6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override // org.telegram.ui.web.v0
    public void E(boolean z10, String str) {
        switch (this.U0) {
            case 0:
                t2 t2Var = (t2) this.V0;
                Paint paint = t2Var.R;
                if (z10) {
                    t2Var.m();
                    t2Var.Z0.a(t2Var.q() ? t2Var.x0.e : o10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J))), str);
                    t2Var.Z0.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    t2Var.Z0.setBackgroundColor(paint.getColor());
                    t2Var.Y0 = str;
                }
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                t2Var.X0 = z10;
                org.telegram.messenger.g0.X3(b3Var, z10, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public final void K(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                t2 t2Var = (t2) this.V0;
                t2Var.x.setWebView(s0Var);
                w0 w0Var = t2Var.D0;
                if (w0Var != null) {
                    w0Var.k = s0Var;
                }
                t2Var.o0.setWebView(s0Var);
                t2Var.K();
                break;
            default:
                ((t3) this.V0).K.setWebView(s0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.v0
    public void L(org.telegram.ui.web.s0 s0Var) {
        switch (this.U0) {
            case 0:
                t2 t2Var = (t2) this.V0;
                w0 w0Var = t2Var.D0;
                if (w0Var != null && w0Var.k == s0Var) {
                    w0Var.k = null;
                    w0Var.b();
                }
                t2Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    t3 t3Var = (t3) this.V0;
                    if (!t3Var.Q) {
                        t3Var.Q = true;
                        t3Var.n.R();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
