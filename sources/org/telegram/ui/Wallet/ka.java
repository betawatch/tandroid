package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.b30;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ka extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new ka());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        la laVar = (la) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) a51Var.G;
        laVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                laVar.b.p(ic.p(b30.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            laVar.c.setText(tonconnectsession.manifest.name);
            laVar.d.setText(org.telegram.messenger.i0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new la(context, p6Var);
    }
}
