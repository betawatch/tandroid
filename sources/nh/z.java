package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ z(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                if (g2Var.L != null && !g2Var.R) {
                    AndroidUtilities.cancelRunOnUIThread(g2Var.S);
                    g2Var.R = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = g2Var.L;
                    ConnectionsManager.getInstance(g2Var.K).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new dh.v(7, g2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                g2 g2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(g2Var2.a0);
                ic icVar = g2Var2.T;
                if (icVar != null) {
                    icVar.b();
                    g2Var2.T = null;
                }
                long j10 = g2Var2.O;
                if (j10 <= 0) {
                    g2Var2.j();
                    break;
                } else {
                    g2Var2.O = 0L;
                    g2Var2.P = true;
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
