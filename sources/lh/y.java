package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ y(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                if (f2Var.K != null && !f2Var.Q) {
                    AndroidUtilities.cancelRunOnUIThread(f2Var.R);
                    f2Var.Q = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = f2Var.K;
                    ConnectionsManager.getInstance(f2Var.J).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new bh.v(7, f2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                f2 f2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(f2Var2.W);
                mc mcVar = f2Var2.S;
                if (mcVar != null) {
                    mcVar.b();
                    f2Var2.S = null;
                }
                long j10 = f2Var2.N;
                if (j10 <= 0) {
                    f2Var2.j();
                    break;
                } else {
                    f2Var2.N = 0L;
                    f2Var2.O = true;
                    f2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                f2 f2Var3 = this.b;
                f2Var3.e.N(true);
                f2Var3.n.N(true);
                break;
        }
    }
}
