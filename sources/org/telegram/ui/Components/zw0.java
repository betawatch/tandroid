package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zw0 extends bb {
    public at X;

    public zw0(Context context) {
        super(context, null, true, false, null);
        fixNavigationBar();
        this.E = true;
        this.y = true;
        L();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.j(new kv(this, 10));
        this.d.setOnItemClickListener(new j(this, 14));
    }

    public static void Q(zw0 zw0Var, int i10) {
        g61 G = zw0Var.X.G(i10 - 1);
        Object obj = G != null ? G.G : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(zw0Var.currentAccount).openApp(zw0Var.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        at atVar = new at(im0Var, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.X = atVar;
        atVar.r = false;
        return atVar;
    }
}
