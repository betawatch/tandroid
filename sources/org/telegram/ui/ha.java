package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ha implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ sa a;

    public ha(sa saVar) {
        this.a = saVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        boolean z10 = view instanceof pa;
        sa saVar = this.a;
        if (!z10) {
            if (view instanceof ma) {
                saVar.e0(true);
                return;
            }
            return;
        }
        pa paVar = (pa) view;
        TLRPC.TL_username tL_username = paVar.v;
        if (tL_username == null || paVar.r) {
            return;
        }
        if (tL_username.editable && saVar.x == 0) {
            saVar.b.x0(0);
            saVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(saVar.getParentActivity(), 0, saVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new fa(this, tL_username, i10, view, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(25));
        alertDialog$Builder.p();
    }
}
