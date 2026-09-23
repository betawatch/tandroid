package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fo0 {
    public final /* synthetic */ qo0 a;

    public fo0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    public final void a(Exception exc) {
        qo0 qo0Var = this.a;
        if (qo0Var.Q0) {
            return;
        }
        qo0Var.H0(true, false);
        qo0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(qo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.e5.w0(qo0Var, exc.getMessage());
        }
    }
}
