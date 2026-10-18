package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ja implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ ua a;

    public ja(ua uaVar) {
        this.a = uaVar;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        boolean z10 = view instanceof ra;
        ua uaVar = this.a;
        if (!z10) {
            if (view instanceof oa) {
                uaVar.e0(true);
                return;
            }
            return;
        }
        ra raVar = (ra) view;
        TLRPC.TL_username tL_username = raVar.v;
        if (tL_username == null || raVar.r) {
            return;
        }
        if (tL_username.editable && uaVar.x == 0) {
            uaVar.b.x0(0);
            uaVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uaVar.getParentActivity(), 0, uaVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new ha(this, tL_username, i10, view, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(21));
        alertDialog$Builder.o();
    }
}
