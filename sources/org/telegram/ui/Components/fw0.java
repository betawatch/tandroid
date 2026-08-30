package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fw0 extends sa {
    public ps U;

    public fw0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.B = true;
        this.y = true;
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new lb0(this, 6));
        this.d.setOnItemClickListener(new k(this, 14));
    }

    public static void P(fw0 fw0Var, int i10) {
        i51 G = fw0Var.U.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(fw0Var.currentAccount).openApp(fw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        ps psVar = new ps(sl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.U = psVar;
        psVar.r = false;
        return psVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
