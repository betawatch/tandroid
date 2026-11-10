package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fo implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ ho a;

    public fo(ho hoVar) {
        this.a = hoVar;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        ho hoVar = this.a;
        io ioVar = hoVar.h3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (ioVar.fragmentView instanceof ScrollView) {
                ioVar.a.smoothScrollTo(0, ioVar.D.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            ioVar.b.requestFocus();
            org.telegram.messenger.g0.K3(ioVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), ioVar.getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(tL_username.active ? 2131743664 : 2131743671, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(tL_username.active ? 2131743663 : 2131743670, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(tL_username.active ? 2131749325 : 2131745353, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(23));
        alertDialog$Builder.p();
    }
}
