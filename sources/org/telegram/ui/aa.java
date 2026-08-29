package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aa implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ la a;

    public aa(la laVar) {
        this.a = laVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        boolean z10 = view instanceof ia;
        la laVar = this.a;
        if (!z10) {
            if (view instanceof fa) {
                laVar.e0(true);
                return;
            }
            return;
        }
        ia iaVar = (ia) view;
        TLRPC.TL_username tL_username = iaVar.v;
        if (tL_username == null || iaVar.r) {
            return;
        }
        if (tL_username.editable && laVar.x == 0) {
            laVar.b.x0(0);
            laVar.e0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(laVar.getParentActivity(), 0, laVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new eg.b0(this, tL_username, i10, view, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(15));
        alertDialog$Builder.o();
    }
}
