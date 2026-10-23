package gi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class v2 extends org.telegram.ui.web.b1 {
    public final /* synthetic */ int T0;
    public final /* synthetic */ Object U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(int i10, int i11, Context context, Object obj, g6 g6Var) {
        super(i10, context, g6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override // org.telegram.ui.web.b1
    public void D(boolean z10, String str) {
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                Paint paint = d3Var.Q;
                if (z10) {
                    d3Var.i();
                    d3Var.Y0.a(d3Var.m() ? d3Var.w0.e : UserObject.getUserName(MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I))), str);
                    d3Var.Y0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    d3Var.Y0.setBackgroundColor(paint.getColor());
                    d3Var.X0 = str;
                }
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                d3Var.W0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(e3Var, z10, 1.0f, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.b1
    public final void J(org.telegram.ui.web.y0 y0Var) {
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                d3Var.w.setWebView(y0Var);
                y0 y0Var2 = d3Var.C0;
                if (y0Var2 != null) {
                    y0Var2.k = y0Var;
                }
                d3Var.n0.setWebView(y0Var);
                d3Var.G();
                break;
            default:
                ((f4) this.U0).J.setWebView(y0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.b1
    public void K(org.telegram.ui.web.y0 y0Var) {
        switch (this.T0) {
            case 0:
                d3 d3Var = (d3) this.U0;
                y0 y0Var2 = d3Var.C0;
                if (y0Var2 != null && y0Var2.k == y0Var) {
                    y0Var2.k = null;
                    y0Var2.b();
                }
                d3Var.n0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    f4 f4Var = (f4) this.U0;
                    if (!f4Var.P) {
                        f4Var.P = true;
                        f4Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
