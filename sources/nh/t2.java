package nh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t2 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ b3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(b3 b3Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = b3Var;
    }

    @Override // org.telegram.ui.web.z0
    public final void A(String str, boolean z10) {
        b3 b3Var = this.L0;
        Paint paint = b3Var.L;
        if (z10) {
            b3Var.i();
            b3Var.Q0.a(UserObject.getUserName(MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D))), str);
            b3Var.Q0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            b3Var.Q0.setBackgroundColor(paint.getColor());
            b3Var.P0 = str;
        }
        org.telegram.ui.h3 h3Var = b3Var.Q0;
        b3Var.O0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.z0
    public final void G(org.telegram.ui.web.w0 w0Var) {
        b3 b3Var = this.L0;
        b3Var.v.setWebView(w0Var);
        x0 x0Var = b3Var.x0;
        if (x0Var != null) {
            x0Var.k = w0Var;
        }
        b3Var.i0.setWebView(w0Var);
        b3Var.F();
    }

    @Override // org.telegram.ui.web.z0
    public final void H(org.telegram.ui.web.w0 w0Var) {
        b3 b3Var = this.L0;
        x0 x0Var = b3Var.x0;
        if (x0Var != null && x0Var.k == w0Var) {
            x0Var.k = null;
            x0Var.b();
        }
        b3Var.i0.setWebView(null);
    }
}
