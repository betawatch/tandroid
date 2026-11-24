// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gw0 extends hv0 {
    public final /* synthetic */ byte U0;
    public final /* synthetic */ Object V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw0(Object obj, Context context, wjb wjbVar, int i, byte b) {
        super(i, wjbVar, context, true);
        this.U0 = b;
        this.V0 = obj;
    }

    @Override // hv0
    public final void B(boolean z, String str) {
        switch (this.U0) {
            case 0:
                ow0 ow0Var = (ow0) this.V0;
                Paint paint = ow0Var.R;
                if (z) {
                    ow0Var.j();
                    ow0Var.Z0.a(ow0Var.o() ? ow0Var.x0.e : l7c.r(na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J))), str);
                    ow0Var.Z0.b(gl.B(paint.getColor()) <= 0.721f, false);
                    ow0Var.Z0.setBackgroundColor(paint.getColor());
                    ow0Var.Y0 = str;
                }
                cw cwVar = ow0Var.Z0;
                ow0Var.X0 = z;
                gl.T3(cwVar, z, 1.0f, true, false);
                invalidate();
                break;
        }
    }

    @Override // hv0
    public final void H(cv0 cv0Var) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                ow0 ow0Var = (ow0) obj;
                ow0Var.x.setWebView(cv0Var);
                or0 or0Var = ow0Var.D0;
                if (or0Var != null) {
                    or0Var.k = cv0Var;
                }
                ow0Var.o0.setWebView(cv0Var);
                ow0Var.K();
                break;
            default:
                ((s12) obj).K.setWebView(cv0Var);
                break;
        }
    }

    @Override // hv0
    public final void I(cv0 cv0Var) {
        switch (this.U0) {
            case 0:
                ow0 ow0Var = (ow0) this.V0;
                or0 or0Var = ow0Var.D0;
                if (or0Var != null && or0Var.k == cv0Var) {
                    or0Var.k = null;
                    or0Var.b();
                }
                ow0Var.o0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    s12 s12Var = (s12) this.V0;
                    if (!s12Var.Q) {
                        s12Var.Q = true;
                        s12Var.n.O();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
