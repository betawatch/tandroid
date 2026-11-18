package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.K4, new Object[0]);
        y91Var.S0(false);
    }
}
