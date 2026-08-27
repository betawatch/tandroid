package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ca implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ na a;

    public ca(na naVar) {
        this.a = naVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        boolean z10 = view instanceof ka;
        na naVar = this.a;
        if (!z10) {
            if (view instanceof ha) {
                naVar.e0(true);
                return;
            }
            return;
        }
        ka kaVar = (ka) view;
        TLRPC.TL_username tL_username = kaVar.v;
        if (tL_username == null || kaVar.r) {
            return;
        }
        if (tL_username.editable && naVar.x == 0) {
            naVar.b.x0(0);
            naVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(naVar.getParentActivity(), 0, naVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new cg.a0(this, tL_username, i10, view, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ng.a(26));
        alertDialog$Builder.o();
    }
}
