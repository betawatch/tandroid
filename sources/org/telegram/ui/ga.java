package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ga implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ ra a;

    public ga(ra raVar) {
        this.a = raVar;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        boolean z10 = view instanceof oa;
        ra raVar = this.a;
        if (!z10) {
            if (view instanceof la) {
                raVar.e0(true);
                return;
            }
            return;
        }
        oa oaVar = (oa) view;
        TLRPC.TL_username tL_username = oaVar.v;
        if (tL_username == null || oaVar.r) {
            return;
        }
        if (tL_username.editable && raVar.x == 0) {
            raVar.b.y0(0);
            raVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new ea(this, tL_username, i10, view, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(23));
        alertDialog$Builder.o();
    }
}
