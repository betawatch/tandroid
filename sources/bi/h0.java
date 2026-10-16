package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ h0(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                if (h3Var.O != null && !h3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(h3Var.V);
                    h3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h3Var.O;
                    ConnectionsManager.getInstance(h3Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new f0(0, h3Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                h3 h3Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(h3Var2.d0);
                sc scVar = h3Var2.W;
                if (scVar != null) {
                    scVar.b();
                    h3Var2.W = null;
                }
                long j10 = h3Var2.R;
                if (j10 <= 0) {
                    h3Var2.j();
                    break;
                } else {
                    h3Var2.R = 0L;
                    h3Var2.S = true;
                    h3Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                h3 h3Var3 = this.b;
                h3Var3.e.N(true);
                h3Var3.n.N(true);
                break;
        }
    }
}
