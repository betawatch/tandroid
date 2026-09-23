package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dp implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ fp a;

    public dp(fp fpVar) {
        this.a = fpVar;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        fp fpVar = this.a;
        gp gpVar = fpVar.a3;
        if (!(view instanceof na) || (tL_username = ((na) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = gpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, gpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            gpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(gpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getContext(), 0, gpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Cells.y7(5));
        alertDialog$Builder.o();
    }
}
