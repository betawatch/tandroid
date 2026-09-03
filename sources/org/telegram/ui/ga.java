package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ga implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ ra a;

    public ga(ra raVar) {
        this.a = raVar;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        boolean z4 = view instanceof oa;
        ra raVar = this.a;
        if (!z4) {
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
            raVar.b.x0(0);
            raVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.Q = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new gg.a0(this, tL_username, i10, view, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(20));
        alertDialog$Builder.o();
    }
}
