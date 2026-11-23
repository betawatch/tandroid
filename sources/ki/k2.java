package ki;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k2 extends org.telegram.ui.web.v0 {
    public final /* synthetic */ int U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Context context, i6 i6Var, int i7, int i10) {
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
                    t2Var.Z0.a(t2Var.q() ? t2Var.x0.e : n10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J))), str);
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
                v0 v0Var = t2Var.D0;
                if (v0Var != null) {
                    v0Var.k = s0Var;
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
                v0 v0Var = t2Var.D0;
                if (v0Var != null && v0Var.k == s0Var) {
                    v0Var.k = null;
                    v0Var.b();
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
