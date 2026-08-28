package mh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u2 extends org.telegram.ui.web.y0 {
    public final /* synthetic */ c3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(c3 c3Var, Context context, b6 b6Var, int i9) {
        super(i9, context, b6Var, true);
        this.L0 = c3Var;
    }

    @Override // org.telegram.ui.web.y0
    public final void A(String str, boolean z10) {
        c3 c3Var = this.L0;
        Paint paint = c3Var.L;
        if (z10) {
            c3Var.i();
            c3Var.Q0.a(UserObject.getUserName(MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D))), str);
            c3Var.Q0.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            c3Var.Q0.setBackgroundColor(paint.getColor());
            c3Var.P0 = str;
        }
        org.telegram.ui.g3 g3Var = c3Var.Q0;
        c3Var.O0 = z10;
        AndroidUtilities.updateViewVisibilityAnimated(g3Var, z10, 1.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.web.y0
    public final void G(org.telegram.ui.web.v0 v0Var) {
        c3 c3Var = this.L0;
        c3Var.v.setWebView(v0Var);
        y0 y0Var = c3Var.x0;
        if (y0Var != null) {
            y0Var.k = v0Var;
        }
        c3Var.i0.setWebView(v0Var);
        c3Var.F();
    }

    @Override // org.telegram.ui.web.y0
    public final void H(org.telegram.ui.web.v0 v0Var) {
        c3 c3Var = this.L0;
        y0 y0Var = c3Var.x0;
        if (y0Var != null && y0Var.k == v0Var) {
            y0Var.k = null;
            y0Var.b();
        }
        c3Var.i0.setWebView(null);
    }
}
