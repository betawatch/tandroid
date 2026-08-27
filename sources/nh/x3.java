package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x3 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ e4 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(e4 e4Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = e4Var;
    }

    @Override // org.telegram.ui.web.z0
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.F.setWebView(w0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e4 e4Var = this.L0;
            if (!e4Var.L) {
                e4Var.L = true;
                e4Var.n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
