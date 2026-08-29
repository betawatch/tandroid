package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wv0 extends xa {
    public ls T;

    public wv0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.A = true;
        this.y = true;
        J();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new h00(this, 8));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(wv0 wv0Var, int i10) {
        w41 G = wv0Var.T.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(wv0Var.currentAccount).openApp(wv0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        ls lsVar = new ls(jl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.T = lsVar;
        lsVar.r = false;
        return lsVar;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
