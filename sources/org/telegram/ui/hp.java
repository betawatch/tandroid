package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hp implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ jp a;

    public hp(jp jpVar) {
        this.a = jpVar;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        jp jpVar = this.a;
        kp kpVar = jpVar.a3;
        if (!(view instanceof pa) || (tL_username = ((pa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = kpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, kpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            kpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(kpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jpVar.getContext(), 0, kpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new c7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(22));
        alertDialog$Builder.o();
    }
}
