package di;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ n3 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(n3 n3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.S0 = n3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void E(String str, boolean z10) {
        n3 n3Var = this.S0;
        Paint paint = n3Var.P;
        if (z10) {
            n3Var.i();
            n3Var.U0.a(UserObject.getUserName(MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H))), str);
            n3Var.U0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            n3Var.U0.setBackgroundColor(paint.getColor());
            n3Var.T0 = str;
        }
        org.telegram.ui.e3 e3Var = n3Var.U0;
        n3Var.S0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(e3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        n3 n3Var = this.S0;
        n3Var.v.setWebView(y0Var);
        d1 d1Var = n3Var.B0;
        if (d1Var != null) {
            d1Var.k = y0Var;
        }
        n3Var.m0.setWebView(y0Var);
        n3Var.F();
    }

    @Override // org.telegram.ui.web.c1
    public final void L(org.telegram.ui.web.y0 y0Var) {
        n3 n3Var = this.S0;
        d1 d1Var = n3Var.B0;
        if (d1Var != null && d1Var.k == y0Var) {
            d1Var.k = null;
            d1Var.b();
        }
        n3Var.m0.setWebView(null);
    }
}
