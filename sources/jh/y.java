package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ y(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                if (g2Var.K != null && !g2Var.Q) {
                    AndroidUtilities.cancelRunOnUIThread(g2Var.R);
                    g2Var.Q = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = g2Var.K;
                    ConnectionsManager.getInstance(g2Var.J).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new cg.u0(6, g2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                g2 g2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(g2Var2.W);
                ec ecVar = g2Var2.S;
                if (ecVar != null) {
                    ecVar.b();
                    g2Var2.S = null;
                }
                long j10 = g2Var2.N;
                if (j10 <= 0) {
                    g2Var2.j();
                    break;
                } else {
                    g2Var2.N = 0L;
                    g2Var2.O = true;
                    g2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                g2 g2Var3 = this.b;
                g2Var3.e.N(true);
                g2Var3.n.N(true);
                break;
        }
    }
}
