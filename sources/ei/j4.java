package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class j4 extends org.telegram.ui.web.d1 {
    public final /* synthetic */ q4 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(q4 q4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = q4Var;
    }

    @Override // org.telegram.ui.web.d1
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.J.setWebView(z0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q4 q4Var = this.S0;
            if (!q4Var.P) {
                q4Var.P = true;
                q4Var.n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
