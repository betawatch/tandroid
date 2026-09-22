package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rw0 extends ab {
    public rs X;

    public rw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new vb0(this, 7));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(rw0 rw0Var, int i10) {
        y51 G = rw0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(rw0Var.currentAccount).openApp(rw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        rs rsVar = new rs(yl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = rsVar;
        rsVar.r = false;
        return rsVar;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
