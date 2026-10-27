package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class go0 {
    public final /* synthetic */ ro0 a;

    public go0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    public final void a(Exception exc) {
        ro0 ro0Var = this.a;
        if (ro0Var.Q0) {
            return;
        }
        ro0Var.I0(true, false);
        ro0Var.E0(false);
        if ((exc instanceof wc.a) || (exc instanceof wc.b)) {
            org.telegram.ui.Components.g5.v0(ro0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.g5.v0(ro0Var, exc.getMessage());
        }
    }
}
