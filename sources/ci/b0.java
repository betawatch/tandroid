package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ b0(n2 n2Var, int i10) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                if (n2Var.O != null && !n2Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var.V);
                    n2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = n2Var.O;
                    ConnectionsManager.getInstance(n2Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new ai.r5(4, n2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                n2 n2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(n2Var2.d0);
                qc qcVar = n2Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    n2Var2.W = null;
                }
                long j10 = n2Var2.R;
                if (j10 <= 0) {
                    n2Var2.j();
                    break;
                } else {
                    n2Var2.R = 0L;
                    n2Var2.S = true;
                    n2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                n2 n2Var3 = this.b;
                n2Var3.e.N(true);
                n2Var3.n.N(true);
                break;
        }
    }
}
