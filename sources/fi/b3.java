package fi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ int S0;
    public final /* synthetic */ Object T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i10, int i11, Context context, Object obj, c6 c6Var) {
        super(i10, context, c6Var, true);
        this.S0 = i11;
        this.T0 = obj;
    }

    @Override // org.telegram.ui.web.c1
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
                org.telegram.ui.f3 f3Var = k3Var.U0;
                k3Var.S0 = z10;
                AndroidUtilities.updateViewVisibilityAnimated(f3Var, z10, 1.0f, false);
                invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.web.c1
    public final void J(org.telegram.ui.web.z0 z0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                k3Var.v.setWebView(z0Var);
                z0 z0Var2 = k3Var.B0;
                if (z0Var2 != null) {
                    z0Var2.k = z0Var;
                }
                k3Var.m0.setWebView(z0Var);
                k3Var.G();
                break;
            default:
                ((q4) this.T0).J.setWebView(z0Var);
                break;
        }
    }

    @Override // org.telegram.ui.web.c1
    public void K(org.telegram.ui.web.z0 z0Var) {
        switch (this.S0) {
            case 0:
                k3 k3Var = (k3) this.T0;
                z0 z0Var2 = k3Var.B0;
                if (z0Var2 != null && z0Var2.k == z0Var) {
                    z0Var2.k = null;
                    z0Var2.b();
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
                    q4 q4Var = (q4) this.T0;
                    if (!q4Var.P) {
                        q4Var.P = true;
                        q4Var.n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
