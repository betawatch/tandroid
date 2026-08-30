package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ap implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ cp a;

    public ap(cp cpVar) {
        this.a = cpVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        TLRPC.TL_username tL_username;
        cp cpVar = this.a;
        dp dpVar = cpVar.X2;
        if (!(view instanceof ma) || (tL_username = ((ma) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = dpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, dpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            dpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(dpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getContext(), 0, dpVar.getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.Q = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new d7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(23));
        alertDialog$Builder.o();
    }
}
