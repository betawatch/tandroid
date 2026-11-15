package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gc;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class ia extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new ia());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ja jaVar = (ja) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) b41Var.G;
        jaVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                jaVar.b.p(gc.p(k20.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            jaVar.c.setText(tonconnectsession.manifest.name);
            jaVar.d.setText(org.telegram.messenger.g0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ja(context, e6Var);
    }
}
