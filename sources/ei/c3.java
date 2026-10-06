package ei;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class c3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ l3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(l3 l3Var, Context context, d6 d6Var, int i10) {
        super(i10, context, d6Var, true);
        this.S0 = l3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void E(String str, boolean z10) {
        l3 l3Var = this.S0;
        Paint paint = l3Var.P;
        if (z10) {
            l3Var.i();
            l3Var.U0.a(UserObject.getUserName(MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H))), str);
            l3Var.U0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            l3Var.U0.setBackgroundColor(paint.getColor());
            l3Var.T0 = str;
        }
        org.telegram.ui.d3 d3Var = l3Var.U0;
        l3Var.S0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(d3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.z0 z0Var) {
        l3 l3Var = this.S0;
        l3Var.v.setWebView(z0Var);
        b1 b1Var = l3Var.B0;
        if (b1Var != null) {
            b1Var.k = z0Var;
        }
        l3Var.m0.setWebView(z0Var);
        l3Var.F();
    }

    @Override // org.telegram.ui.web.c1
    public final void L(org.telegram.ui.web.z0 z0Var) {
        l3 l3Var = this.S0;
        b1 b1Var = l3Var.B0;
        if (b1Var != null && b1Var.k == z0Var) {
            b1Var.k = null;
            b1Var.b();
        }
        l3Var.m0.setWebView(null);
    }
}
