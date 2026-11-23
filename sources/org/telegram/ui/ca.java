package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ca implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ la a;

    public ca(la laVar) {
        this.a = laVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        boolean z10 = view instanceof ia;
        la laVar = this.a;
        if (!z10) {
            if (view instanceof ga) {
                laVar.j0(true);
                return;
            }
            return;
        }
        ia iaVar = (ia) view;
        TLRPC.TL_username tL_username = iaVar.w;
        if (tL_username == null || iaVar.r) {
            return;
        }
        if (tL_username.editable && laVar.y == 0) {
            laVar.b.y0(0);
            laVar.j0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
        String N0 = org.telegram.messenger.hd.N0(tL_username.active ? 2131743419 : 2131743426, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(tL_username.active ? 2131743417 : 2131743424, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(tL_username.active ? 2131749132 : 2131745157, null), new bg.g0(this, tL_username, i7, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.messenger.fd(23));
        alertDialog$Builder.p();
    }
}
