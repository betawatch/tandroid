package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class no0 {
    public final /* synthetic */ yo0 a;

    public no0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    public final void a(Exception exc) {
        yo0 yo0Var = this.a;
        if (yo0Var.Q0) {
            return;
        }
        yo0Var.H0(true, false);
        yo0Var.D0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.c5.w0(yo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.c5.w0(yo0Var, exc.getMessage());
        }
    }
}
