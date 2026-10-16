package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ka implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ va a;

    public ka(va vaVar) {
        this.a = vaVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        boolean z10 = view instanceof sa;
        va vaVar = this.a;
        if (!z10) {
            if (view instanceof pa) {
                vaVar.e0(true);
                return;
            }
            return;
        }
        sa saVar = (sa) view;
        TLRPC.TL_username tL_username = saVar.v;
        if (tL_username == null || saVar.r) {
            return;
        }
        if (tL_username.editable && vaVar.x == 0) {
            vaVar.b.x0(0);
            vaVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vaVar.getParentActivity(), 0, vaVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new ia(this, tL_username, i10, view, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(19));
        alertDialog$Builder.o();
    }
}
