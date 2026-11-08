package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d91 implements View.OnClickListener {
    public final /* synthetic */ w91 a;

    public d91(w91 w91Var) {
        this.a = w91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w91 w91Var = this.a;
        if (w91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(w91Var, -w91Var.a, null, w91Var.g(), null, false, w91Var.J, new na(this, 4), w91Var.getResourceProvider());
            return;
        }
        w91Var.getMessagesController().m(w91Var.a, w91Var.getUserConfig().f(), 0, null, w91Var, false, new x81(w91Var, 2), new y81(w91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        w91Var.S0(false);
    }
}
