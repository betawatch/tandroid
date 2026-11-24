// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class gqc extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new gqc());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        hqc hqcVar = (hqc) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) c4cVar.H;
        hqcVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                hqcVar.b.p(gl5.p(usc.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            hqcVar.c.setText(tonconnectsession.manifest.name);
            hqcVar.d.setText(gl.J0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new hqc(context, wjbVar);
    }
}
