package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        String M0 = org.telegram.messenger.hd.M0(tL_username.active ? 2131743665 : 2131743672, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(tL_username.active ? 2131743664 : 2131743671, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(tL_username.active ? 2131749324 : 2131745354, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.ch(23));
        alertDialog$Builder.p();
    }
}
