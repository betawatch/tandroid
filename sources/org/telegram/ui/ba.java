package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ba implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ ma a;

    public ba(ma maVar) {
        this.a = maVar;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        boolean z10 = view instanceof ja;
        ma maVar = this.a;
        if (!z10) {
            if (view instanceof ga) {
                maVar.d0(true);
                return;
            }
            return;
        }
        ja jaVar = (ja) view;
        TLRPC.TL_username tL_username = jaVar.v;
        if (tL_username == null || jaVar.r) {
            return;
        }
        if (tL_username.editable && maVar.x == 0) {
            maVar.b.x0(0);
            maVar.d0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(maVar.getParentActivity(), 0, maVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new bg.d0(this, tL_username, i9, view, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(21));
        alertDialog$Builder.o();
    }
}
