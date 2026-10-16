package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class po0 {
    public final /* synthetic */ ap0 a;

    public po0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    public final void a(Exception exc) {
        ap0 ap0Var = this.a;
        if (ap0Var.Q0) {
            return;
        }
        ap0Var.H0(true, false);
        ap0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.g5.v0(ap0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.g5.v0(ap0Var, exc.getMessage());
        }
    }
}
