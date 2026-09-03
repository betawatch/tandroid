package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cp implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ ep a;

    public cp(ep epVar) {
        this.a = epVar;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        ep epVar = this.a;
        fp fpVar = epVar.X2;
        if (!(view instanceof oa) || (tL_username = ((oa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = fpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, fpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            fpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(fpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getContext(), 0, fpVar.getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.Q = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new f7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(23));
        alertDialog$Builder.o();
    }
}
