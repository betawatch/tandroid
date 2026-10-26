package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class eo0 {
    public final /* synthetic */ po0 a;

    public eo0(po0 po0Var) {
        this.a = po0Var;
    }

    public final void a(Exception exc) {
        po0 po0Var = this.a;
        if (po0Var.Q0) {
            return;
        }
        po0Var.I0(true, false);
        po0Var.E0(false);
        if ((exc instanceof wc.a) || (exc instanceof wc.b)) {
            org.telegram.ui.Components.g5.v0(po0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.g5.v0(po0Var, exc.getMessage());
        }
    }
}
