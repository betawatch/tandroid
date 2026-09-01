package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ap implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ dp a;

    public ap(dp dpVar) {
        this.a = dpVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        TLRPC.TL_username tL_username;
        dp dpVar = this.a;
        ep epVar = dpVar.X2;
        if (!(view instanceof ma) || (tL_username = ((ma) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = epVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, epVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            epVar.a.requestFocus();
            AndroidUtilities.showKeyboard(epVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getContext(), 0, epVar.getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.Q = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new d7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh.c3(23));
        alertDialog$Builder.o();
    }
}
