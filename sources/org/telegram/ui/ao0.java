package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ao0 {
    public final /* synthetic */ lo0 a;

    public ao0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    public final void a(Exception exc) {
        lo0 lo0Var = this.a;
        if (lo0Var.N0) {
            return;
        }
        lo0Var.H0(true, false);
        lo0Var.D0(false);
        if ((exc instanceof fc.a) || (exc instanceof fc.b)) {
            org.telegram.ui.Components.z4.w0(lo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.z4.w0(lo0Var, exc.getMessage());
        }
    }
}
