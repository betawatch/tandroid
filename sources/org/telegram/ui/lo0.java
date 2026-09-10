package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lo0 {
    public final /* synthetic */ wo0 a;

    public lo0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    public final void a(Exception exc) {
        wo0 wo0Var = this.a;
        if (wo0Var.Q0) {
            return;
        }
        wo0Var.H0(true, false);
        wo0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.d5.w0(wo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.d5.w0(wo0Var, exc.getMessage());
        }
    }
}
