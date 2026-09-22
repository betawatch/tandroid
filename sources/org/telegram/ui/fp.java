package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fp implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ hp a;

    public fp(hp hpVar) {
        this.a = hpVar;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        hp hpVar = this.a;
        ip ipVar = hpVar.a3;
        if (!(view instanceof oa) || (tL_username = ((oa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = ipVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, ipVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            ipVar.a.requestFocus();
            AndroidUtilities.showKeyboard(ipVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getContext(), 0, ipVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(26));
        alertDialog$Builder.o();
    }
}
