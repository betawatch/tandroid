package gi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class v2 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ int S0;
    public final /* synthetic */ Object T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(int i10, int i11, Context context, Object obj, d6 d6Var) {
        super(i10, context, d6Var, true);
        this.S0 = i11;
        this.T0 = obj;
    }

    @Override // org.telegram.ui.web.a1
    public void D(boolean z10, String str) {
        switch (this.S0) {
            case 0:
                d3 d3Var = (d3) this.T0;
                Paint paint = d3Var.P;
                if (z10) {
                    d3Var.i();
                    d3Var.U0.a(d3Var.m() ? d3Var.v0.e : UserObject.getUserName(MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H))), str);
                    d3Var.U0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    d3Var.U0.setBackgroundColor(paint.getColor());
                    d3Var.T0 = str;
                }
                org.telegram.ui.f3 f3Var = d3Var.U0;
                d3Var.S0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(f3Var, z10, 1.0f, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.a1
    public final void J(org.telegram.ui.web.x0 x0Var) {
        switch (this.S0) {
            case 0:
                d3 d3Var = (d3) this.T0;
                d3Var.v.setWebView(x0Var);
                y0 y0Var = d3Var.B0;
                if (y0Var != null) {
                    y0Var.k = x0Var;
                }
                d3Var.m0.setWebView(x0Var);
                d3Var.G();
                break;
            default:
                ((f4) this.T0).J.setWebView(x0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.a1
    public void K(org.telegram.ui.web.x0 x0Var) {
        switch (this.S0) {
            case 0:
                d3 d3Var = (d3) this.T0;
                y0 y0Var = d3Var.B0;
                if (y0Var != null && y0Var.k == x0Var) {
                    y0Var.k = null;
                    y0Var.b();
                }
                d3Var.m0.setWebView(null);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.S0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    f4 f4Var = (f4) this.T0;
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
