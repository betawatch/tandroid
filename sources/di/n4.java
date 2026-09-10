package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n4 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ u4 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(u4 u4Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = u4Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.J.setWebView(y0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u4 u4Var = this.S0;
            if (!u4Var.P) {
                u4Var.P = true;
                u4Var.n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
