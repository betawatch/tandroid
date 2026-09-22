package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ew0 extends za {
    public rs X;

    public ew0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kb0(this, 6));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(ew0 ew0Var, int i10) {
        i51 G = ew0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(ew0Var.currentAccount).openApp(ew0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        rs rsVar = new rs(ll0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = rsVar;
        rsVar.r = false;
        return rsVar;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
