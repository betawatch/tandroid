package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rw0 extends bb {
    public ts X;

    public rw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        K();
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new wg0(this, 5));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void P(rw0 rw0Var, int i10) {
        x51 G = rw0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(rw0Var.currentAccount).openApp(rw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final xl0 v(yl0 yl0Var) {
        ts tsVar = new ts(yl0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = tsVar;
        tsVar.r = false;
        return tsVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }
}
