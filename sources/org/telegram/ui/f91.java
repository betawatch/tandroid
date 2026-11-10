package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f91 implements View.OnClickListener {
    public final /* synthetic */ z91 a;

    public f91(z91 z91Var) {
        this.a = z91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z91 z91Var = this.a;
        if (z91Var.M == 1) {
            org.telegram.ui.Components.u4.g0(z91Var, -z91Var.a, null, z91Var.g(), null, false, z91Var.J, new na(this, 4), z91Var.getResourceProvider());
            return;
        }
        z91Var.getMessagesController().m(z91Var.a, z91Var.getUserConfig().f(), 0, null, z91Var, false, new z81(z91Var, 2), new a91(z91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        z91Var.S0(false);
    }
}
