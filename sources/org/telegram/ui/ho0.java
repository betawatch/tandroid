package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ho0 {
    public final /* synthetic */ so0 a;

    public ho0(so0 so0Var) {
        this.a = so0Var;
    }

    public final void a(Exception exc) {
        so0 so0Var = this.a;
        if (so0Var.Q0) {
            return;
        }
        so0Var.H0(true, false);
        so0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(so0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.e5.w0(so0Var, exc.getMessage());
        }
    }
}
