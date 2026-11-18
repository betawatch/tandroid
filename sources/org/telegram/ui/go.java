package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class go implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ io a;

    public go(io ioVar) {
        this.a = ioVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        io ioVar = this.a;
        jo joVar = ioVar.i3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (joVar.fragmentView instanceof ScrollView) {
                joVar.a.smoothScrollTo(0, joVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            joVar.b.requestFocus();
            org.telegram.messenger.g0.I3(joVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), joVar.getResourceProvider());
        String M0 = org.telegram.messenger.gd.M0(tL_username.active ? 2131743427 : 2131743434, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(tL_username.active ? 2131743426 : 2131743433, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(tL_username.active ? 2131749133 : 2131745158, null), new z6(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(28));
        alertDialog$Builder.p();
    }
}
