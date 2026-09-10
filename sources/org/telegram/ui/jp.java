package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jp implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ lp a;

    public jp(lp lpVar) {
        this.a = lpVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        lp lpVar = this.a;
        mp mpVar = lpVar.a3;
        if (!(view instanceof oa) || (tL_username = ((oa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = mpVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, mpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            mpVar.a.requestFocus();
            AndroidUtilities.showKeyboard(mpVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getContext(), 0, mpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n2.l(20));
        alertDialog$Builder.o();
    }
}
