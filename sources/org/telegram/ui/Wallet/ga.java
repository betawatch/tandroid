package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hc;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class ga extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new ga());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ha haVar = (ha) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) x31Var.G;
        haVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                haVar.b.p(hc.p(m20.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            haVar.c.setText(tonconnectsession.manifest.name);
            haVar.d.setText(org.telegram.messenger.g0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ha(context, f6Var);
    }
}
