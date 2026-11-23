package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c91 implements View.OnClickListener {
    public final /* synthetic */ w91 a;

    public c91(w91 w91Var) {
        this.a = w91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w91 w91Var = this.a;
        if (w91Var.N == 1) {
            org.telegram.ui.Components.b5.g0(w91Var, -w91Var.a, null, w91Var.g(), null, false, w91Var.K, new na(this, 4), w91Var.getResourceProvider());
            return;
        }
        w91Var.getMessagesController().m(w91Var.a, w91Var.getUserConfig().f(), 0, null, w91Var, false, new w81(w91Var, 2), new x81(w91Var), null);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.L4, new Object[0]);
        w91Var.S0(false);
    }
}
