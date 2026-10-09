package ei;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b3 extends org.telegram.ui.web.b1 {
    public final /* synthetic */ int S0;
    public final /* synthetic */ Object T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i10, int i11, Context context, Object obj, e6 e6Var) {
        super(i10, context, e6Var, true);
        this.S0 = i11;
        this.T0 = obj;
    }

    @Override // org.telegram.ui.web.b1
    public void D(boolean z10, String str) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                Paint paint = k3Var.P;
                if (z10) {
                    k3Var.i();
                    k3Var.U0.a(k3Var.m() ? k3Var.v0.e : UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H))), str);
                    k3Var.U0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                    k3Var.T0 = str;
                }
                org.telegram.ui.d3 d3Var = k3Var.U0;
                k3Var.S0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(d3Var, z10, 1.0f, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.b1
    public final void J(org.telegram.ui.web.y0 y0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                k3Var.v.setWebView(y0Var);
                a1 a1Var = k3Var.B0;
                if (a1Var != null) {
                    a1Var.k = y0Var;
                }
                k3Var.m0.setWebView(y0Var);
                k3Var.G();
                break;
            default:
                ((p4) this.T0).J.setWebView(y0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.b1
    public void K(org.telegram.ui.web.y0 y0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                a1 a1Var = k3Var.B0;
                if (a1Var != null && a1Var.k == y0Var) {
                    a1Var.k = null;
                    a1Var.b();
                }
                k3Var.m0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.S0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    p4 p4Var = (p4) this.T0;
                    if (!p4Var.P) {
                        p4Var.P = true;
                        p4Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
