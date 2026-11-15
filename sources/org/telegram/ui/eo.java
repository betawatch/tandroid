package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class eo implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ go a;

    public eo(go goVar) {
        this.a = goVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        TLRPC.TL_username tL_username;
        go goVar = this.a;
        ho hoVar = goVar.i3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (hoVar.fragmentView instanceof ScrollView) {
                hoVar.a.smoothScrollTo(0, hoVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            hoVar.b.requestFocus();
            org.telegram.messenger.g0.J3(hoVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, goVar.getContext(), hoVar.getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(tL_username.active ? 2131743664 : 2131743671, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(tL_username.active ? 2131743663 : 2131743670, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(tL_username.active ? 2131749325 : 2131745353, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(27));
        alertDialog$Builder.p();
    }
}
