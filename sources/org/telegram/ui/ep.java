package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ep implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ gp a;

    public ep(gp gpVar) {
        this.a = gpVar;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        gp gpVar = this.a;
        hp hpVar = gpVar.h3;
        if (!(view instanceof pa) || (tL_username = ((pa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = hpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, hpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            hpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(hpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getContext(), 0, hpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new c7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4(9));
        alertDialog$Builder.o();
    }
}
