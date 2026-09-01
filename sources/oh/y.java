package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ y(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h2 h2Var = this.b;
                if (h2Var.L != null && !h2Var.R) {
                    AndroidUtilities.cancelRunOnUIThread(h2Var.S);
                    h2Var.R = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h2Var.L;
                    ConnectionsManager.getInstance(h2Var.K).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new eh.w(7, h2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                h2 h2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(h2Var2.a0);
                ic icVar = h2Var2.T;
                if (icVar != null) {
                    icVar.b();
                    h2Var2.T = null;
                }
                long j10 = h2Var2.O;
                if (j10 <= 0) {
                    h2Var2.j();
                    break;
                } else {
                    h2Var2.O = 0L;
                    h2Var2.P = true;
                    h2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                h2 h2Var3 = this.b;
                h2Var3.e.N(true);
                h2Var3.n.N(true);
                break;
        }
    }
}
