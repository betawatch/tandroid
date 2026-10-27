package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lx0 extends bb {
    public ct X;

    public lx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new ml(this, 15));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(lx0 lx0Var, int i10) {
        u61 G = lx0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(lx0Var.currentAccount).openApp(lx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        ct ctVar = new ct(nm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = ctVar;
        ctVar.r = false;
        return ctVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
