package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mv0 extends sa {
    public hs T;

    public mv0(Context context) {
        super(context, null, true, false, false, 1, null);
        fixNavigationBar();
        this.A = true;
        this.y = true;
        J();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.j(new kn(this, 12));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void O(mv0 mv0Var, int i9) {
        l41 G = mv0Var.T.G(i9 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(mv0Var.currentAccount).openApp(mv0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        hs hsVar = new hs(wk0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.T = hsVar;
        hsVar.r = false;
        return hsVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
