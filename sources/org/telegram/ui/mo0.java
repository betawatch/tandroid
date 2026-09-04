package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mo0 {
    public final /* synthetic */ xo0 a;

    public mo0(xo0 xo0Var) {
        this.a = xo0Var;
    }

    public final void a(Exception exc) {
        xo0 xo0Var = this.a;
        if (xo0Var.Q0) {
            return;
        }
        xo0Var.H0(true, false);
        xo0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.e5.w0(xo0Var, exc.getMessage());
        }
    }
}
