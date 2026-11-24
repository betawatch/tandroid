// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class isc extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new isc());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        jsc jscVar = (jsc) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) c6cVar.H;
        jscVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                jscVar.b.p(gn5.p(vuc.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            jscVar.c.setText(tonconnectsession.manifest.name);
            jscVar.d.setText(gm.J0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new jsc(context, ylbVar);
    }
}
