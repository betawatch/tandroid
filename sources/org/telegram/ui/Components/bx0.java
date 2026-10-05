package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bx0 extends cb {
    public us X;

    public bx0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        I();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new xb0(this, 7));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void N(bx0 bx0Var, int i10) {
        h61 G = bx0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(bx0Var.currentAccount).openApp(bx0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        us usVar = new us(zl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = usVar;
        usVar.r = false;
        return usVar;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
