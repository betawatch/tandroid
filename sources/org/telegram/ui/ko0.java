package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ko0 {
    public final /* synthetic */ vo0 a;

    public ko0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    public final void a(Exception exc) {
        vo0 vo0Var = this.a;
        if (vo0Var.Q0) {
            return;
        }
        vo0Var.H0(true, false);
        vo0Var.D0(false);
        if ((exc instanceof uc.a) || (exc instanceof uc.b)) {
            org.telegram.ui.Components.g5.v0(vo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.g5.v0(vo0Var, exc.getMessage());
        }
    }
}
