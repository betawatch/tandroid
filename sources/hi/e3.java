package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ int T0;
    public final /* synthetic */ Object U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(int i10, int i11, Context context, Object obj, u6 u6Var) {
        super(i10, context, u6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override // org.telegram.ui.web.a1
    public void D(boolean z10, String str) {
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                Paint paint = m3Var.Q;
                if (z10) {
                    m3Var.i();
                    m3Var.Y0.a(m3Var.m() ? m3Var.w0.e : UserObject.getUserName(MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I))), str);
                    m3Var.Y0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    m3Var.Y0.setBackgroundColor(paint.getColor());
                    m3Var.X0 = str;
                }
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                m3Var.W0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(c3Var, z10, 1.0f, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.a1
    public final void J(org.telegram.ui.web.x0 x0Var) {
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                m3Var.w.setWebView(x0Var);
                f1 f1Var = m3Var.C0;
                if (f1Var != null) {
                    f1Var.k = x0Var;
                }
                m3Var.n0.setWebView(x0Var);
                m3Var.G();
                break;
            default:
                ((o4) this.U0).J.setWebView(x0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.a1
    public void K(org.telegram.ui.web.x0 x0Var) {
        switch (this.T0) {
            case 0:
                m3 m3Var = (m3) this.U0;
                f1 f1Var = m3Var.C0;
                if (f1Var != null && f1Var.k == x0Var) {
                    f1Var.k = null;
                    f1Var.b();
                }
                m3Var.n0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    o4 o4Var = (o4) this.U0;
                    if (!o4Var.P) {
                        o4Var.P = true;
                        o4Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
