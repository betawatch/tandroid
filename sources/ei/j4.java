package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
