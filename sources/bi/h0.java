package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ h0(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                if (e3Var.O != null && !e3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(e3Var.V);
                    e3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = e3Var.O;
                    ConnectionsManager.getInstance(e3Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new f0(0, e3Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                e3 e3Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(e3Var2.d0);
                qc qcVar = e3Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    e3Var2.W = null;
                }
                long j3 = e3Var2.R;
                if (j3 <= 0) {
                    e3Var2.j();
                    break;
                } else {
                    e3Var2.R = 0L;
                    e3Var2.S = true;
                    e3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                e3 e3Var3 = this.b;
                e3Var3.e.N(true);
                e3Var3.n.N(true);
                break;
        }
    }
}
