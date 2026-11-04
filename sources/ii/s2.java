package ii;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s2 extends org.telegram.ui.web.w0 {
    public final /* synthetic */ int U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(Object obj, Context context, e6 e6Var, int i3, int i10) {
        super(i3, context, e6Var, true);
        this.U0 = i10;
        this.V0 = obj;
    }

    @Override // org.telegram.ui.web.w0
    public void D(boolean z10, String str) {
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                Paint paint = a3Var.R;
                if (z10) {
                    a3Var.m();
                    a3Var.Z0.a(a3Var.q() ? a3Var.x0.e : l10.p(hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J))), str);
                    a3Var.Z0.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
                    a3Var.Z0.setBackgroundColor(paint.getColor());
                    a3Var.Y0 = str;
                }
                org.telegram.ui.c3 c3Var = a3Var.Z0;
                a3Var.X0 = z10;
                org.telegram.messenger.g0.Z3(c3Var, z10, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.w0
    public final void J(org.telegram.ui.web.t0 t0Var) {
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                a3Var.x.setWebView(t0Var);
                w0 w0Var = a3Var.D0;
                if (w0Var != null) {
                    w0Var.k = t0Var;
                }
                a3Var.o0.setWebView(t0Var);
                a3Var.K();
                break;
            default:
                ((d4) this.V0).K.setWebView(t0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.w0
    public void K(org.telegram.ui.web.t0 t0Var) {
        switch (this.U0) {
            case 0:
                a3 a3Var = (a3) this.V0;
                w0 w0Var = a3Var.D0;
                if (w0Var != null && w0Var.k == t0Var) {
                    w0Var.k = null;
                    w0Var.b();
                }
                a3Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    d4 d4Var = (d4) this.V0;
                    if (!d4Var.Q) {
                        d4Var.Q = true;
                        d4Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
