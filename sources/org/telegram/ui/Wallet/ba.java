package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class ba extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new ba());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ca caVar = (ca) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) m61Var.G;
        caVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                caVar.b.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            caVar.c.setText(tonconnectsession.manifest.name);
            caVar.d.setText(AndroidUtilities.getHostAuthority(tonconnectsession.manifest.url));
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ca(context, g6Var);
    }
}
