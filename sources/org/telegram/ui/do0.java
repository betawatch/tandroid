package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class do0 {
    public final /* synthetic */ oo0 a;

    public do0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    public final void a(Exception exc) {
        oo0 oo0Var = this.a;
        if (oo0Var.Q0) {
            return;
        }
        oo0Var.H0(true, false);
        oo0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(oo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.e5.w0(oo0Var, exc.getMessage());
        }
    }
}
