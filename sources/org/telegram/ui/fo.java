package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fo implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ ho a;

    public fo(ho hoVar) {
        this.a = hoVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        TLRPC.TL_username tL_username;
        ho hoVar = this.a;
        io ioVar = hoVar.i3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (ioVar.fragmentView instanceof ScrollView) {
                ioVar.a.smoothScrollTo(0, ioVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            ioVar.b.requestFocus();
            org.telegram.messenger.g0.I3(ioVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), ioVar.getResourceProvider());
        String N0 = org.telegram.messenger.gd.N0(tL_username.active ? 2131743417 : 2131743424, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(tL_username.active ? 2131743416 : 2131743423, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(tL_username.active ? 2131749132 : 2131745157, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(28));
        alertDialog$Builder.p();
    }
}
