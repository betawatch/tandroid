package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class co implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ fo a;

    public co(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        fo foVar = this.a;
        go goVar = foVar.h3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (goVar.fragmentView instanceof ScrollView) {
                goVar.a.smoothScrollTo(0, goVar.D.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            goVar.b.requestFocus();
            org.telegram.messenger.g0.K3(goVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, foVar.getContext(), goVar.getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(tL_username.active ? 2131743667 : 2131743674, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(tL_username.active ? 2131743666 : 2131743673, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(tL_username.active ? 2131749326 : 2131745356, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(23));
        alertDialog$Builder.p();
    }
}
