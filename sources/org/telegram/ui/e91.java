package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e91 implements View.OnClickListener {
    public final /* synthetic */ y91 a;

    public e91(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y91 y91Var = this.a;
        if (y91Var.N == 1) {
            org.telegram.ui.Components.b5.g0(y91Var, -y91Var.a, null, y91Var.g(), null, false, y91Var.K, new na(this, 4), y91Var.getResourceProvider());
            return;
        }
        y91Var.getMessagesController().m(y91Var.a, y91Var.getUserConfig().f(), 0, null, y91Var, false, new y81(y91Var, 2), new z81(y91Var), null);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.L4, new Object[0]);
        y91Var.S0(false);
    }
}
