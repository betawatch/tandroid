package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hc;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class ha extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new ha());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ia iaVar = (ia) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) x31Var.G;
        iaVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                iaVar.b.p(hc.p(m20.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            iaVar.c.setText(tonconnectsession.manifest.name);
            iaVar.d.setText(org.telegram.messenger.g0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ia(context, h6Var);
    }
}
