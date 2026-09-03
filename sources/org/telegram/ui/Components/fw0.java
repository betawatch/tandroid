package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fw0 extends sa {
    public rs U;

    public fw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.y = true;
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new nb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(fw0 fw0Var, int i10) {
        h51 G = fw0Var.U.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(fw0Var.currentAccount).openApp(fw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        rs rsVar = new rs(sl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = rsVar;
        rsVar.r = false;
        return rsVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
