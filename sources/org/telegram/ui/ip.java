package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ip implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ kp a;

    public ip(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        kp kpVar = this.a;
        lp lpVar = kpVar.a3;
        if (!(view instanceof na) || (tL_username = ((na) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = lpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, lpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            lpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(lpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getContext(), 0, lpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.t0(19));
        alertDialog$Builder.o();
    }
}
