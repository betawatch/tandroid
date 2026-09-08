package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dw0 extends bb {
    public qs X;

    public dw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new lb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(dw0 dw0Var, int i10) {
        h51 G = dw0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(dw0Var.currentAccount).openApp(dw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        qs qsVar = new qs(ll0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = qsVar;
        qsVar.r = false;
        return qsVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
