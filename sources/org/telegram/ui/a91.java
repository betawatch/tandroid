package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a91 implements View.OnClickListener {
    public final /* synthetic */ u91 a;

    public a91(u91 u91Var) {
        this.a = u91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u91 u91Var = this.a;
        if (u91Var.N == 1) {
            org.telegram.ui.Components.t4.g0(u91Var, -u91Var.a, null, u91Var.g(), null, false, u91Var.K, new na(this, 4), u91Var.getResourceProvider());
            return;
        }
        u91Var.getMessagesController().m(u91Var.a, u91Var.getUserConfig().f(), 0, null, u91Var, false, new u81(u91Var, 2), new v81(u91Var), null);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.I4, new Object[0]);
        u91Var.S0(false);
    }
}
