package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
            org.telegram.ui.Components.d5.w0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.d5.w0(xo0Var, exc.getMessage());
        }
    }
}
