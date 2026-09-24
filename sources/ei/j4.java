package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class j4 extends org.telegram.ui.web.b1 {
    public final /* synthetic */ q4 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(q4 q4Var, Context context, d6 d6Var, int i10) {
        super(i10, context, d6Var, true);
        this.S0 = q4Var;
    }

    @Override // org.telegram.ui.web.b1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.J.setWebView(y0Var);
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
