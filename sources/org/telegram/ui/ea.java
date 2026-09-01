package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ea implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ pa a;

    public ea(pa paVar) {
        this.a = paVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        boolean z4 = view instanceof ma;
        pa paVar = this.a;
        if (!z4) {
            if (view instanceof ja) {
                paVar.e0(true);
                return;
            }
            return;
        }
        ma maVar = (ma) view;
        TLRPC.TL_username tL_username = maVar.v;
        if (tL_username == null || maVar.r) {
            return;
        }
        if (tL_username.editable && paVar.x == 0) {
            paVar.b.x0(0);
            paVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(paVar.getParentActivity(), 0, paVar.getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.Q = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new hg.a0(this, tL_username, i10, view, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh.c3(20));
        alertDialog$Builder.o();
    }
}
