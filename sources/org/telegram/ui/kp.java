package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kp implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ mp a;

    public kp(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        mp mpVar = this.a;
        np npVar = mpVar.Y2;
        if (!(view instanceof sa) || (tL_username = ((sa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = npVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, npVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            npVar.a.requestFocus();
            AndroidUtilities.showKeyboard(npVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getContext(), 0, npVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new f7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.w0(24));
        alertDialog$Builder.o();
    }
}
