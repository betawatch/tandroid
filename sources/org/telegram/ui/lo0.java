package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            org.telegram.ui.Components.c5.w0(wo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.c5.w0(wo0Var, exc.getMessage());
        }
    }
}
