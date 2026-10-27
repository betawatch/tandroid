package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ia implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ ta a;

    public ia(ta taVar) {
        this.a = taVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        boolean z10 = view instanceof qa;
        ta taVar = this.a;
        if (!z10) {
            if (view instanceof na) {
                taVar.f0(true);
                return;
            }
            return;
        }
        qa qaVar = (qa) view;
        TLRPC.TL_username tL_username = qaVar.v;
        if (tL_username == null || qaVar.r) {
            return;
        }
        if (tL_username.editable && taVar.x == 0) {
            taVar.b.y0(0);
            taVar.f0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(taVar.getParentActivity(), 0, taVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new ag.k0(this, tL_username, i10, view, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.x0(27));
        alertDialog$Builder.p();
    }
}
