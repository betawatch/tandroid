package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fa implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ qa a;

    public fa(qa qaVar) {
        this.a = qaVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        boolean z10 = view instanceof na;
        qa qaVar = this.a;
        if (!z10) {
            if (view instanceof ka) {
                qaVar.e0(true);
                return;
            }
            return;
        }
        na naVar = (na) view;
        TLRPC.TL_username tL_username = naVar.v;
        if (tL_username == null || naVar.r) {
            return;
        }
        if (tL_username.editable && qaVar.x == 0) {
            qaVar.b.x0(0);
            qaVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qaVar.getParentActivity(), 0, qaVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new da(this, tL_username, i10, view, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.t0(16));
        alertDialog$Builder.o();
    }
}
