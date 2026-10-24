package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dx0 extends bb {
    public at X;

    public dx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kv(this, 10));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(dx0 dx0Var, int i10) {
        m61 G = dx0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(dx0Var.currentAccount).openApp(dx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        at atVar = new at(mm0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = atVar;
        atVar.r = false;
        return atVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
