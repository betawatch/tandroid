package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fw0 extends za {
    public rs X;

    public fw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kb0(this, 7));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(fw0 fw0Var, int i10) {
        j51 G = fw0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(fw0Var.currentAccount).openApp(fw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        rs rsVar = new rs(ml0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = rsVar;
        rsVar.r = false;
        return rsVar;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
