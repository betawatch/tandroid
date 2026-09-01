package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gw0 extends sa {
    public rs U;

    public gw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.y = true;
        J();
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new nb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(gw0 gw0Var, int i10) {
        j51 G = gw0Var.U.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(gw0Var.currentAccount).openApp(gw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        rs rsVar = new rs(tl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = rsVar;
        rsVar.r = false;
        return rsVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
